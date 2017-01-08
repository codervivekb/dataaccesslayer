package com.test.db;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyApp implements CommandLineRunner {

	@Autowired
	private BiomarkerRepository biomarkerRepository;

	public static void main(String... arg) {

		SpringApplication.run(MyApp.class, arg);

	}

//	@Bean
//	public CommandLineRunner checkDB(BiomarkerRepository repo) {
//		return (args) -> {
//
//			repo.save(new Biomarker("test1", "T1"));
//			repo.save(new Biomarker("test2", "T2"));
//			repo.save(new Biomarker("test3", "T3"));
//			repo.save(new Biomarker("test4", "T4"));
//			repo.save(new Biomarker("test5", "T5"));
//
//			for (Biomarker bm : repo.findAll()) {
//				System.out.println(bm.toString());
//			}
//
//		};
//
//	}

	@Override
	public void run(String... arg0) throws Exception {
		biomarkerRepository.deleteAll();
		
		
//		biomarkerRepository.save(new Biomarker("test1", "T1",1L));
//		biomarkerRepository.save(new Biomarker("test2", "T2", 2L));
//		biomarkerRepository.save(new Biomarker("test3", "T3",3L));
//		biomarkerRepository.save(new Biomarker("test4", "T4", 4L));
//		biomarkerRepository.save(new Biomarker("test5", "T5", 5L));
//		
//		

		biomarkerRepository.save(new Biomarker("test1", "T1"));
		biomarkerRepository.save(new Biomarker("test2", "T2"));
		biomarkerRepository.save(new Biomarker("test3", "T3"));
		biomarkerRepository.save(new Biomarker("test4", "T4"));
		biomarkerRepository.save(new Biomarker("test5", "T5"));
		
		
		for (Biomarker marker : biomarkerRepository.findByName("test1")) {
			System.out.println(marker.getSymbol());
		}
		
		
	}
}
