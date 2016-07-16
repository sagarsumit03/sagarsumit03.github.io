package com.sumit.careercup;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/*
 * https://www.careercup.com/question?id=5690180687101952
 */

class CityAddress{
	String city;
	String state;
	
	public CityAddress(String city, String state) {
		super();
		this.city = city;
		this.state = state;
	}
}

class Address {

	String stateCode;
	CityAddress address;

	public Address(String stateCode, CityAddress address) {
		super();
		this.stateCode = stateCode;
		this.address = address;
	}
}

public class LoopIt {
	public static void main(String[] args) {
		CityAddress cAdd = new CityAddress("Bhopal", "Madya Pradesh");
		CityAddress cAdd1 = new CityAddress("Hyderabad", "Andhra Pradesh");
		CityAddress cAdd2 = new CityAddress("Bangalore", "Karnataka");
		Address add  = new Address("MP", cAdd);
		Address add1  = new Address("AP", cAdd1);
		Address add2  = new Address("KA", cAdd2);
		
		
		
		List<Object> list = new ArrayList<>(); 
		Map<Integer, Address> map = new HashMap<>(); 
		map.put(1, add);
		map.put(2, add1);
		map.put(3, add2);
		list.add("Sumit");
		list.add(123);
		list.add(12.90);
		list.add(map);
		for(Object e : list){
			System.out.println(e);
			Iterator<Object> iterate = ((List<Object>) map).iterator();
			while(iterate.hasNext()){
				System.out.println(iterate.next());
			}
		}
		
	}
}
