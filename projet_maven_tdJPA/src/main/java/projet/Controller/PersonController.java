package projet.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import projet.entity.Person;
import projet.persistance.PersonRepository;

 
@RestController
@RequestMapping(path = "/api/person")
public class PersonController {
	
	@Autowired
	private PersonRepository personRepository; //
	
	@GetMapping
	public List<Person> getPerson() {
		return personRepository.findAll();
	}
	
	@GetMapping(path = "/{id}")
	public Person getPerson(@PathVariable Long id) throws org.springframework.data.crossstore.ChangeSetPersister.NotFoundException {
		return personRepository.findById(id).orElseThrow(() -> new NotFoundException());
	}
	
	@PostMapping
	public Person savePerson(@RequestBody Person person) {
		return personRepository.save(person);
	}
	
	@DeleteMapping(path = "/{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public void deletePerson(@PathVariable Long id) {
		personRepository.deleteById(id);
}


	
	}

