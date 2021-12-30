package Biblio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class Main_Bibliotheque {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_Bibliotheque window = new Main_Bibliotheque();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main_Bibliotheque() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton btn_bibliothecaire = new JButton("biblioth\u00E9caire ");
		btn_bibliothecaire.setBounds(56, 178, 130, 42);
		frame.getContentPane().add(btn_bibliothecaire);
		
		JButton btn_usager = new JButton("Usager");
		btn_usager.setBounds(252, 178, 130, 42);
		frame.getContentPane().add(btn_usager);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(Main_Bibliotheque.class.getResource("/Image/bibliothecaire (1).png")));
		lblNewLabel.setBounds(46, 11, 152, 156);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setIcon(new ImageIcon(Main_Bibliotheque.class.getResource("/Image/personne (1).png")));
		lblNewLabel_1.setBounds(240, 11, 152, 156);
		frame.getContentPane().add(lblNewLabel_1);
	}
}
