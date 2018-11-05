package myApp;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;
import javax.swing.JFrame;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	@Test
	public void testConnector() {
		
		assertNotNull(DbConnector.connect());
	}
	@Test
	public void testFrame() {
		assertEquals("2 1 3", DbOrder.insertOrder(2, 1, 3));
	}
}
