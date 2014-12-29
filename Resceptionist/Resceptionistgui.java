package Resceptionist;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.SystemColor;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class Resceptionistgui extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Resceptionistgui frame = new Resceptionistgui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Resceptionistgui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 635, 434);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnInsertPatientRecord = new JButton("Insert Patient Record");
		btnInsertPatientRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Resceptionist rs= new Resceptionist();
				
				rs.UpdatePatient();
			}
		});
		btnInsertPatientRecord.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnInsertPatientRecord.setBounds(10, 66, 165, 42);
		contentPane.add(btnInsertPatientRecord);
		
		JLabel lblResceptionistModule = new JLabel("Resceptionist Module");
		lblResceptionistModule.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblResceptionistModule.setBounds(232, 11, 182, 24);
		contentPane.add(lblResceptionistModule);
		
		JButton btnNewButton = new JButton("Calculate Bill");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
Resceptionist rs= new Resceptionist();
				
				rs.CalculateBill();
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(444, 66, 165, 42);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("ReteriveBills");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBounds(444, 119, 165, 42);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Add Products");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
             Resceptionist rs= new Resceptionist();
				
				rs.AddProducts();
				
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_2.setBounds(232, 66, 148, 42);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Reterive Products");
		btnNewButton_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_3.setBounds(232, 119, 148, 42);
		contentPane.add(btnNewButton_3);
		
		JButton btnProductsSupplied = new JButton("Products Supplied");
		btnProductsSupplied.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnProductsSupplied.setBounds(232, 176, 148, 42);
		contentPane.add(btnProductsSupplied);
	}
}
