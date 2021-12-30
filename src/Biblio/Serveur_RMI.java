package Biblio;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;



public class Serveur_RMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.out.println("Serveur: Construction de l'implémentation");
			//GestionParking gestionParking = new GestionParking();
			
			LocateRegistry.createRegistry(2003);
			System.out.println("Objet GestionBiblio enregistré dans RMIregistry");
			
			//Naming.rebind("rmi://localhost:2003/gestion_livres", gestionParking);
			System.out.println("Attente des invocations des clients");
			
		} 
		
		catch (Exception e) {
			System.out.println("Erreur de liaison de l'objet GestionBiblio");
			System.out.println(e.toString());
		
		}

	}

}
