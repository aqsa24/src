package Patient;

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

import javax.swing.DefaultComboBoxModel;
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

import Dbs.Database;
import Patientmain.PatientMain;

import com.toedter.calendar.JDateChooser;

import java.awt.Window.Type;

public class PatientReteriveGUI extends JFrame {

	private JPanel contentPane;
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
					PatientReteriveGUI  frame = new PatientReteriveGUI ();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
Connection connection=null;
private JTable JTab;
private JScrollPane scrollPane;
private JButton btnChart;
private JComboBox comboBox;
private JTextField textField;
private JButton btnBack;
private JLabel lblSearch;
private JLabel lblReterivePatientRecord;

	 /* Create the frame.
	 */
	public PatientReteriveGUI () {
		setType(Type.UTILITY);
		setTitle("Retrieve Patient Record");
		connection=Database.getcon();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 646, 368);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 128), 3));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnLoadTable = new JButton("Table");
		btnLoadTable.setForeground(new Color(0, 0, 128));
		btnLoadTable.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnLoadTable.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try{
					String query="SELECT * FROM `record`";
					PreparedStatement pst=connection.prepareStatement(query);
					ResultSet rs=pst.executeQuery();
					JTab.setModel(DbUtils.resultSetToTableModel(rs));
				}catch(Exception e1)
				{
					e1.printStackTrace();
				}
				
			}
		});
		btnLoadTable.setBounds(506, 90, 114, 39);
		contentPane.add(btnLoadTable);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 90, 486, 221);
		contentPane.add(scrollPane);
		
		JTab = new JTable();
		scrollPane.setViewportView(JTab);
		
		btnChart = new JButton("Chart");
		btnChart.setForeground(new Color(0, 0, 128));
		btnChart.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnChart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String sql = "Select ID,Date from record";
					JDBCCategoryDataset dataset  = new JDBCCategoryDataset(Database.getcon(),sql);
					JFreeChart chart = ChartFactory.createLineChart("Billing Management System", "ID", "Disease", dataset, PlotOrientation.VERTICAL, false, true, true);
					BarRenderer renderer = new BarRenderer();
					CategoryPlot plot = null;
					ChartFrame frame = new ChartFrame("Line Chart", chart);
					frame.setVisible(true);
					frame.setSize(450,650);
					} catch (Exception e2) {

					}
			}
		});
		btnChart.setBounds(506, 140, 114, 39);
		contentPane.add(btnChart);
		
		 comboBox = new JComboBox();
		 comboBox.setForeground(new Color(0, 0, 128));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"ID", "Name"}));
		comboBox.setBounds(179, 51, 89, 50);
		contentPane.add(comboBox);
		comboBox.setBounds(85, 51, 89, 31);
		contentPane.add(comboBox);
		
		textField = new JTextField();
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				try {
					String selection = (String)comboBox.getSelectedItem();
					String query = "select * from record where "+selection+" = ?";
					PreparedStatement pst = connection.prepareStatement(query);
					pst.setString(1, textField.getText());
					ResultSet rs = pst.executeQuery();
					JTab.setModel(DbUtils.resultSetToTableModel(rs));
					pst.close();
				}catch(Exception e)
				{
					e.printStackTrace();
				}
			
			}
		});
		textField.setBounds(202, 52, 98, 28);
		contentPane.add(textField);
		textField.setColumns(10);
		
		btnBack = new JButton("Back");
		btnBack.setForeground(new Color(0, 0, 128));
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PatientMain main=new PatientMain();
				dispose();
				removeAll();
				main.setVisible(true);
			}
		});
		btnBack.setBounds(506, 272, 114, 39);
		contentPane.add(btnBack);
		
		lblSearch = new JLabel("Search:");
		lblSearch.setForeground(new Color(0, 0, 128));
		lblSearch.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblSearch.setBounds(10, 49, 65, 31);
		contentPane.add(lblSearch);
		
		lblReterivePatientRecord = new JLabel("Reterive Patient Record");
		lblReterivePatientRecord.setForeground(new Color(0, 0, 128));
		lblReterivePatientRecord.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblReterivePatientRecord.setBounds(238, 11, 171, 14);
		contentPane.add(lblReterivePatientRecord);
		con=Database.getcon();
			
	}
}

