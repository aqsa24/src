package Inventory;

import java.awt.BorderLayout;
import java.awt.Desktop;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.jdbc.JDBCCategoryDataset;

import dbb.Database;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Font;

public class InventoryGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					InventoryGUI frame = new InventoryGUI();
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
	public InventoryGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setForeground(Color.BLUE);
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ID:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel.setBounds(21, 50, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Quantity:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(21, 84, 68, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Name:");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2.setBounds(231, 50, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Price:");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_3.setBounds(231, 84, 46, 14);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblDescription = new JLabel("Description:");
		lblDescription.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDescription.setBounds(21, 112, 75, 23);
		contentPane.add(lblDescription);
		
		textField = new JTextField();
		textField.setBounds(99, 47, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(99, 78, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(287, 47, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(287, 81, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(21, 146, 226, 42);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnInsert = new JButton("Insert");
		btnInsert.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnInsert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				InventoryController in=new InventoryController();
				in.add_inv1(textField.getText(),textField_2.getText(),textField_1.getText(),textField_3.getText(),textField_4.getText());
			}
		});
		btnInsert.setBounds(21, 199, 89, 23);
		contentPane.add(btnInsert);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				InventoryController inx= new InventoryController();
				inx.update_inv1(textField.getText(),textField_1.getText(),textField_3.getText());
			}
		});
		btnUpdate.setBounds(21, 233, 89, 23);
		contentPane.add(btnUpdate);
		
		JButton btnReport = new JButton("Report");
		btnReport.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnReport.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					 
					File pdfFile = new File("C:\\Users\\Sana Nasir\\Desktop\\4.pdf");
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
		btnReport.setBounds(335, 233, 89, 23);
		contentPane.add(btnReport);
		
		JButton btnChart = new JButton("Chart");
		btnChart.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnChart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String sql = "Select Id,Price from product";
					JDBCCategoryDataset dataset  = new JDBCCategoryDataset(Database.getcon(),sql);
					JFreeChart chart = ChartFactory.createLineChart("Inventory Management System", "ID of product", "Price", dataset, PlotOrientation.VERTICAL, false, true, true);
						BarRenderer renderer = new BarRenderer();
						CategoryPlot plot = null;
						ChartFrame frame = new ChartFrame("Line Chart", chart);
						frame.setVisible(true);
						frame.setSize(450,650);
					} catch (Exception e2) {

					}
			}
			
		});
		btnChart.setBounds(335, 199, 89, 23);
		contentPane.add(btnChart);
		
		JLabel lblInventoryManagementSystem = new JLabel("Inventory Management System");
		lblInventoryManagementSystem.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblInventoryManagementSystem.setBounds(99, 11, 269, 28);
		contentPane.add(lblInventoryManagementSystem);
	}
}
