package myApp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.GridBagLayout;
import javax.swing.JTextPane;
import java.awt.GridBagConstraints;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Insets;

public class InvoiceFrame {

	static JFrame frame;
	private JLabel nL;
	public InvoiceFrame(String name, String nip, String adres, String product_name, String price, String count) {
		initialize(name, nip, adres, product_name, price, count);
	}
	/**
	 * Launch the application.
	 */
	public static void openFrame() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String name, String nip, String adres, String product_name, String price, String count) {
		frame = new JFrame();
		frame.setBounds(100, 100, 409, 328);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		frame.getContentPane().setLayout(gridBagLayout);
		
		JLabel nL = new JLabel(name);
		GridBagConstraints gbc_nL = new GridBagConstraints();
		gbc_nL.insets = new Insets(0, 0, 5, 5);
		gbc_nL.gridx = 10;
		gbc_nL.gridy = 2;
		frame.getContentPane().add(nL, gbc_nL);
		
		JLabel nipL = new JLabel(nip);
		GridBagConstraints gbc_nipL = new GridBagConstraints();
		gbc_nipL.insets = new Insets(0, 0, 5, 5);
		gbc_nipL.gridx = 10;
		gbc_nipL.gridy = 3;
		frame.getContentPane().add(nipL, gbc_nipL);
		
		JLabel aL = new JLabel(adres);
		GridBagConstraints gbc_aL = new GridBagConstraints();
		gbc_aL.insets = new Insets(0, 0, 5, 5);
		gbc_aL.gridx = 10;
		gbc_aL.gridy = 4;
		frame.getContentPane().add(aL, gbc_aL);
		
		JLabel lblNewLabel = new JLabel("Invoice");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 5;
		gbc_lblNewLabel.gridy = 6;
		frame.getContentPane().add(lblNewLabel, gbc_lblNewLabel);
		
		JLabel pnL = new JLabel(product_name);
		GridBagConstraints gbc_pnL = new GridBagConstraints();
		gbc_pnL.insets = new Insets(0, 0, 0, 5);
		gbc_pnL.gridx = 2;
		gbc_pnL.gridy = 8;
		frame.getContentPane().add(pnL, gbc_pnL);
		
		JLabel pL = new JLabel(price);
		GridBagConstraints gbc_pL = new GridBagConstraints();
		gbc_pL.insets = new Insets(0, 0, 0, 5);
		gbc_pL.gridx = 4;
		gbc_pL.gridy = 8;
		frame.getContentPane().add(pL, gbc_pL);
		
		JLabel lblX = new JLabel("x");
		GridBagConstraints gbc_lblX = new GridBagConstraints();
		gbc_lblX.insets = new Insets(0, 0, 0, 5);
		gbc_lblX.gridx = 5;
		gbc_lblX.gridy = 8;
		frame.getContentPane().add(lblX, gbc_lblX);
		
		JLabel cL = new JLabel(count);
		GridBagConstraints gbc_cL = new GridBagConstraints();
		gbc_cL.insets = new Insets(0, 0, 0, 5);
		gbc_cL.gridx = 6;
		gbc_cL.gridy = 8;
		frame.getContentPane().add(cL, gbc_cL);
		
		JLabel label = new JLabel("=");
		GridBagConstraints gbc_label = new GridBagConstraints();
		gbc_label.insets = new Insets(0, 0, 0, 5);
		gbc_label.gridx = 7;
		gbc_label.gridy = 8;
		frame.getContentPane().add(label, gbc_label);
		
		JLabel fpL = new JLabel(Integer.toString(Integer.parseInt(count)*Integer.parseInt(price)));
		GridBagConstraints gbc_fpL = new GridBagConstraints();
		gbc_fpL.insets = new Insets(0, 0, 0, 5);
		gbc_fpL.gridx = 8;
		gbc_fpL.gridy = 8;
		frame.getContentPane().add(fpL, gbc_fpL);
	}

}