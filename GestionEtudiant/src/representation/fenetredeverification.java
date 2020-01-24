package representation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class fenetredeverification extends JFrame {

public fenetredeverification () {

	setTitle("fermeture ");
	setBounds(100, 100, 500, 500);
	// Creation du buttn
	JButton b1= new JButton("rester");
	JButton b2= new JButton("quitter");
	JLabel lab1=new JLabel("voulez vous surement quiter");
	b1.setBounds(50, 180, 160, 30);
	b2.setBounds(250, 180, 160, 30);
	lab1.setBounds(180, 20, 30, 30);
	getContentPane().add(b1);
	getContentPane().add(b2);
	getContentPane().add(lab1);
	b1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			fenetreLogin h=new fenetreLogin();
			
		}
	});
	b2.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			fenetredeverification h= new fenetredeverification();
			h.hide();
			setVisible(false);
			
		}
	});
	
	setVisible(true);
	
}
}