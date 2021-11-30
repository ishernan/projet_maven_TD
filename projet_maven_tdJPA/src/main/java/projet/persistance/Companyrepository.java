package projet.persistance;

import org.springframework.data.jpa.repository.JpaRepository;

import projet.entity.Company;

public interface Companyrepository extends JpaRepository<Company, Long> {

//	List<Company> findAll();
//
//	Company save(Company company);
//
//	Optional<Company> findById(Long id);
//
//	void deleteById(Long id);
	

}
