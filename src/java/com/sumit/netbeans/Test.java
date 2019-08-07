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
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "test")
@RequestScoped
public class Test {
	
	private List<Details> list;
	
	@PostConstruct
	void init() 
	{
		list = new ArrayList<>();
		list.add(new Details(1, "Philips", "123", "acd", "9:10AM", "Message could not recieve"));
		list.add(new Details(2, "LG", "345", "cxz", "9:30AM", "Out of Internet"));
		list.add(new Details(3, "Samsung", "754", "ads", "10:10AM", "I am fine"));
		list.add(new Details(4, "Robert & Bosch", "162", "fjg", "12:10PM", "Internet is fine"));
		list.add(new Details(5, "ATT", "493", "tyu", "1:10PM", "No idea"));
	}

	public List<Details> getList() {
		return list;
	}

}

