package Patient;

import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.EventQueue;

import org.eclipse.swt.*;
import org.eclipse.swt.graphics.*;
import org.eclipse.swt.events.*;
import org.eclipse.swt.layout.*;
import org.eclipse.swt.widgets.*;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.jdbc.JDBCCategoryDataset;

import com.toedter.calendar.JDateChooser;

import Dbs.Database;
import Patientmain.PatientMain;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;

import net.proteanit.sql.DbUtils;

import java.awt.Window.Type;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.io.File;
import java.awt.SystemColor;

@SuppressWarnings("serial")
public class PatientGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JDateChooser dateChooser;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PatientGUI frame = new PatientGUI();
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
	public PatientGUI() {
		setType(Type.UTILITY);
		setTitle("Insert Patient Record");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLUE);
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnInsert = new JButton("Insert");
		btnInsert.setFont(new Font("Tahoma", Font.BOLD, 13));
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PatientController pat= new PatientController();
				pat.add_buyer1(textField.getText(),((JTextField)dateChooser.getDateEditor().getUiComponent()).getText(),textField_1.getText(),textField_2.getText(),textField_6.getText(), textField_4.getText() ,textField_5.getText(),textField_3.getText());
			}
		});
		btnInsert.setBounds(138, 229, 89, 23);
		contentPane.add(btnInsert);
		
		textField = new JTextField();
		
		textField.setBounds(83, 28, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(83, 59, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(83, 90, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(83, 121, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("ID:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(10, 30, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("");
		label.setBounds(27, 65, 46, 14);
		contentPane.add(label);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblName.setBounds(10, 61, 46, 14);
		contentPane.add(lblName);
		
		JLabel lblWeight = new JLabel("Age:");
		lblWeight.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblWeight.setBounds(10, 92, 46, 14);
		contentPane.add(lblWeight);
		
		JLabel lblHeight = new JLabel("Height:");
		lblHeight.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblHeight.setBounds(10, 124, 63, 14);
		contentPane.add(lblHeight);
		
		JLabel lblPatientHistory = new JLabel("Patient History:");
		lblPatientHistory.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPatientHistory.setBounds(203, 48, 155, 40);
		contentPane.add(lblPatientHistory);
		
		textField_4 = new JTextField();
		textField_4.setBounds(203, 90, 179, 86);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JLabel lblWeight_1 = new JLabel("Weight:");
		lblWeight_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblWeight_1.setBounds(10, 154, 63, 14);
		contentPane.add(lblWeight_1);
		
		textField_5 = new JTextField();
		textField_5.setBounds(83, 152, 86, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblDisese = new JLabel("Disese:");
		lblDisese.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDisese.setBounds(202, 30, 71, 14);
		contentPane.add(lblDisese);
		
		textField_6 = new JTextField();
		textField_6.setBounds(272, 28, 86, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		JLabel lblPatientRecord = new JLabel("Patient Record Insertion");
		lblPatientRecord.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblPatientRecord.setBounds(106, 0, 220, 14);
		contentPane.add(lblPatientRecord);
		dateChooser = new JDateChooser();
		dateChooser.setBounds(83, 183, 91, 20);
		contentPane.add(dateChooser);
		JLabel lblDate = new JLabel("Date:");
		lblDate.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDate.setBounds(10, 185, 46, 14);
		contentPane.add(lblDate);
		
		JButton btnReport = new JButton("Report");
		btnReport.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				 try {
					 
						File pdfFile = new File("C:\\Users\\Sana Nasir\\Desktop\\2.pdf");
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
		btnReport.setBounds(335, 229, 89, 23);
		contentPane.add(btnReport);
		
		JButton btnNewButton = new JButton("Chart");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String sql = "Select ID,Age from record";
					JDBCCategoryDataset dataset  = new JDBCCategoryDataset(Database.getcon(),sql);
					JFreeChart chart = ChartFactory.createLineChart("Patient Record", "ID of Patient", "Age", dataset, PlotOrientation.VERTICAL, false, true, true);
						BarRenderer renderer = new BarRenderer();
						CategoryPlot plot = null;
						ChartFrame frame = new ChartFrame("Line Chart", chart);
						frame.setVisible(true);
						frame.setSize(450,650);
					} catch (Exception e2) {

					}
			}
			
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(335, 199, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				PatientMain up=new PatientMain();
				up.setVisible(true);
				setVisible(false);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBounds(10, 230, 89, 23);
		contentPane.add(btnNewButton_1);
	}
}
