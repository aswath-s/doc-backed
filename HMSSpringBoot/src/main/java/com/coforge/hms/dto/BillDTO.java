package com.coforge.hms.dto;

import java.util.Date;

import com.coforge.hms.model.Bill;
import com.coforge.hms.model.Patient;

public class BillDTO {

	private long bId;
	private double bAmt;
	private Patient patient;
	private Date billDate;

	public long getbId() {
		return bId;
	}

	public void setbId(long bId) {
		this.bId = bId;
	}

	public double getbAmt() {
		return bAmt;
	}

	public void setbAmt(double bAmt) {
		this.bAmt = bAmt;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	
	

	public Date getBillDate() {
		return billDate;
	}

	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}


	public BillDTO(Bill bill) {

		this.bId = bill.getbId();
		this.bAmt = bill.getbAmt();
		this.patient = bill.getPatient();
		this.billDate = bill.getBillDate();
	}

	public BillDTO() {
	}
}
