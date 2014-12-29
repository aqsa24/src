package Doctor;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DoctorGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoctorGUI frame = new DoctorGUI();
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
	public DoctorGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDoctorModule = new JLabel("Doctor Module");
		lblDoctorModule.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblDoctorModule.setBounds(139, 23, 142, 14);
		contentPane.add(lblDoctorModule);
		
		JButton btnNewButton = new JButton("Chcek Bills");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
            Doctor rs= new Doctor();
				
				rs.CheckBills();
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(31, 65, 153, 35);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Patient Description");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
             Doctor rs= new Doctor();
				
				rs.CheckPatientDesc();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton_1.setBounds(33, 117, 151, 35);
		contentPane.add(btnNewButton_1);
		
		JButton btnViewcv = new JButton("View CV");
		btnViewcv.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnViewcv.setBounds(31, 163, 153, 35);
		contentPane.add(btnViewcv);
		
		JButton btnUpdateCv = new JButton("Update CV");
		btnUpdateCv.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnUpdateCv.setBounds(31, 209, 153, 35);
		contentPane.add(btnUpdateCv);
	}

}
