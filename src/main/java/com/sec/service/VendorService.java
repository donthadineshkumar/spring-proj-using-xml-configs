package com.sec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import com.sec.entities.Quote;
import com.sec.repository.VendorRepository;


@Service
public class VendorService {

	@Autowired
	VendorRepository vendorRepo;
	
	@Cacheable("quotesCache")
	public void addQuote(Quote quote){
		vendorRepo.addQuote(quote);
	}
	
	/*
	 * As Cacheable is enabled here, before the execution
	 * of this method - it needs to check the cache for its results
	 * if found - it does not need to fetch again by quering 
	 * the select query on the underlying database.
	 */
	
	@Cacheable("quotesCache")
	public List<Quote> findAll(){
		return vendorRepo.findAll();
	}

}


