package com.test.db;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface BiomarkerRepository extends CrudRepository<Biomarker, Long>{

	List<Biomarker> findByName(String name);
	
}
