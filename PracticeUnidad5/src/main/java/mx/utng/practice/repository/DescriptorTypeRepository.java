package mx.utng.practice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import mx.utng.practice.model.DescriptorType;

@Repository
public interface DescriptorTypeRepository extends JpaRepository<DescriptorType,Long>{

	@Query("select descriptorType from DescriptorType descriptorType")
	public List<DescriptorType> findAll();
	
	
}
