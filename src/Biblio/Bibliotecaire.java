package Biblio;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JList;

public class Bibliotecaire {

	private JFrame frame;
	private JTable table_Livres;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bibliotecaire window = new Bibliotecaire();
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
	public Bibliotecaire() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 632, 363);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Auteur");
		lblNewLabel.setBounds(29, 24, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JTextArea tAuteur = new JTextArea();
		tAuteur.setBounds(29, 49, 115, 22);
		frame.getContentPane().add(tAuteur);
		
		JLabel lblTitre = new JLabel("Titre");
		lblTitre.setBounds(29, 89, 46, 14);
		frame.getContentPane().add(lblTitre);
		
		JTextArea tTitre = new JTextArea();
		tTitre.setBounds(29, 114, 115, 22);
		frame.getContentPane().add(tTitre);
		
		JLabel lblEditeur = new JLabel("Editeur");
		lblEditeur.setBounds(29, 155, 46, 14);
		frame.getContentPane().add(lblEditeur);
		
		JTextArea tEditeur = new JTextArea();
		tEditeur.setBounds(29, 180, 115, 22);
		frame.getContentPane().add(tEditeur);
		
		JLabel lblEmprunte = new JLabel("Emprunteur");
		lblEmprunte.setBounds(29, 229, 84, 14);
		frame.getContentPane().add(lblEmprunte);
		
		JTextArea tEmprunteur = new JTextArea();
		tEmprunteur.setBounds(29, 254, 115, 22);
		frame.getContentPane().add(tEmprunteur);
		
		JButton btn_Ajouter = new JButton("Ajouter");
		btn_Ajouter.setBounds(134, 290, 89, 23);
		frame.getContentPane().add(btn_Ajouter);
		
		table_Livres = new JTable();
		table_Livres.setBounds(159, 49, 311, 227);
		frame.getContentPane().add(table_Livres);
		
		JList list_Livres = new JList();
		list_Livres.setBounds(480, 53, 126, 40);
		frame.getContentPane().add(list_Livres);
		
		JButton btn_Supprimer = new JButton("Supprimer");
		btn_Supprimer.setBounds(260, 290, 89, 23);
		frame.getContentPane().add(btn_Supprimer);
	}
}
