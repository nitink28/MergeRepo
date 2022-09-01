package com.finance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.finance.model.EmiCard;
import com.finance.repository.EmiCardRepository;
@Service
@Transactional
public class EmiCardServiceImpl implements EmiCardService {


	@Autowired
	EmiCardRepository emicardrepo;
	
	@Override
	public List<EmiCard> getAllEmiCard() {
		return emicardrepo.findAll();
	}

	@Override
	public boolean addEmiCard(EmiCard emiCard) {
		emicardrepo.save(emiCard);
		return true;
	}
}
