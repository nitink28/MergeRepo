package com.finance.repository;


	import com.finance.model.MailDetails;

	public interface MailService {
		 String sendSimpleMail(MailDetails details);
		 String forgetPassword(String email);
	}

