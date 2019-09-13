package com.assignment.fyleassignment.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.assignment.fyleassignment.entity.BankDetails;
import com.assignment.fyleassignment.service.BankDetailsService;

@RestController
@RequestMapping("/bankDetails")
public class BankDetailsController {

	@Autowired
	BankDetailsService bankDetailsService;

	@RequestMapping(value = "/{IFSC}", method = RequestMethod.GET)
	public BankDetails getBankDetailsFromIFSC(@PathVariable("IFSC") String IFSC) {
		return bankDetailsService.getBankDetailsFromIFSC(IFSC);
	}

	@RequestMapping(value = "/getBankDetailsFromCity/{bankName}", method = RequestMethod.GET)
	public List<BankDetails> getBankDetailsFromBankNameAndCity(@PathVariable("bankName") String bankName,
			@RequestParam("city") String city, @RequestParam("limit") String limit,
			@RequestParam("offset") String offset) {
		return bankDetailsService.getBankDetailsFromBankNameAndCity(bankName, city, Integer.valueOf(limit),
				Integer.valueOf(offset));
	}

}