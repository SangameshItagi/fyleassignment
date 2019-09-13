package com.assignment.fyleassignment.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.assignment.fyleassignment.entity.BankDetails;
import com.assignment.fyleassignment.entity.Banks;
import com.assignment.fyleassignment.repository.BankDetailsRepository;
import com.assignment.fyleassignment.repository.BanksRepository;

@Service
public class BankDetailsService {

	@Autowired
	BankDetailsRepository bankDetailsRepository;

	@Autowired
	BanksRepository banksRepository;

	public BankDetails getBankDetailsFromIFSC(String IFSC) {
		return bankDetailsRepository.findDetails(IFSC);
	}

	public List<BankDetails> getBankDetailsFromBankNameAndCity(String bankName, String city, Integer limit,
			Integer offset) {
		Banks id = banksRepository.findByName(bankName);
		List<BankDetails> lBD = bankDetailsRepository.findByIdAndCity(id.getId(), city, limit, offset);
		return lBD;
	}

}
