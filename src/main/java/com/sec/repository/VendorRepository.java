package com.sec.repository;

import java.util.List;

import com.sec.entities.Quote;

public interface VendorRepository {

	public void addQuote(Quote quote);
	
	public List<Quote> findAll();
		
	public void deleteQuote(int id);
	
	public void updateQuote(int id);
	
	
}
