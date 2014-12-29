package Doctor;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;

import java.awt.SystemColor;

import javax.swing.JButton;

import com.toedter.calendar.JDateChooser;

public class PrescriptionGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrescriptionGUI frame = new PrescriptionGUI();
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
	public PrescriptionGUI() {
		setType(Type.UTILITY);
		setTitle("Prescription");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 485, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblId.setBounds(10, 41, 46, 14);
		contentPane.add(lblId);
		
		textField = new JTextField();
		textField.setBounds(102, 39, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPatientName = new JLabel("Patient Name:");
		lblPatientName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPatientName.setBounds(10, 72, 86, 14);
		contentPane.add(lblPatientName);
		
		textField_1 = new JTextField();
		textField_1.setBounds(102, 70, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(10, 120, 384, 131);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblPrescription = new JLabel("Prescription:");
		lblPrescription.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPrescription.setBounds(10, 95, 86, 14);
		contentPane.add(lblPrescription);
		
		JLabel lblDoctorFarooqAzam = new JLabel("Doctor Farooq Azam\r\n (BDS)");
		lblDoctorFarooqAzam.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDoctorFarooqAzam.setBounds(259, 23, 165, 32);
		contentPane.add(lblDoctorFarooqAzam);
		
		JLabel lblFarooqDentalClinic = new JLabel("Farooq Dental Clinic");
		lblFarooqDentalClinic.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFarooqDentalClinic.setBounds(147, 11, 165, 14);
		contentPane.add(lblFarooqDentalClinic);
		
		JLabel lblDate = new JLabel("Date:");
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblDate.setBounds(259, 55, 46, 14);
		contentPane.add(lblDate);
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(292, 55, 132, 20);
		contentPane.add(dateChooser);
		
		JButton btnNewButton = new JButton("Print");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(404, 219, 65, 32);
		contentPane.add(btnNewButton);
	}

}
