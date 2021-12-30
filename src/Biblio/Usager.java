package Biblio;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Usager {

	private JFrame frame;
	private JTable table_Usager_Livre;
	private JTextField tChercher;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Usager window = new Usager();
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
	public Usager() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 566, 346);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		table_Usager_Livre = new JTable();
		table_Usager_Livre.setBounds(43, 59, 331, 237);
		frame.getContentPane().add(table_Usager_Livre);
		
		tChercher = new JTextField();
		tChercher.setBounds(384, 73, 156, 40);
		frame.getContentPane().add(tChercher);
		tChercher.setColumns(10);
		
		JButton btn_Chercher_Usager = new JButton("Chercher");
		btn_Chercher_Usager.setBounds(451, 137, 89, 23);
		frame.getContentPane().add(btn_Chercher_Usager);
	}
}
