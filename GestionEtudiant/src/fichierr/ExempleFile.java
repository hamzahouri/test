package fichierr;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExempleFile {

private static void listeFichier (File dir){

if (dir.isDirectory () == true){

String fichiers [ ] = dir.list () ;

System.out.println(dir.getAbsolutePath()+":");

for (int i = 0 ; i != fichiers.length ; i++) {

System.out.println("\t"+fichiers[i]);

}

} else{ System.err.println (dir + " n'est pas un repertoire") ; }

}

static public void main (String args [ ]) {

//File f=new File("C:/Users/hp/Downloads");

//listeFichier(f);

	
	String Chaine = "wincor 1" ;
	try {
	FileOutputStream f = new FileOutputStream
	("C:/Users/hp/Desktop/note.txt") ;
	f.write (Chaine.getBytes ()) ;
	f.close () ;
	System.out.println("yes");
	} catch (IOException e)
	{
	System.err.println ("Erreur ecriture") ;
	}
	

	
}}