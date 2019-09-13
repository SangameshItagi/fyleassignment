package com.assignment.fyleassignment.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bankdetails")
public class BankDetails {
	@Id
	String ifsc;
	Integer bankid;
	String branch;
	String address;
	String city;
	String district;
	String state;

	public BankDetails(String ifsc, Integer bankid, String branch, String address, String city, String district,
			String state) {
		super();
		this.ifsc = ifsc;
		this.bankid = bankid;
		this.branch = branch;
		this.address = address;
		this.city = city;
		this.district = district;
		this.state = state;
	}

	public BankDetails() {

	}

	public String getIfsc() {
		return ifsc;
	}

	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}

	public Integer getBankid() {
		return bankid;
	}

	public void setBankid(Integer bank_id) {
		this.bankid = bank_id;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
}