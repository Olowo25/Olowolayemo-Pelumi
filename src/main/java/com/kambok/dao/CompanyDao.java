package com.kambok.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.kambok.model.*;



@Component
public class CompanyDao {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	
	//create a new company
	@Transactional
	public void createCompany(Company company)
	{
		this.hibernateTemplate.saveOrUpdate(company);
	}
	
	
	@Transactional
	public void createHomeAddress(Home hm )
	{
		this.hibernateTemplate.saveOrUpdate(hm);
	}
	
	//get all company
	public List<Company> getAllCompany()
	{
		List<Company> company = this.hibernateTemplate.loadAll(Company.class);
		return company;
	}
	
	//delete a single company
	@Transactional 
	public void deleteCompany(int cid)
	{
		Company company = this.hibernateTemplate.load(Company.class, cid);
		this.hibernateTemplate.delete(company);
	}
	
	//get a single company
	public Company getSingleCompany(int cid)
	{
		return this.hibernateTemplate.get(Company.class, cid);
	}

	
	
}
