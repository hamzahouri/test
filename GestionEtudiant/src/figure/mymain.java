package figure;

import interfaces.ExceptionAegalB;
import interfaces.ExceptionEssai;

public class mymain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
  /*Dog d=new Dog();
  d.sleep();
  d.soundsleep();*/
	
		try {
			ExceptionEssai.methode (2,2);
			System.out.println ("Pas d'erreur");
			}
			catch (ExceptionAegalB exp) {
			System.out.println ("Erreur "+exp.message());
			}
			finally{
			System.out.println ("Message final" );
	
	
	}
}
}
	
