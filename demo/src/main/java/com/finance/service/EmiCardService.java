package com.finance.service;

import java.util.List;

import com.finance.model.EmiCard;

public interface EmiCardService {
	public List<EmiCard> getAllEmiCard();
	public boolean addEmiCard(EmiCard emiCard);

}
