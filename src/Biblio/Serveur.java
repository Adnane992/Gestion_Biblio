package Biblio;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;

public class Serveur {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = null;

	    String url = "jdbc:mysql://localhost:3306/bibilotheque";
	    String root = "root";
	    String password = "";

	    try {
	      Class.forName("com.mysql.jdbc.Driver");
	      con = (Connection) DriverManager.getConnection(url, root, password);
	      System.out.println("Connected!");

	    } 
	    catch (ClassNotFoundException | SQLException e) {
	        System.err.println(e);
	    }    

	}

}
