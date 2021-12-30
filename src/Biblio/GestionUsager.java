package Biblio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTable;
import javax.swing.JList;
import javax.swing.JButton;
import javax.swing.JTextField;

public class GestionUsager {

	private JFrame frame;
	private JTable table_Usager;
	private JTextField t_Usager_Nom;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GestionUsager window = new GestionUsager();
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
	public GestionUsager() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 625, 375);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNom = new JLabel("Nom");
		lblNom.setBounds(22, 72, 46, 14);
		frame.getContentPane().add(lblNom);
		
		JTextArea tUsager = new JTextArea();
		tUsager.setBounds(22, 97, 115, 22);
		frame.getContentPane().add(tUsager);
		
		JLabel lblCatgories = new JLabel("Cat\u00E9gories");
		lblCatgories.setBounds(22, 137, 71, 14);
		frame.getContentPane().add(lblCatgories);
		
		JLabel lblEditeur = new JLabel("Adresse");
		lblEditeur.setBounds(22, 203, 46, 14);
		frame.getContentPane().add(lblEditeur);
		
		JTextArea tAdresse = new JTextArea();
		tAdresse.setBounds(22, 228, 115, 22);
		frame.getContentPane().add(tAdresse);
		
		table_Usager = new JTable();
		table_Usager.setBounds(152, 48, 311, 227);
		frame.getContentPane().add(table_Usager);
		
		JButton btn_Ajouter_Usager = new JButton("Ajouter");
		btn_Ajouter_Usager.setBounds(48, 289, 89, 23);
		frame.getContentPane().add(btn_Ajouter_Usager);
		
		JButton btn_Supprimer_Usager = new JButton("Supprimer");
		btn_Supprimer_Usager.setBounds(162, 289, 89, 23);
		frame.getContentPane().add(btn_Supprimer_Usager);
		
		JList list_Usagers = new JList();
		list_Usagers.setBounds(22, 162, 115, 33);
		frame.getContentPane().add(list_Usagers);
		
		t_Usager_Nom = new JTextField();
		t_Usager_Nom.setBounds(473, 69, 126, 33);
		frame.getContentPane().add(t_Usager_Nom);
		t_Usager_Nom.setColumns(10);
		
		JButton btn_Chercher_Usager = new JButton("Chercher");
		btn_Chercher_Usager.setBounds(510, 133, 89, 23);
		frame.getContentPane().add(btn_Chercher_Usager);
	}

}
