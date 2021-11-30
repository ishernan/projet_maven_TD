package projet.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

	@Table(name="person")  //ceci permet de générer des instances de person en base de donné 
	@Entity
	@Data
	public class Person  {

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="id")
		private Long id;
		
		@Column(name="name", length = 50)
		private String name;
		
		
		@Column(name="firstname", length = 50)
		private String firstname;
		
		//@ManyToOne
		//private Company company;
		
		

		
		
	}
	
