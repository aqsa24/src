package Workers;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Font;

import javax.swing.JCheckBox;
import javax.swing.JButton;

import com.toedter.calendar.JDateChooser;

import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.sql.SQLException;


public class WorkerUpdateGui extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WorkerUpdateGui frame = new WorkerUpdateGui();
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
	public WorkerUpdateGui() {
		setType(Type.UTILITY);
		setTitle("Update Worker Record");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 525, 305);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblName = new JLabel("ID:");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblName.setBounds(10, 46, 46, 14);
		contentPane.add(lblName);
		
		textField = new JTextField();
		textField.setBounds(101, 44, 127, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblAge = new JLabel("Name:");
		lblAge.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAge.setBounds(10, 80, 46, -11);
		contentPane.add(lblAge);
		
		JLabel lblPosition = new JLabel("Position:");
		lblPosition.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPosition.setBounds(10, 108, 63, 14);
		contentPane.add(lblPosition);
		
		JLabel lblQualification = new JLabel("Status:");
		lblQualification.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblQualification.setBounds(10, 139, 93, 14);
		contentPane.add(lblQualification);
		
		JLabel lblConatctNo = new JLabel("Conatct No:");
		lblConatctNo.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblConatctNo.setBounds(10, 170, 78, 14);
		contentPane.add(lblConatctNo);
		
		textField_1 = new JTextField();
		textField_1.setBounds(101, 75, 127, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(101, 106, 127, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(101, 137, 127, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(101, 168, 127, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblAddress = new JLabel("Address:");
		lblAddress.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAddress.setBounds(238, 129, 63, 14);
		contentPane.add(lblAddress);
		
		textField_5 = new JTextField();
		textField_5.setBounds(238, 154, 237, 48);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		JDateChooser dateChooser = new JDateChooser();
		dateChooser.setBounds(343, 75, 132, 20);
		contentPane.add(dateChooser);
		
		JButton btnInsert = new JButton("Update");
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WorkerController c= new WorkerController();
				c.update_Worker1(textField.getText(), textField_1.getText(), textField_1.getText(), textField_6.getText(), textField_2.getText(),textField_3.getText(), textField_4.getText(), textField_5.getText());
			}
		});
		btnInsert.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnInsert.setBounds(399, 231, 89, 23);
		contentPane.add(btnInsert);
		
		JLabel lblWorkerInsertion = new JLabel("Worker Updation");
		lblWorkerInsertion.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblWorkerInsertion.setBounds(191, 11, 127, 14);
		contentPane.add(lblWorkerInsertion);
		
		JLabel lblNewLabel = new JLabel("Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 77, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblPay = new JLabel("Pay:");
		lblPay.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPay.setBounds(10, 195, 46, 14);
		contentPane.add(lblPay);
		
		textField_6 = new JTextField();
		textField_6.setBounds(101, 193, 127, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblDateOfJoining = new JLabel("Date of Joining:");
		lblDateOfJoining.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDateOfJoining.setBounds(238, 74, 118, 20);
		contentPane.add(lblDateOfJoining);
		
		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WorkerMain m=new WorkerMain();
			m.setVisible(true);
			setVisible(false);
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnBack.setBounds(21, 231, 89, 23);
		contentPane.add(btnBack);
		
		JButton btnSearch = new JButton("Search");
		btnSearch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				WorkerDesc p=new WorkerDesc();
				ResultSet rs=p.search(textField.getText());
				try{
					while(rs.next())
					{
						textField_1.setText(rs.getString("Name"));
						textField_2.setText(rs.getString("Post"));
						textField_3.setText(rs.getString("Status"));
						textField_4.setText(rs.getString("ContactNumber"));
						textField_6.setText(rs.getString("Pay"));
						textField_5.setText(rs.getString("Address"));
					}
				}
				catch (SQLException e1)
				{
					e1.printStackTrace();
					
				}
			}
		});
		btnSearch.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSearch.setBounds(241, 43, 89, 23);
		contentPane.add(btnSearch);
	}
}

