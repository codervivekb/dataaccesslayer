package com.test.db;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

//@SpringBootApplication
public class MyApp {
	
	public static void main(String... arg){
		
		SpringApplication.run(MyApp.class);
		
	}
	
	@Bean
	public CommandLineRunner checkDB(BiomarkerRepository repo){
		return (args) -> {
			
			repo.save(new Biomarker("test1", "T1"));
			repo.save(new Biomarker("test2", "T2"));
			repo.save(new Biomarker("test3", "T3"));
			repo.save(new Biomarker("test4", "T4"));
			repo.save(new Biomarker("test5", "T5"));
			
			for (Biomarker bm : repo.findAll()){
				System.out.println(bm.toString());
			}
			
		};
		
	}
}
