package tdProject1;

//importation des librairies 
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.List;



public class Main {
	// La classe "Main" signifie le point d'entrée du programme. 
	//Afin de lancer le programme, au moins une classe de ce type devrait être présente dans l'ensemble de tes packages
	
	public static void main(String[] args) throws MalformedURLException, IOException {  
		
		
		
		Read r = new Read(); //appel de la méthode
		List<Personne> listePersonne =  r.read();
		
		Export l = new Export(); //appel de la méthode. Instancier une classe		
		l.export(listePersonne); //on fait appel à la methode qui est dans l'instance
		
		
	}
	

}


