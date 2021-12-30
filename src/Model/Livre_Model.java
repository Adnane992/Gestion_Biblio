package Model;

import java.io.Serializable;

public class Livre_Model implements Serializable {

	private int isbn;
	private String titre, auteur,emplacement;
	
	public Livre_Model() {
		super();
	}

	public Livre_Model(int isbn, String titre, String auteur, String emplacement) {
		super();
		this.isbn = isbn;
		this.titre = titre;
		this.auteur = auteur;
		this.emplacement = emplacement;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}

	public String getEmplacement() {
		return emplacement;
	}

	public void setEmplacement(String emplacement) {
		this.emplacement = emplacement;
	}
	
	
	
	
	
	
}
