package projet.services.imp;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;


import projet.Dto.PersonDto;
import projet.entity.Person;
import projet.exception.NotFoundException;
import projet.persistance.PersonRepository;
import projet.services.IpersonService;

@Service
@Transactional //
public class personService implements IpersonService{
	
	
	@Autowired
	private PersonRepository personRepository; //
	
	@Autowired
	private ModelMapper modelMapper; //converti un objet
	
	@Override 
	public List<PersonDto> getPerson() {
		return personRepository.findAll() //on recuperer les personnes (ceci est une maniere de gerer l'iteration)
			.stream() // range les objet
			.map(entity -> modelMapper.map(entity, PersonDto.class)) //intercepte les objet (entity) de stream et converti les objets
			.collect(Collectors.toList()); // à la fin on ensemble les elements et on les range dans une liste
	}
	
	public PersonDto getPerson(Long id) {
		Optional <Person> optPerson = personRepository.findById(id); 
		if(optPerson.isPresent()) return modelMapper.map(optPerson, PersonDto.class); 
		throw new NotFoundException("No one with this id : " + id); 
	}
	
//	@Override 
//	public Person getPerson(@PathVariable Long id) throws org.springframework.data.crossstore.ChangeSetPersister.NotFoundException {
//		return personRepository.findById(id).orElseThrow(() -> new NotFoundException(null));
//	}
	
	@Override 
	public Person save(@RequestBody Person person) {
		return personRepository.save(person);
	}
	
	
	@Override 
	public void deleteById(@PathVariable Long id) {
		personRepository.deleteById(id);
}


	
	}

