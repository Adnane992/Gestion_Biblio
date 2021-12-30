package Biblio;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

import Model.Livre_Model;

public interface Ibiblio extends Remote {
	
	ArrayList<Livre_Model> afficherLivresEmpruntés() throws RemoteException;

	
}
