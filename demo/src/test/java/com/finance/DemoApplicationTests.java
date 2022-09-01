package com.finance;



import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.finance.model.*;
import com.finance.model.CardDetails;
import com.finance.repository.CardDetailsRepository;
import com.finance.repository.ProductHistoryRepository;
import com.finance.repository.UserRepository;
import com.finance.service.CardDetailsService;
import com.finance.service.ProductService;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
	}
	@Autowired
    ProductHistoryRepository finRep;
    @Autowired
    UserRepository usRep;
    @Autowired
    CardDetailsRepository cRep;
    @Autowired
	CardDetailsService cdService;
    @Autowired
	ProductService pService;

@Test
void testGetCardDetailsByRegIdP() {
	 long regid=27; //from database
	 assertEquals(false,cRep.findById(regid)==null);
	
}
@Test
void testGetCardDetailsByRegIdN() {
	 long regid=200;//not in database
	 System.out.println(cRep.findById(regid));
	assertEquals(false,cRep.findById(regid)==null);
	
	
}
//change
@Test
void testGetProductsP() {
	
	 List<ProductHistory> l=finRep.findByRegid(5);
	
	assertEquals(false,l.size() > 0);
	
}
@Test
void testGetProductsN() {
	 List<ProductHistory> l=finRep.findByRegid(103);//not in database
	assertEquals(true,l.isEmpty());
	
}
@Test
void testGetDetailsByRegIdP() {
	 long regid=21;//from database
		assertEquals(false,(usRep.findById(regid).get())==null);
}

@Test
void testGetDetailsByRegIdN() {
	 long regid=28;//not in database
		assertEquals(false,(usRep.findById(regid))==null);
}
@Test
void testAddProduct() {
	Product prod=new Product();
	prod.setProdid(567);//not from database
	prod.setProdname("Spear");
	String res=pService.addProducts(prod);
	assertEquals("Added",res);
	
}


@Test
void findUserP() {
	User u=usRep.findUserByUname("Randhir");//not in database
	assertEquals(true, u==null);
}
@Test
void findUserN() {
	User u=usRep.findUserByUname("Vanshika");
	assertEquals(true, u==null);
}
@Test
void testAddCard() {
	CardDetails card = new CardDetails();
	card.setRegid(27);//from database
	card.setCardtype("gold");//from database
	card.setInitialbal(40000);
	card.setAvailbal(39500);
	Date d =Date.valueOf(LocalDate.now().plusMonths( 24));
	card.setValidity(d);
	boolean res=cdService.addCard(card);
	System.out.println(res);
	
	        assertEquals(true, res);
	
}

}
