package interfaces;

public class ExceptionEssai {

public static void methode(int a,int b) throws ExceptionAegalB{

if(a==b)
	throw new ExceptionAegalB();
else 
System.out.println(a+" et "+b+" ok !");
}

}
