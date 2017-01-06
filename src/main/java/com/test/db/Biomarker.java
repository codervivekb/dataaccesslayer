package com.test.db;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Biomarker {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String name;
    private String symbol;
    
    protected Biomarker() {
		// TODO Auto-generated constructor stub
	}
    
     public Biomarker(String name, String symbol) {
    	 this.name = name;
    	 this.symbol = symbol;
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

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	@Override
    public String toString() {
        return String.format(
                "Biomarker[id=%d, name='%s', symbol='%s']",
                id, name, symbol);
    }

}
