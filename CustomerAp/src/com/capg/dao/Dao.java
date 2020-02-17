package com.capg.dao;

import java.util.HashMap;
import java.util.Map;

import com.capg.bean.Customer;

public class Dao {

	
		Map<Integer,Customer>  map=  new HashMap<Integer,Customer>();
		
		
		
	public boolean addCustomer(Customer c1)
{
		map.put(c1.getCid(), c1) ;
	if(c1!=null)	{
		
	
	return true;
	}
	else 
		return false;
	
}
	public Map getAllCustomer() {
		return map;
	}
}
