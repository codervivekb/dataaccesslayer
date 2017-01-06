package com.test.db;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcessRepository extends CrudRepository<Process, Long> {
	
	List<Process> findByName(String name);

	

}
