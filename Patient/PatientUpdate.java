package Patient;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JButton;

import net.proteanit.sql.DbUtils;

import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.sql.*;
import java.util.LinkedList;

import javax.swing.*;

import org.eclipse.swt.events.KeyEvent;
import org.eclipse.swt.widgets.Combo;

import com.toedter.calendar.JDateChooser;

import Dbs.Database;
import Patientmain.PatientMain;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.SystemColor;

public class PatientUpdate extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_6;
	private JTextField textField_7;
	private JDateChooser dateChooser;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PatientUpdate frame = new PatientUpdate();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	Connection connection;
	PreparedStatement pst=null;
	private JTextField textField;

	/**
	 * Create the frame.
	 */
	public PatientUpdate() {
		setType(Type.UTILITY);
		setTitle("Update Patient Record");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblId.setBounds(8, 29, 46, 14);
		contentPane.add(lblId);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblName.setBounds(8, 60, 46, 14);
		contentPane.add(lblName);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAge.setBounds(8, 94, 46, 14);
		contentPane.add(lblAge);
		
		JLabel lblHeight = new JLabel("Height:");
		lblHeight.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblHeight.setBounds(8, 119, 46, 14);
		contentPane.add(lblHeight);
		
		JLabel lblWeight = new JLabel("Weight:");
		lblWeight.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblWeight.setBounds(8, 155, 55, 14);
		contentPane.add(lblWeight);
		
		JLabel lblDate = new JLabel("Date:");
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDate.setBounds(10, 189, 46, 14);
		contentPane.add(lblDate);
		
		textField_1 = new JTextField();
		textField_1.setBounds(90, 57, 91, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(90, 91, 91, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(90, 121, 91, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(90, 152, 91, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		dateChooser = new JDateChooser();
		dateChooser.setBounds(90, 183, 91, 20);
		contentPane.add(dateChooser);
		JLabel lblDisease = new JLabel("Disease:");
		lblDisease.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDisease.setBounds(8, 217, 61, 18);
		contentPane.add(lblDisease);
		
		textField_6 = new JTextField();
		textField_6.setBounds(90, 215, 91, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblPatientHistory = new JLabel("Patient History:");
		lblPatientHistory.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPatientHistory.setBounds(226, 94, 110, 14);
		contentPane.add(lblPatientHistory);
		
		textField_7 = new JTextField();
		textField_7.setBounds(226, 119, 184, 78);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		JButton btnUpdate = new JButton("Search");
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PatientDesc p=new PatientDesc();
				ResultSet rs=p.search(textField.getText());
				try{
					while(rs.next())
					{
						textField_1.setText(rs.getString("Name"));
						textField_2.setText(rs.getString("Age"));
						textField_3.setText(rs.getString("Height"));
						textField_4.setText(rs.getString("Weight"));
						textField_6.setText(rs.getString("Disease"));
						textField_7.setText(rs.getString("PatientHistory"));
					}
				}
				catch (SQLException e1)
				{
					e1.printStackTrace();
					
				}
				
			}
		});
		btnUpdate.setBounds(200, 26, 89, 23);
		contentPane.add(btnUpdate);
		
		textField = new JTextField();
		textField.setBounds(90, 26, 91, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("Update");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PatientDesc p=new PatientDesc();
				p.update_buyer(textField.getText(), textField_1.getText(), textField_2.getText(), textField_4.getText(), textField_3.getText(), textField_6.getText(), textField_7.getText(),((JTextField)dateChooser.getDateEditor().getUiComponent()).getText());
			}
		});
		btnNewButton.setBounds(226, 228, 89, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblPatientUpdatation = new JLabel("Patient Updatation ");
		lblPatientUpdatation.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblPatientUpdatation.setBounds(141, 1, 148, 14);
		contentPane.add(lblPatientUpdatation);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PatientMain up=new PatientMain();
				up.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_1.setBounds(335, 229, 89, 23);
		contentPane.add(btnNewButton_1);
		
		
		
	}
}

