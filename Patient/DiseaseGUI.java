package Patient;

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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DiseaseGUI extends JFrame {

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
					DiseaseGUI frame = new DiseaseGUI();
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
	public DiseaseGUI() {
		setType(Type.UTILITY);
		setTitle("Disease");
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
		textField.setBounds(32, 40, 86, 19);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblPatientName = new JLabel("Disease Name:");
		lblPatientName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPatientName.setBounds(177, 41, 86, 14);
		contentPane.add(lblPatientName);
		
		textField_1 = new JTextField();
		textField_1.setBounds(273, 39, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(10, 105, 362, 131);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblPrescription = new JLabel("Description:");
		lblPrescription.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPrescription.setBounds(10, 80, 86, 14);
		contentPane.add(lblPrescription);
		
		JLabel lblFarooqDentalClinic = new JLabel(" Dental Clinic System");
		lblFarooqDentalClinic.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFarooqDentalClinic.setBounds(147, 11, 165, 14);
		contentPane.add(lblFarooqDentalClinic);
		
		JButton btnNewButton = new JButton("Insert");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DiseaseController c= new DiseaseController();
				c.add_disease1(textField.getText(),textField_1.getText(),textField_2.getText());
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(382, 204, 87, 32);
		contentPane.add(btnNewButton);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnBack.setBounds(382, 161, 87, 32);
		contentPane.add(btnBack);
	}

}



