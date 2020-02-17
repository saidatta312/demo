package com.capg.user;

import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.capg.bean.Customer;
import com.capg.dao.Dao;

public class User {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		Dao dao = new Dao();
		while(true) {
			System.out.println("Menu");
			System.out.println("1.add");
			System.out.println("display");
			System.out.println("exit");
			System.out.println("enter your choice");
			int choice = sc.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Enter Customer id:");
				int cid = sc.nextInt();
				System.out.println("enter customer name");
				String name = sc.next();
				System.out.println("enter salary of customer :");
				double amount = sc.nextDouble();
				Customer c1 = new Customer();
				c1.setCid(cid);
				c1.setCname(name);
			c1.setAmount(amount);
			boolean s = dao.addCustomer(c1);
			if(s) 
				System.out.println("customer is added");
				else {
					System.out.println("customer is not added");
				}
			break;
			case 2:
				Map m = dao.getAllCustomer();
				Set set = m.keySet();
				Iterator itr = set.iterator();
				while(itr.hasNext()) {
					/*Object obj = (Object)itr.next();
					System.out.prntiln(obj);
					*/
					Integer key= (Integer)itr.next();
					System.out.println(m.get(key));
				}
			break;
			case 3:
				System.exit(0);
				break;
				default:
					System.out.println("Invalid choice");
			
			
			
			
			}
			
			
			}
		}
	}


