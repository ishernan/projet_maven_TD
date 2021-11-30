package projet.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import projet.Dto.PersonDto;
import projet.entity.Person;
import projet.services.IpersonService;

@RestController
@RequestMapping(path = "/api/personService")
public class PersonServiceController {
	
	@Autowired	
	private IpersonService srv;
	
	@GetMapping
	public List<PersonDto> getPersons() {
		return srv.getPerson();
	}
	
	@GetMapping(path = "/{id}")
	public PersonDto getPerson(@PathVariable Long id) throws org.springframework.data.crossstore.ChangeSetPersister.NotFoundException {
		return srv.getPerson(id);
	}
	
	@PostMapping
	public Person savePerson(@RequestBody Person person) {
		return srv.save(person);
	}
	
	@DeleteMapping(path = "/{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public void deletePerson(@PathVariable Long id) {
		srv.deleteById(id);
}
	
}
