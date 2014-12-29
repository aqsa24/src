package Patient;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;

import Patientmain.PatientMain;

import java.awt.Color;
import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

public class DiseaseDeleteGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DiseaseDeleteGUI frame = new DiseaseDeleteGUI();
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
	public DiseaseDeleteGUI() {
		setType(Type.UTILITY);
		setTitle("Delete Disease Record");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblId = new JLabel("Enter Disease ID To delete:");
		lblId.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblId.setBounds(25, 102, 192, 41);
		contentPane.add(lblId);
		
		textField = new JTextField();
		textField.setBounds(227, 113, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DiseaseController pat= new DiseaseController();
				pat.delete_disease(textField.getText());
			}
		});
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnDelete.setBounds(324, 228, 89, 23);
		contentPane.add(btnDelete);
		
		JLabel lblDeletePatientRecord = new JLabel("Delete Disease Record");
		lblDeletePatientRecord.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblDeletePatientRecord.setBounds(119, 51, 194, 14);
		contentPane.add(lblDeletePatientRecord);
		
		JLabel lblClinicManagementSystem = new JLabel("Clinic Management System");
		lblClinicManagementSystem.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblClinicManagementSystem.setBounds(95, 11, 233, 29);
		contentPane.add(lblClinicManagementSystem);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PatientMain up=new PatientMain();
				up.setVisible(true);
				setVisible(false);
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnBack.setBounds(25, 228, 89, 23);
		contentPane.add(btnBack);
	}
}

