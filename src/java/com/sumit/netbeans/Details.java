/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sumit.netbeans;

/**
 *
 * @author c_ssaurab
 */
public class Details {

	private int id;
	private String customer;
	private String iCCID;
	private String mSISDN;
	private String recieve_Time;
	private String message;
	public Details(int id, String customer, String iCCID, String mSISDN, String recieve_Time, String message) {
		
		this.id = id;
		this.customer = customer;
		this.iCCID = iCCID;
		this.mSISDN = mSISDN;
		this.recieve_Time = recieve_Time;
		this.message = message;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustomer() {
		return customer;
	}
	public void setCustomer(String customer) {
		this.customer = customer;
	}
	public String getiCCID() {
		return iCCID;
	}
	public void setiCCID(String iCCID) {
		this.iCCID = iCCID;
	}
	public String getmSISDN() {
		return mSISDN;
	}
	public void setmSISDN(String mSISDN) {
		this.mSISDN = mSISDN;
	}
	public String getRecieve_Time() {
		return recieve_Time;
	}
	public void setRecieve_Time(String recieve_Time) {
		this.recieve_Time = recieve_Time;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
	

}

