package mx.utng.practice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import mx.utng.practice.model.Telephone;

@Repository
public interface TelephoneRepository extends JpaRepository<Telephone, Long>{

	
	@Query("select telephone from Telephone telephone")
	public List<Telephone> findAll();
}
