package Billing;

import java.awt.Color;
import java.awt.Desktop;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import net.proteanit.sql.DbUtils;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.jdbc.JDBCCategoryDataset;

import Db.Database;

import com.toedter.calendar.JDateChooser;

public class billinggui1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JComboBox comboBoxSelect;
	private JDateChooser dateChooser;
	Connection con= null;
	   PreparedStatement ps=null;
	    ResultSet rs=null;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					billinggui1 frame = new billinggui1();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
Connection connection=null;
private JTextField textFieldSearch;
private JTable JTab;
private JScrollPane scrollPane;
private JButton btnReport;
private JButton btnChart;
private JLabel lblBillingManagementSystem;

	 /* Create the frame.
	 */
	public billinggui1() {
		connection=Database.getcon();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 739, 418);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 128), 3, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblId = new JLabel("Patient_ID");
		lblId.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblId.setBounds(31, 27, 85, 14);
		contentPane.add(lblId);
		
		JLabel lblNewLabel = new JLabel("Patient Name");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(31, 52, 100, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblTotalBill = new JLabel("Total Bill");
		lblTotalBill.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblTotalBill.setBounds(31, 77, 85, 14);
		contentPane.add(lblTotalBill);
		
		JLabel lblRecievedBy = new JLabel("Recieved By");
		lblRecievedBy.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblRecievedBy.setBounds(31, 102, 85, 14);
		contentPane.add(lblRecievedBy);
		
		textField = new JTextField();
		textField.setBounds(156, 24, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(156, 49, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(156, 74, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(156, 99, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnGenerateBill = new JButton("Generate Bill");
		btnGenerateBill.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					ControllerBilling bl= new ControllerBilling();
				bl.add_bill1(textField.getText(),textField_1.getText(),textField_2.getText(),textField_3.getText(), ((JTextField)dateChooser.getDateEditor().getUiComponent()).getText());
			}
		});
		btnGenerateBill.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnGenerateBill.setBounds(155, 219, 114, 29);
		contentPane.add(btnGenerateBill);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ControllerBilling bl= new ControllerBilling();
				bl.update_bill1(textField_4.getText(),textField_1.getText(), textField_2.getText(), textField_3.getText() ,((JTextField)dateChooser.getDateEditor().getUiComponent()).getText());				
			}
		});
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnUpdate.setBounds(10, 219, 114, 29);
		contentPane.add(btnUpdate);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(" ");
				textField_1.setText(" ");
				textField_2.setText(" ");
				textField_3.setText(" ");
				textField_4.setText(" ");
				dateChooser.setDateFormatString("");
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnClear.setBounds(155, 259, 114, 31);
		contentPane.add(btnClear);
		
		JLabel lblEnterIdFor = new JLabel("ID To Update");
		lblEnterIdFor.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblEnterIdFor.setBounds(31, 127, 85, 14);
		contentPane.add(lblEnterIdFor);
		
		textField_4 = new JTextField();
		textField_4.setBounds(156, 124, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnLoadTable = new JButton("Table");
		btnLoadTable.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnLoadTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					String query="SELECT * FROM `billing`";
					PreparedStatement pst=connection.prepareStatement(query);
					ResultSet rs=pst.executeQuery();
					JTab.setModel(DbUtils.resultSetToTableModel(rs));
				}catch(Exception e1)
				{
					e1.printStackTrace();
				}
				
			}
		});
		btnLoadTable.setBounds(10, 260, 114, 29);
		contentPane.add(btnLoadTable);
		
		textFieldSearch = new JTextField();
		textFieldSearch.addKeyListener(new KeyAdapter() {
			

			@Override
			public void keyReleased(KeyEvent arg0) {
				try{
					String selection=(String)comboBoxSelect.getSelectedItem();
					String query="SELECT * FROM billing WHERE "+selection+"=?";
					System.out.println(query);
					PreparedStatement pst=connection.prepareStatement(query);
					pst.setString(1,textFieldSearch.getText());
					ResultSet rs=pst.executeQuery();
					JTab.setModel(DbUtils.resultSetToTableModel(rs));
					pst.close();
				}catch(Exception e1){
					e1.printStackTrace();
				}
			}

			
		});
		textFieldSearch.setBounds(492, 52, 107, 29);
		contentPane.add(textFieldSearch);
		textFieldSearch.setColumns(10);
		
	 comboBoxSelect = new JComboBox();
	 comboBoxSelect.setFont(new Font("Tahoma", Font.BOLD, 12));
		//comboBoxSelect.setModel(new DefaultComboBoxModel(new String[] {"ID","Bill"}));
		comboBoxSelect.setBounds(354, 52, 100, 29);
		contentPane.add(comboBoxSelect);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(354, 102, 341, 203);
		contentPane.add(scrollPane);
		
		JTab = new JTable();
		scrollPane.setViewportView(JTab);
		
		 dateChooser = new JDateChooser();
		dateChooser.setBounds(156, 146, 91, 20);
		contentPane.add(dateChooser);
		
		JLabel lblChooseDate = new JLabel("Choose Date");
		lblChooseDate.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblChooseDate.setBounds(31, 152, 85, 14);
		contentPane.add(lblChooseDate);
		
		btnReport = new JButton("Report");
		btnReport.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					 
					File pdfFile = new File("C:\\Users\\Sana Nasir\\Desktop\\3.pdf");
					if (pdfFile.exists()) {
			 
						if (Desktop.isDesktopSupported()) {
							Desktop.getDesktop().open(pdfFile);
						} else {
							System.out.println("Awt Desktop is not supported!");
						}
			 
					} else {
						System.out.println("File is not exists!");
					}
			 
					System.out.println("Done");
			 
				  } catch (Exception ex) {
					ex.printStackTrace();
				  }
			 
				}
			
		});
		btnReport.setBounds(156, 305, 113, 29);
		contentPane.add(btnReport);
		
		btnChart = new JButton("Chart");
		btnChart.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnChart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String sql = "Select ID,Bill from billing";
					JDBCCategoryDataset dataset  = new JDBCCategoryDataset(Database.getcon(),sql);
					JFreeChart chart = ChartFactory.createLineChart("Billing Management System", "Number of Sale", "Price", dataset, PlotOrientation.VERTICAL, false, true, true);
						BarRenderer renderer = new BarRenderer();
						CategoryPlot plot = null;
						ChartFrame frame = new ChartFrame("Line Chart", chart);
						frame.setVisible(true);
						frame.setSize(450,650);
					} catch (Exception e2) {

					}
			}
		});
		btnChart.setBounds(10, 304, 114, 31);
		contentPane.add(btnChart);
		
		lblBillingManagementSystem = new JLabel("Billing Management System");
		lblBillingManagementSystem.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblBillingManagementSystem.setBounds(278, 12, 182, 14);
		contentPane.add(lblBillingManagementSystem);
		con=Database.getcon();
		ShowSpecficData();
		AutoShowBox();
		
	}
	 private void ShowSpecficData(){
	        String sql = "Select ID,PatientName,Bill,ReceivedBy from billing ";
	 
		try {
	        ps=con.prepareStatement(sql);
	        rs=ps.executeQuery();
	        JTab.setModel(DbUtils.resultSetToTableModel(rs));
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
		private void AutoShowBox(){
			
			try {
				String sql = "Select * from billing";
				ps=con.prepareStatement(sql);
				rs = ps.executeQuery();
				while(rs.next()){
				String ID = rs.getString("ID");
				comboBoxSelect.addItem(ID);
				}
				
				
			} catch (Exception e) {
	         JOptionPane.showMessageDialog(null, "Problem");
			
			}
}	
}
