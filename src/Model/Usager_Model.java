package Model;

import java.io.Serializable;

public class Usager_Model implements Serializable{
	
	private int cne;
	private String nom,prenom,adresse,categorie,mdp;
	
	public Usager_Model() {
		super();
	}

	public Usager_Model(int cne, String nom, String prenom, String adresse, String categorie, String mdp) {
		super();
		this.cne = cne;
		this.nom = nom;
		this.prenom = prenom;
		this.adresse = adresse;
		this.categorie = categorie;
		this.mdp = mdp;
	}

	public int getCne() {
		return cne;
	}

	public void setCne(int cne) {
		this.cne = cne;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public String getMdp() {
		return mdp;
	}

	public void setMdp(String mdp) {
		this.mdp = mdp;
	}
	
	
	

}
