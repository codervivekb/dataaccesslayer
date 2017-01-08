package com.test.db;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Process {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String name;
    
    protected Process() {
		// TODO Auto-generated constructor stub
	}
    
     public Process(Long id, String name) {
    	 this.name = name;
    	 this.id = id;
     }
    
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
    public String toString() {
        return String.format(
                "Process[id=%d, name='%s']",
                id, name);
    }

}
