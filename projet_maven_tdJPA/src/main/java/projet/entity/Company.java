package projet.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;


	@Table(name="company")
	@Entity
	@Data //reemplace les getters et setters
	public class Company  {

		@Id
		@GeneratedValue(strategy=GenerationType.IDENTITY)
		@Column(name="id")
		private Long id;
		
		@OneToMany
		private List<Person> persons; 

		
		@Column(name="name", length = 50)
		private String name;
		
		
		
		
	}

