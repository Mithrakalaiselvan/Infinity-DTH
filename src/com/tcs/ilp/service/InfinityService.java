package com.tcs.ilp.service;

import com.tcs.ilp.bean.Customer;
import com.tcs.ilp.dao.InfinityDAO;

public class InfinityService {
    InfinityDAO dao=new InfinityDAO();
	public int addCustomer(Customer c) {
		// TODO Auto-generated method stub
		int count=dao.addCustomer(c);
		return count;
		
	}

}
