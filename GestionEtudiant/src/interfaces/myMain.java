package interfaces;

public class myMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			ExceptionEssai.methode (2,3);
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
