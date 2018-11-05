package myApp;
import java.sql.*;

public class DbOrder {
	public static void showOrders(){
		DbConnector db = new DbConnector();
		Connection conn = db.connect();
		try (Statement stmt = conn.createStatement();) {
		         // Step 3: Execute a SQL SELECT query, the query result
		         //  is returned in a 'ResultSet' object.
		         String str = "select o.ID, concat(c.name , \" \", c.surname) as name, p.name as product_name, o.count from client c\n" + 
			         		"join `order` o on o.client_id=c.ID\n" + 
			         		"join product p on o.product_id=p.ID\n";
		         ResultSet rset = stmt.executeQuery(str);
		         while(rset.next()) {   // Move the cursor to the next row, return false if no more row
		        	 String ID = rset.getString("ID");
		             String name = rset.getString("name");
		             String product_name = rset.getString("product_name");
		             String count = rset.getString("count");
		             System.out.println(ID + ", " + name + ", " + product_name + ", " + count);
		          }
		     } 			
			catch(SQLException ex) {
		        ex.printStackTrace();
		    }
	}
	public static String insertOrder(int client, int product, int count){
		String result ="";
		DbConnector db = new DbConnector();
		Connection conn = db.connect();
		try (Statement stmt = conn.createStatement();) {
		         String strInsert = "INSERT INTO `mydb`.`order` (`client_id`, `product_id`, `count`)"
		         		+ " VALUES ("+client+", "+product+", "+count+");";
		         stmt.executeUpdate(strInsert);
		         result = Integer.toString(client)+" "+Integer.toString(product)+" "+Integer.toString(count);
		     } 			
			catch(SQLException ex) {
		        ex.printStackTrace();
		    }
		return result;
	}
	public static void showInvoice(int id){
		DbConnector db = new DbConnector();
		Connection conn = db.connect();
		try (Statement stmt = conn.createStatement();) {
		         String str = "select concat(c.name , \" \", c.surname) as name from client c\n" + 
		         		"join `order` o on o.client_id=c.ID\n" + 
		         		"join product p on o.product_id=p.ID\n" + 
		         		"where o.ID="+id+";";
		         ResultSet rset = stmt.executeQuery(str);
		         String name="";
		         while(rset.next()) {   // Move the cursor to the next row, return false if no more row
		             name = rset.getString("name");
		          }
		         str = "select c.nip from client c\n" + 
			         		"join `order` o on o.client_id=c.ID\n" + 
			         		"join product p on o.product_id=p.ID\n" + 
			         		"where o.ID="+id+";";
		         rset = stmt.executeQuery(str);
		         String nip = "";
		         while(rset.next()) {   // Move the cursor to the next row, return false if no more row
		             nip = rset.getString("nip");
		          }
		         str = "select c.adres from client c\n" + 
			         		"join `order` o on o.client_id=c.ID\n" + 
			         		"join product p on o.product_id=p.ID\n" + 
			         		"where o.ID="+id+";";
		         rset = stmt.executeQuery(str);
		         String adres = "";
		         while(rset.next()) {   // Move the cursor to the next row, return false if no more row
		             adres = rset.getString("adres");
		          }
		         str = "select p.name from client c\n" + 
			         		"join `order` o on o.client_id=c.ID\n" + 
			         		"join product p on o.product_id=p.ID\n" + 
			         		"where o.ID="+id+";";
		         rset = stmt.executeQuery(str);
		         String product_name = "";
		         while(rset.next()) {   // Move the cursor to the next row, return false if no more row
		        	 product_name = rset.getString("name");
		          }
		         str = "select p.price from client c\n" + 
			         		"join `order` o on o.client_id=c.ID\n" + 
			         		"join product p on o.product_id=p.ID\n" + 
			         		"where o.ID="+id+";";
		         rset = stmt.executeQuery(str);
		         String price = "";
		         while(rset.next()) {   // Move the cursor to the next row, return false if no more row
		        	 price = rset.getString("price");
		          }
		         str = "select o.count from `order` o where o.ID="+id+";";
		         rset = stmt.executeQuery(str);
		         String count = "";
		         while(rset.next()) {   // Move the cursor to the next row, return false if no more row
		        	 count = rset.getString("count");
		          }
		         InvoiceFrame invoice = new InvoiceFrame(name, nip, adres, product_name, price, count);
		         invoice.openFrame();
		     } 			
			catch(SQLException ex) {
		        ex.printStackTrace();
		    }
	}

}
