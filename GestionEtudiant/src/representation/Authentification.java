package representation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Authentification {
	Connection cnx;
	Statement st;
	ResultSet rsq;
	public Authentification(){
	String chaine="jdbc:mysql://localhost:3306/gestionnetudiant?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				System.out.println("Connected!");
				}
			catch (ClassNotFoundException e1) {
		        System.out.println("problem driver");
		        e1.printStackTrace();
		}
		try {
		cnx=DriverManager.getConnection(chaine,"root","");
		System.out.println("cnx avec succes");
		}
		catch (SQLException e1) {
		System.out.println("pas de conx");
		e1.printStackTrace();
		}
	}
	public boolean login (String a,String b) {
		try { 
			st =cnx.createStatement();
			rsq=st.executeQuery("select password from user where login='"+a+"'");
					System.out.println("query");
					if(rsq.next()) {
						if(rsq.getString("password").contentEquals(b));
						return true;
					
					}
					else return false;
		}
	catch (SQLException e1) {
		System.out.println("not query");
		e1.printStackTrace();
	}
		return false;
	}
	
	

	}


