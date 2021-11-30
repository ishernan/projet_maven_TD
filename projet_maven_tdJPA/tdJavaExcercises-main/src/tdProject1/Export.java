package tdProject1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Export {
	
	public void export(List<Personne> personnes) {
		       
		Collections.sort(personnes, new Comparator<Personne>() { //méthode pour comparer des objets
			@Override
			public int compare(Personne o1, Personne o2) {
				return o1.getDate().compareTo(o2.getDate()); 
			}
		});	
		
        try {
    		        	
			FileWriter out = new FileWriter("user3.txt");//creation fichier
			BufferedWriter bw = new BufferedWriter(out);//ecriture dans le fichier

    		for (Personne personne : personnes) {
				bw.write(personne.toString()+"\n");
				 
			}
    					
			bw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
