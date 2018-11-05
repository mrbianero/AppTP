package myApp;
import java.awt.event.*;  
import javax.swing.*;    
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.SwingConstants;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;

public class MainFrame {

	private JFrame frame;
	private JTextField txtCount;
	private JTextField txtProduct;
	private JTextField txtClient;
	private JTextField txtOrderId;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainFrame() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 131, 88, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		txtClient = new JTextField();
		txtClient.setText("Client");
		GridBagConstraints gbc_txtClient = new GridBagConstraints();
		gbc_txtClient.insets = new Insets(0, 0, 5, 5);
		gbc_txtClient.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtClient.gridx = 1;
		gbc_txtClient.gridy = 1;
		frame.getContentPane().add(txtClient, gbc_txtClient);
		txtClient.setColumns(10);
		
		txtOrderId = new JTextField();
		txtOrderId.setText("Order ID");
		GridBagConstraints gbc_txtOrderId = new GridBagConstraints();
		gbc_txtOrderId.insets = new Insets(0, 0, 5, 0);
		gbc_txtOrderId.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtOrderId.gridx = 3;
		gbc_txtOrderId.gridy = 1;
		frame.getContentPane().add(txtOrderId, gbc_txtOrderId);
		txtOrderId.setColumns(10);
		
		txtProduct = new JTextField();
		txtProduct.setText("Product");
		GridBagConstraints gbc_txtProduct = new GridBagConstraints();
		gbc_txtProduct.insets = new Insets(0, 0, 5, 5);
		gbc_txtProduct.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtProduct.gridx = 1;
		gbc_txtProduct.gridy = 2;
		frame.getContentPane().add(txtProduct, gbc_txtProduct);
		txtProduct.setColumns(10);
		
		txtCount = new JTextField();
		txtCount.setText("Count");
		GridBagConstraints gbc_txtCount = new GridBagConstraints();
		gbc_txtCount.insets = new Insets(0, 0, 5, 5);
		gbc_txtCount.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtCount.gridx = 1;
		gbc_txtCount.gridy = 3;
		frame.getContentPane().add(txtCount, gbc_txtCount);
		txtCount.setColumns(10);
		
		JButton btn1 = new JButton("Add order");
		GridBagConstraints gbc_showOrders = new GridBagConstraints();
		gbc_showOrders.anchor = GridBagConstraints.WEST;
		gbc_showOrders.gridwidth = 2;
		gbc_showOrders.insets = new Insets(0, 0, 5, 5);
		gbc_showOrders.gridx = 1;
		gbc_showOrders.gridy = 4;
		frame.getContentPane().add(btn1, gbc_showOrders);
		
		btn1.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
			            DbOrder o = new DbOrder();
			            int client = Integer.parseInt(txtClient.getText());
			            int product = Integer.parseInt(txtProduct.getText());
			            int count = Integer.parseInt(txtCount.getText());
			            o.insertOrder(client, product, count);
			        }  
			    });  
		
		JButton btn2 = new JButton("Open invoice");
		GridBagConstraints gbc_btnOpenInvoice = new GridBagConstraints();
		gbc_btnOpenInvoice.insets = new Insets(0, 0, 5, 0);
		gbc_btnOpenInvoice.gridx = 3;
		gbc_btnOpenInvoice.gridy = 4;
		frame.getContentPane().add(btn2, gbc_btnOpenInvoice);
		
		btn2.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e2){  
			            DbOrder o = new DbOrder();
			            int id = Integer.parseInt(txtOrderId.getText());
			            o.showInvoice(id);
			        }  
			    });
		
		JButton btn3 = new JButton("Show Orders");
		GridBagConstraints gbc_btnShowOrders = new GridBagConstraints();
		gbc_btnShowOrders.insets = new Insets(0, 0, 0, 5);
		gbc_btnShowOrders.gridx = 2;
		gbc_btnShowOrders.gridy = 7;
		frame.getContentPane().add(btn3, gbc_btnShowOrders);
		
		btn3.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e3){  
			            DbOrder o = new DbOrder();
			            o.showOrders();
			        }  
			    });
	}
	

}
