package com.finance.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finance.model.CardDetails;
import com.finance.model.ProductHistory;
import com.finance.model.User;
import com.finance.repository.CardDetailsRepository;
import com.finance.repository.UserRepository;
import com.finance.service.FinanceService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("financeRest/api")

public class FinanceController {
	@Autowired
	 FinanceService finSer;
	 
	 @Autowired
	 UserRepository usRep;
	 
	 @Autowired
	 CardDetailsRepository cdRep;
	 
	 
	  //Details of user transaction history
     @GetMapping("/financeHistory/{regid}")
     public List<ProductHistory> getProducts(@PathVariable(value="regid")int regid){
   	  return finSer.getProducts(regid);
     }
     //Details of User from user table.
     @GetMapping("/details/{regid}")
     public User getDetails(@PathVariable(value="regid")long regid) {
   	  return finSer.getDetailsByRegId(regid);
     }
   //Just for testing
     @GetMapping("/alldetails")
     public List<User> getAllDetails() {
   	  return finSer.getAllDetails();
     }
     
     
     //Just for testing
     @PostMapping("/addetails")
     public String addDetails(@RequestBody User userDet) {
   	 return finSer.addDetails(userDet);
     }
     @GetMapping("/carddetails/{regid}")
     public CardDetails getCardDet(@PathVariable(value="regid")long regid){
   	  return finSer.getCardDetailsByRegId(regid);
     }
     

}
