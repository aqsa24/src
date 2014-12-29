package Patient;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JButton;

import net.proteanit.sql.DbUtils;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.*;

import javax.swing.*;

import org.eclipse.swt.*;
import org.eclipse.swt.graphics.Rectangle;
import org.eclipse.swt.widgets.*;

import Dbs.Database;
import Patientmain.PatientMain;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.SystemColor;
public class PatientReterive extends JFrame {

	private JPanel contentPane;
	private JTable tableJ;
	private JTextField textField;
	PreparedStatement ps = null;
	ResultSet rs = null;
	Connection con = null;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PatientReterive frame = new PatientReterive();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
Connection connection=null;
private JTextField txtId;
private JTextField txtName;
private JTextField txtAge;
private JTextField txtDisease;
private JTextField txtHistory;
private JTextField txtWeight;
private JTextField txtHeight;
private JButton btnBackToMenu;
	/**
	 * Create the frame.
	 */
	public PatientReterive() {
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 623, 394);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		tableJ = new JTable();
		tableJ.setBounds(38, 87, 379, 219);
		contentPane.add(tableJ);
		
		
		textField = new JTextField();
		textField.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int Value=0;
				Value=  Integer.parseInt( textField.getText());
				
				String sql = "Select ID,Name,Age,Disease,PatientHistory,Weight,Height from Record Where ID='"+Value+"'";
			    try {
			        ps=con.prepareStatement(sql);
			        rs=ps.executeQuery();
			        tableJ.setModel(DbUtils.resultSetToTableModel(rs));
			        System.out.println("done");
			    } catch (Exception ex) {
			       JOptionPane.showMessageDialog(null, ex);
			    }
			    finally{
			        try {
			            rs.close();
			            ps.close();
			        } catch (Exception e1) {
			        }
			    }
			}
		});
		
		textField.setBounds(469, 87, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblEnterId = new JLabel("Enter ID:");
		lblEnterId.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblEnterId.setBounds(469, 68, 69, 17);
		contentPane.add(lblEnterId);
		
		JLabel lblSearchRecord = new JLabel("Search Record");
		lblSearchRecord.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 15));
		lblSearchRecord.setBounds(223, 25, 142, 14);
		contentPane.add(lblSearchRecord);
		
		txtId = new JTextField();
		txtId.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtId.setText("ID:");
		txtId.setBounds(38, 66, 53, 20);
		contentPane.add(txtId);
		txtId.setColumns(10);
		
		txtName = new JTextField();
		txtName.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtName.setText("  Name");
		txtName.setBounds(83, 66, 61, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		txtAge = new JTextField();
		txtAge.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtAge.setText("Age");
		txtAge.setBounds(142, 66, 53, 20);
		contentPane.add(txtAge);
		txtAge.setColumns(10);
		
		txtDisease = new JTextField();
		txtDisease.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtDisease.setText("Disease");
		txtDisease.setBounds(193, 66, 61, 20);
		contentPane.add(txtDisease);
		txtDisease.setColumns(10);
		
		txtHistory = new JTextField();
		txtHistory.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtHistory.setText("History");
		txtHistory.setBounds(252, 66, 53, 20);
		contentPane.add(txtHistory);
		txtHistory.setColumns(10);
		
		txtWeight = new JTextField();
		txtWeight.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtWeight.setText("Weight");
		txtWeight.setBounds(304, 66, 61, 20);
		contentPane.add(txtWeight);
		txtWeight.setColumns(10);
		
		txtHeight = new JTextField();
		txtHeight.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtHeight.setText("Height");
		txtHeight.setBounds(364, 66, 53, 20);
		contentPane.add(txtHeight);
		txtHeight.setColumns(10);
		
		JLabel lblClinicManagementSystem = new JLabel("Clinic Management System");
		lblClinicManagementSystem.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 15));
		lblClinicManagementSystem.setBounds(177, 0, 234, 26);
		contentPane.add(lblClinicManagementSystem);
		
		btnBackToMenu = new JButton("Back to Menu");
		btnBackToMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PatientMain up=new PatientMain();
				up.setVisible(true);
				setVisible(false);
			}
		});
		btnBackToMenu.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnBackToMenu.setBounds(469, 311, 117, 23);
		contentPane.add(btnBackToMenu);
		con=Database.getcon();
		ShowSpecficData();
	}
	 private void ShowSpecficData(){
	        String sql = "Select ID,Name,Age,Disease,PatientHistory,Weight,Height from Record";
	    try {
	        ps=con.prepareStatement(sql);
	        rs=ps.executeQuery();
	        tableJ.setModel(DbUtils.resultSetToTableModel(rs));
	    } catch (Exception ex) {
	       JOptionPane.showMessageDialog(null, ex);
	    }
	    finally{
	        try {
	            rs.close();
	            ps.close();
	        } catch (Exception e) {
	        }
	    }
	    
	    }
}
