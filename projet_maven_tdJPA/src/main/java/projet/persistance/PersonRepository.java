package projet.persistance;


import org.springframework.data.jpa.repository.JpaRepository;

import projet.entity.Person;


public interface PersonRepository extends JpaRepository<Person, Long> {

	
}
