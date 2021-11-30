package tdProject1;

import java.util.Date;

//POJO
public class Personne /*implements Comparable<Personne>*/ {
	
	private String name;  
	private String firstName;  
	private Date date;
	
	public String getName() {
		if (name.length() > 0) {
			return name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();	
		}
		return "";
	}
	public void setName(String name) {
		
		this.name = name;
				
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	public Personne(String name, String firstName, Date date){ //Constructeur, necessaire à instancier Personne
		this.name = name;
		this.firstName = firstName;
		this.date = date;

	  }
	
	@Override
	public String toString() {		
				
		return "Name = " + getName() + ", FirstName = " + firstName +", Date de naissance = " + date;
	}
	/*
	@Override
	public int compareTo(Personne autre) {
		// TODO Auto-generated method stub
		return this.date.compareTo(autre.getDate());
	}
	*/
	

	
}
	
	 


