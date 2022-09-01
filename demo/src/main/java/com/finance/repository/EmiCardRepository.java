package com.finance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.finance.model.EmiCard;

@Repository
public interface EmiCardRepository extends JpaRepository<EmiCard, String>{

}