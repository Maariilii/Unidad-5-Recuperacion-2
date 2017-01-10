package mx.utng.practice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import mx.utng.practice.model.Fruit;

@Repository
public interface FruitRepository extends JpaRepository<Fruit,Long>{

	@Query("select fruit from Fruit fruit")
	public List<Fruit> findAll();
	
	
}
