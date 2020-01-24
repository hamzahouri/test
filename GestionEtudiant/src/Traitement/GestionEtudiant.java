package Traitement;

import java.util.Scanner;
import java.util.Vector;

import DAOO.Etudiantdao;
import Entities.*;
public class GestionEtudiant {
Scanner sc = new Scanner(System.in);
//	public Vector v = new Vector();
	
public 	void scanneretudiant()
	{
	Etudiantdao etudiantdao= new Etudiantdao();
	while(true)
	{
		Etudiant e = new Etudiant();
		System.out.println("veuillez saisir le nom");
		 e.nom =sc.next();
		 System.out.println("veuillez saisir le prenom");
		 e.prenom =sc.next();
		 System.out.println("veuillez saisir la  note");
		e.note= sc.nextDouble();
	     System.out.println("veuillez saisir la  noteMOY");
		e.notemoyenne= sc.nextDouble();
//						v.add(e);
		etudiantdao.ajoutEtudiant(e);
						
	System.out.println("Etudaint ajoutée avec succes");
				System.out.println("Quitter O/N");
				if(sc.next().equalsIgnoreCase("o"))
					break;
	}
//	for (int i = 0; i < v.size(); i++) {
//		Etudiant r = new Etudiant();
//		r = (Etudiant)v.get(i);
//		
//		System.out.println(r.nom + "=====>" + r.note);
//	}
	
		
//		return v;
	
	}
	
public	double calculerMoyenne(Vector <Etudiant>v)
	{
	double moyenne=0;
	for(int i=0; i<v.size(); i=i+1) {
		moyenne= moyenne + v.get(i).note;
	}
		
v.get(0).notemoyenne=moyenne/v.size();
System.out.println(".......... v.ge " +v.get(1).notemoyenne);
return moyenne/v.size();
	}
}

