package com.kambok.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;
import org.springframework.web.bind.annotation.ExceptionHandler;
import com.kambok.dao.CompanyDao;
import com.kambok.model.*;



@Controller
public class CompanyController {
	
	@Autowired
	private CompanyDao companyDao;
	
	@RequestMapping("/")
	public String home(Model model)
	{
		List<Company> company= companyDao.getAllCompany();
		model.addAttribute("companies", company);
		return "index";
	}
	
	//shows add company form 
	@RequestMapping("/add-company")
	public String addCompany(Model model)
	{
		model.addAttribute("title", "Add Company");
		return "add_company";
	}
	
	//handle add company form request
	@RequestMapping(value="/submit-company",  method=RequestMethod.POST)
	public RedirectView handleCompany(@ModelAttribute Company company, HttpServletRequest request)
	{
		companyDao.createCompany(company);
		Home h=new Home();
		h.setAddress(company.getName());
		h.setState(company.getHeadquarter());
		companyDao.createHomeAddress(h);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+ "/");
		return redirectView;
	}
	
	//delete handle request
	@RequestMapping("/delete/{companyId}")
	public RedirectView deleteCompany(@PathVariable("companyId") int id, HttpServletRequest request)
	{
		companyDao.deleteCompany(id);
		RedirectView redirectView = new RedirectView();
		redirectView.setUrl(request.getContextPath()+ "/");
		return redirectView;
	}
	
	//show update company form
	@RequestMapping("/update/{cId}")
	public String updateCompanyForm(@PathVariable("cId") int id, Model model)
	{
		Company company = this.companyDao.getSingleCompany(id);
		model.addAttribute("company", company);
		return "update_company";
	}

	
	
	@ExceptionHandler(value = Exception.class)
	public String AnyOtherHandler() {
		return "error";
	}
}
