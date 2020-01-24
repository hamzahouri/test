package control;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import DAOO.Etudiantdao;
import Entities.Etudiant;
import representation.Authentification;
import representation.ajouteretudiant;
import representation.fenetreLogin;

public class Hamza implements ActionListener {
	
	fenetreLogin s;
	Etudiantdao rsq;
	
	
	public void actionPerformed(ActionEvent e) {
		Authentification dao=new Authentification();
		
		if(dao.login(s.login.getText(), s.pw.getText())) {//(login get text) cad prend lr texte de i utilisateur
			s.msg.setText("Succes");
			s.msg.setForeground(Color.GREEN);
			System.out.println("you are connected");
			s.setVisible(false);
			ajouteretudiant y= new ajouteretudiant();// si le log et pw correct afficher cette fenetre
		}
		else {
			s.msg.setText("Failed");
			s.msg.setForeground(Color.RED);
		s.hide();
		}
		
	}
	public Hamza (fenetreLogin e) { //
		s=e;
	}
   
}
	
	
	



