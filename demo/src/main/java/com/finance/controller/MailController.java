package com.finance.controller;


	import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PostMapping;
	import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

	import com.finance.model.MailDetails;
	import com.finance.repository.MailService;

	@RestController
	@CrossOrigin(origins="http://localhost:4200")
	@RequestMapping("/api")
	public class MailController {

		 @Autowired 
		 private MailService emailService;
		 
		    @PostMapping("/sendMail")
		    public String
		    sendMail(@RequestBody MailDetails details)
		    {
		        String status
		            = emailService.sendSimpleMail(details);
		 
		        return status;
		    }
		    
		    @GetMapping("/forgetPassword/{email}")
		    public String forgetPassword(@PathVariable String email,@RequestBody MailDetails details )
		    {
		    	String status=emailService.forgetPassword(email);
		    	return status;
		    }
		    
	}

