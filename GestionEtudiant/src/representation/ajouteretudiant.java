package representation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import DAOO.Etudiantdao;
import Entities.Etudiant;

public class ajouteretudiant extends JFrame {

	public JTextField nom;
	public JTextField prenom;
	public JTextField note;
	public JTextField notemoyenne;
	
public ajouteretudiant(){
		
		
		setTitle("ajouter etudiant ");
	
		// Creation du buttn
		JButton b1= new JButton("ajouter");
		JButton b2= new JButton("quitter");
		//creation du label
		JLabel lab1=new JLabel("nom");
		JLabel lab2=new JLabel("prenom");
		JLabel lab3=new JLabel("note");
		JLabel lab4=new JLabel("note moyenne");
		nom= new JTextField();
		prenom=new JTextField();
		note=new JTextField();
		notemoyenne =new JTextField();
		
		b1.setBounds(50, 260, 250, 30);
		b2.setBounds(305, 260, 250, 30);
		lab1.setBounds(50, 80, 250, 30);
		nom.setBounds(305, 80, 250, 30);
		lab2.setBounds(50, 120, 250, 30);
		prenom.setBounds(305, 120, 250, 30);
		setBounds(50, 50, 650, 500);
		lab3.setBounds(50, 160,250 ,50);
		note.setBounds(305, 160, 250, 30);
		lab4.setBounds(50, 200,250 ,50);
		notemoyenne.setBounds(305, 200, 250, 30);
		getContentPane().setLayout(null);
		getContentPane().add(b1);
		getContentPane().add(b2);
		
		
		getContentPane().add(lab1);
		getContentPane().add(nom);
		getContentPane().add(lab2);
		getContentPane().add(prenom);
		getContentPane().add(lab3);
		getContentPane().add(note);
		getContentPane().add(lab4);
		getContentPane().add(notemoyenne);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		 b1.addActionListener(new ActionListener() {

			 @Override
			 public void actionPerformed(ActionEvent e) {
			 Etudiantdao dao = new Etudiantdao();
			 Etudiant etudiant = new Etudiant();
			 
			 etudiant.nom = nom.getText();
			 etudiant.prenom = prenom.getText();
			 etudiant.note = Double.parseDouble(note.getText());
			 etudiant.notemoyenne = Double.parseDouble(notemoyenne.getText());
			 dao.ajoutEtudiant(etudiant);
			 nom.setText("");

			 }
			 });	
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				fenetreLogin j = new fenetreLogin();
			}
		});	
		 
		 
		 
}
}
