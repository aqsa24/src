package Main;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JButton;

import Billing.billinggui1;
import Inventory.InventoryGUI;
import Patient.PatientGUI;
import Patientmain.PatientMain;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	public Main() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(30, 144, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblClinicManagementSystem = new JLabel("Clinic Management System");
		lblClinicManagementSystem.setFont(new Font("Times New Roman", Font.BOLD, 17));
		lblClinicManagementSystem.setBounds(95, 26, 234, 26);
		contentPane.add(lblClinicManagementSystem);
		
		JButton btnPatientRecord = new JButton("Patient Record");
		btnPatientRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PatientMain b=new PatientMain();
				b.setVisible(true);
				setVisible(false);
			}
			
		});
		btnPatientRecord.setBackground(new Color(192, 192, 192));
		btnPatientRecord.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnPatientRecord.setBounds(133, 102, 144, 39);
		contentPane.add(btnPatientRecord);
		
		JButton btnNewButton = new JButton(" Billing System");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				billinggui1 bl= new billinggui1();
				bl.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton.setBounds(133, 152, 144, 37);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Inventory");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				InventoryGUI bl= new InventoryGUI();
				bl.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_1.setBackground(new Color(192, 192, 192));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(133, 200, 144, 37);
		contentPane.add(btnNewButton_1);
		
		JLabel lblPleaseSelectField = new JLabel("Please Select Field:");
		lblPleaseSelectField.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPleaseSelectField.setBounds(50, 75, 123, 14);
		contentPane.add(lblPleaseSelectField);
	}
}
