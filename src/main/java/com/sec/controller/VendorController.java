package com.sec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sec.entities.Quote;
import com.sec.service.VendorService;


@Controller
@RequestMapping(value="vendor")
public class VendorController {
	
	@Autowired
	VendorService vendorService;
	
	
	@RequestMapping(value="/home")
	public String vendor(){
		return "vendor";
	}

	@RequestMapping("/profile")
	public String profile(){
		return "vendorprofile";
	}
	
	@RequestMapping(value="/quotes/json",
			produces={"application/xml;q=0.6","application/json;q=0.4"})	
	public @ResponseBody List<Quote> quotesjson(Model model){
		return  vendorService.findAll();
	}
	
	@RequestMapping(value="/quote/json",
			produces={"application/xml"})	
	@ResponseBody 
	public Quote quotejson(){
		Quote quote = new Quote();
		quote.setName("Xtra");
		return  quote;
	}
	
	@RequestMapping(value="/quotes")
	public String quotes(Model model){
		model.addAttribute("quotes", vendorService.findAll());
		return "quotes";
	}
	
	@RequestMapping("/quotation")
	public String quote(Model model){
		model.addAttribute("quote", new Quote());
		return "newquote";
	}
	
	@RequestMapping(value="/quotation", method=RequestMethod.POST)
	public String addquote(Quote quote, Model model){
		vendorService.addQuote(quote);
		model.addAttribute("quote", quote);
		return "quotedetails";
	}
	
	
}
