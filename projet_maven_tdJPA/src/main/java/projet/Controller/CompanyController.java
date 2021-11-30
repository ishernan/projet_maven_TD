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

import projet.entity.Company;
import projet.exception.NotFoundException;
import projet.persistance.Companyrepository;


@RestController
@RequestMapping(path = "/api/company")
public class CompanyController {
	
	@Autowired
	private Companyrepository companyRepository;
	
	@GetMapping
	public List<Company> getCompany() {
		return companyRepository.findAll();
	}
	
	@GetMapping(path = "/{id}")
	public Company getCompany(@PathVariable Long id) {
		return companyRepository.findById(id).orElseThrow(() -> new NotFoundException("Author ID " + id + " could not be found !"));
	}
	
	@PostMapping
	public Company savePerson(@RequestBody Company company) {
		return companyRepository.save(company);
	}
	
	@DeleteMapping(path = "/{id}")
	@ResponseStatus(code = HttpStatus.OK)
	public void deletePerson(@PathVariable Long id) {
		companyRepository.deleteById(id);
}


	
	}

