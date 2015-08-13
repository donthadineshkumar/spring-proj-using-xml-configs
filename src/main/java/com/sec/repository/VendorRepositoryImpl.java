package com.sec.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.sec.entities.Quote;


@Repository
@Transactional
public class VendorRepositoryImpl implements VendorRepository{

	@PersistenceContext
	EntityManager em;
	
	@Override
	public void addQuote(Quote quote) {
		em.persist(quote);		
	}

	@Override	
	@Transactional(readOnly=true)
	public List<Quote> findAll() {
		//createQuery is hql SELECT * FROM Quote is wrong in HQL
		//if you want write native sql query - use createNativeQuery
		Query query =em.createQuery("SELECT q FROM Quote q");
		List<Quote> quotes=(List<Quote>)query.getResultList();
		return quotes;
	}

	@Override
	public void deleteQuote(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateQuote(int id) {
		// TODO Auto-generated method stub
		
	}
	
}
