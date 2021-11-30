package tdProject1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Read {
	
	public List<Personne> read() throws IOException{
		
		List<Personne> listePersonne =  new ArrayList<Personne>() ;

		File file = new File("userList.txt"); //cree le fichier

		Reader reader = new FileReader(file); // lire le fichier
		BufferedReader br = new BufferedReader(reader); // le reader à court therme 

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");//format de date
		
		String line;	    
		while((line = br.readLine()) != null) { //parcourir la liste

			String parts[] = line.split("#");//segmenter les caractères

			try {
				Personne p = new Personne(parts[0], parts[1], sdf.parse(parts[2]));//placer les sections
				//System.out.println(sdf.parse(parts[2]));
				listePersonne.add(p); //ajouter
				System.out.println(p);
				
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
		br.close();
		
		return listePersonne;
		
	}
}
