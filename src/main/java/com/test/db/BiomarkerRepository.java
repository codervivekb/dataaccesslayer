package com.test.db;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface BiomarkerRepository extends CrudRepository<Biomarker, Long>{

	public List<Biomarker> findByName(String name);
	
}
