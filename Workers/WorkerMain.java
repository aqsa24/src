package Workers;


import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JButton;



import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class WorkerMain extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WorkerMain frame = new WorkerMain();
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
	public WorkerMain() {
		setType(Type.UTILITY);
		setTitle("Patient Main ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblClinicManagementSystem = new JLabel("Clinic Management System");
		lblClinicManagementSystem.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblClinicManagementSystem.setBounds(118, 11, 172, 27);
		contentPane.add(lblClinicManagementSystem);
		
		JLabel lblPatientReord = new JLabel("Worker Reord");
		lblPatientReord.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPatientReord.setBounds(153, 49, 120, 14);
		contentPane.add(lblPatientReord);
		
		JButton btnInsertRecord = new JButton("Insert Record");
		btnInsertRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				WorkerGui pt= new WorkerGui();
				pt.setVisible(true);
				setVisible(false);
				
			}
		});
		btnInsertRecord.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnInsertRecord.setBounds(140, 91, 133, 27);
		contentPane.add(btnInsertRecord);
		
		JButton btnDeleteRecord = new JButton("Delete Record");
		btnDeleteRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				WorkerDeleteGUI dl= new WorkerDeleteGUI();
				dl.setVisible(true);
				setVisible(false);
			}
		});
		btnDeleteRecord.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnDeleteRecord.setBounds(140, 129, 133, 30);
		contentPane.add(btnDeleteRecord);
		
		JButton btnListRecord = new JButton("List Record");
		btnListRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				WorkerReteriveGUI rt=new WorkerReteriveGUI();
				rt.setVisible(true);
				setVisible(false);
			}
		});
		btnListRecord.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnListRecord.setBounds(140, 170, 133, 30);
		contentPane.add(btnListRecord);
		
		JButton btnUpdateRecord = new JButton("Update Record");
		btnUpdateRecord.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				WorkerUpdateGui up=new WorkerUpdateGui();
				up.setVisible(true);
				setVisible(false);
			}
		});
		btnUpdateRecord.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnUpdateRecord.setBounds(140, 211, 133, 27);
		contentPane.add(btnUpdateRecord);
	}

}
