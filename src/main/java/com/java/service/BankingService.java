package com.java.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.model.Banking;
import com.java.repository.BankingRepository;

@Service
public class BankingService {

	@Autowired
	private BankingRepository repository;
	
	public Banking getByIdCard(long id_card) {
		return repository.findById(id_card).get();
	}
	
	public boolean isExistBanking(long id_card) {
		return repository.existsById(id_card);
	}

	public void save(Banking momo) {
		repository.save(momo);
	}
}
