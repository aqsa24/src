package Resceptionist;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.SystemColor;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ResceptionistMain extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ResceptionistMain frame = new ResceptionistMain();
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
	public ResceptionistMain() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.activeCaption);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblResceptionistModule = new JLabel("Resceptionist Module");
		lblResceptionistModule.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblResceptionistModule.setBounds(123, 11, 149, 26);
		contentPane.add(lblResceptionistModule);
		
		JButton btnBilling = new JButton("Billing");
		btnBilling.setBounds(156, 65, 89, 23);
		contentPane.add(btnBilling);
		
		JButton btnPatient = new JButton("Patient");
		btnPatient.setBounds(156, 100, 89, 23);
		contentPane.add(btnPatient);
		
		JButton btnInventory = new JButton("Inventory");
		btnInventory.setBounds(156, 134, 89, 23);
		contentPane.add(btnInventory);
		
		JButton btnWorker = new JButton("Worker");
		btnWorker.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnWorker.setBounds(156, 168, 89, 23);
		contentPane.add(btnWorker);
	}

}
