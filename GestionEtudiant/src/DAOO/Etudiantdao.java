package DAOO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import Entities.Etudiant;
import Traitement.GestionEtudiant;

public class Etudiantdao {
public Etudiantdao() {

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
	
	Connection cnx;
	Statement st;
	ResultSet rsq;
	
	public  void ajoutEtudiant(Etudiant e) 
			 {  
  try {
	
      st=cnx.createStatement();
			int i=st.executeUpdate("insert into etudiant(nom,prenom,note,notemoyen) values ('"+e.nom+"','"+e.prenom+"',"+e.note+","+e.notemoyenne+")");
			 System.out.println("enregistrement avec succes: "+ i);
			 }
	catch(SQLException e1) {
		System.out.println("pb d'enregistrement");
	e1.printStackTrace();
	}
			 } 
	public void modifierlanote() {
		int code;
		double notej;
		Scanner sc = new Scanner(System.in);
		System.out.println("veuillez saisir le code de l'etusiant");
		code=sc.nextInt();
		System.out.println("veuillez saisir la nouvelle note");
		notej=sc.nextDouble();
		try {
		st=cnx.createStatement();
		int i =st.executeUpdate("update etudiant set note=" +notej+ "where cne="+code);
		System.out.println("modification reussi");
		} catch(Exception e) {
			System.out.println("probleme de modifi");
		}
	}
	
	public void supprimeretudiant() {
			int cne;
			Scanner sc = new Scanner(System.in);
			System.out.println("veuillez saisir le code de l'etudiant");
			cne=sc.nextInt();
			try {
			st=cnx.createStatement();
			int i =st.executeUpdate("delete from etudiant where cne="+cne);
			System.out.println("suppression reussi");
			} catch(Exception e) {
				System.out.println("probleme de suppression");
			}
	}
	
	
	public void manipuler () {
		GestionEtudiant ges=new GestionEtudiant();
		Scanner sc=new Scanner(System.in);
		while (true) {
			System.out.println("cliquer 1 pour ajouter.2 pour modifier.3 pour supprimer 4 pour afficher");
		int i =sc.nextInt();
		switch (i) {
			case 1 : ges.scanneretudiant();
			case 2 : modifierlanote();
			case 3 : supprimeretudiant();
			case 4 : afficher();
		}
		System.out.println("veuillez quitter l'application o/n");	
		if(sc.next().equalsIgnoreCase("o"));
			break;
	
		}
	}
	public void afficher() {

			try {
			    		
		st=cnx.createStatement();
	   rsq =st.executeQuery("select * FROM etudiant ");
		while (rsq.next()) {
	 System.out.println(rsq.getInt(1)+"    "+rsq.getString("nom")+"    "+rsq.getString("prenom")+"   "+rsq.getDouble("note")+"   "+rsq.getDouble("notemoyenne"));
//			            	  System.out.println("        "+res.getString("nom"));
			            }
						System.out.println("affichage avec success ");
				
					} catch (SQLException e1) {
						System.out.println("pb de D'affich");
						e1.printStackTrace();
					}
					
				}
	}
		
	

		


