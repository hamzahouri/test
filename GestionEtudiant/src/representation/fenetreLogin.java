
package representation;

import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.MenuBar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import control.Hamza;


public class fenetreLogin extends JFrame {
	
	public JTextField login;
	public JTextField pw;
	public JLabel msg;

	public fenetreLogin(){
		
		
		setTitle("authentification ");
		//Icon t=new ImageIcon("C:\Users\hp\Desktop\0.png");
		
		
		// Creation
		JButton b1= new JButton("ok");
		JButton b2= new JButton("Annuler");
		JLabel lab1=new JLabel("Login");
		login= new JTextField(10);
		
		JLabel lab2=new JLabel("Password");
		pw= new JPasswordField(10);
		msg=new JLabel();
		
		JCheckBox bx=new JCheckBox("Remember me");
		bx.setSelected(false);
		
		//Configuration
		
		JMenuBar menuBar=new JMenuBar();
		JMenu test1 = new JMenu("Fichier");
		JMenu test2 = new JMenu("Help");
		JMenuItem item1 = new JMenuItem("ouvrir");
		JMenuItem item3 = new JMenuItem("nouveau");
		JMenuItem item4 = new JMenuItem("enregistrer");
		JMenuItem item5 = new JMenuItem("enregistrer sous");
		JMenuItem item2= new JMenuItem("online help");
		test1.add(item1);
		test1.add(item3);
		test1.add(item4);
		test1.add(item5);
		test2.add(item2);
		menuBar.add(test1);
		menuBar.add(test2);
		getContentPane().add(menuBar);
		
		
		JRadioButton f = new JRadioButton("Femme");
		JRadioButton h = new JRadioButton("Homme");
		ButtonGroup mygroup = new ButtonGroup();
		mygroup.add(f);
		mygroup.add(h);
		JLabel lab3=new JLabel("Sexe");
		getContentPane().add(lab3);
		lab3.setBounds(100, 270, 150, 20);
		f.setBounds(100, 300, 150, 20);
		h.setBounds(100, 330, 150, 20);
		getContentPane().setLayout(new FlowLayout()) ;
		getContentPane().add(f);
		getContentPane().add(h);
		
		
		getContentPane().setLayout(null);
		b1.setBounds(50, 210, 250, 30);
		b2.setBounds(305, 210, 250, 30);
		lab1.setBounds(50, 80, 250, 30);
		login.setBounds(305, 80, 250, 30);
		lab2.setBounds(50, 120, 250, 30);
		pw.setBounds(305, 120, 250, 30);
		setBounds(50, 50, 650, 500);
		menuBar.setBounds(0, 0, 650,20);
		bx.setBounds(100, 400, 200, 20);
		msg.setBounds(270, 50, 250, 20);
		
		
	getContentPane().add(bx);	
	getContentPane().add(lab1);
	getContentPane().add(login);
	getContentPane().add(lab2);
	getContentPane().add(pw);
	getContentPane().add(b1);
	getContentPane().add(b2);
	b1.addActionListener(new Hamza(this));//ajouter au button b1 une action qui est dans une classe hamza contient action lisnter
	getContentPane().add(msg);
	
	b2.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent e) {
			fenetredeverification h=new fenetredeverification();
		}
		
	});
	setVisible(true);	
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	

	}
}

