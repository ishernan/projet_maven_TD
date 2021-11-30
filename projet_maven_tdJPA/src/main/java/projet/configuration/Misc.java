package projet.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
	public class Misc { //on demande a spring de la lire pendant qu'on demarre l'app
		
		@Bean //méthode qui fabrique un objet et renvoyé à celui qu'il l'appelle ( Spring recupere l'objet). 
		//pour le récuperer @autowired ModelMapper		
		public ModelMapper getModelMapper() {
			System.out.print("coucou");
			
			return new ModelMapper();
		}
		
	}


