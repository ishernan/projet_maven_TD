package projet.services;

import java.util.List;

import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;

import projet.Dto.PersonDto;
import projet.entity.Person;

public interface IpersonService {

	List<PersonDto> getPerson();

	PersonDto getPerson(Long id) throws NotFoundException;

	Person save(Person person);

	void deleteById(Long id);

}
