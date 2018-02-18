package com.nt.beans;

import java.util.Arrays;
import java.util.Random;

import javax.annotation.Resource;
import javax.inject.Named;
@Named("flipkart")
public class Flipkart {
	@Resource(name="blueDart")
	private Courier courier;
	public String Shopping(String items[]){
		Random random=null;
		int orderId=0;
		random=new Random();
		orderId=random.nextInt(1999);
		System.out.println(courier.deliver(orderId));
	    return Arrays.toString(items)+"are delivered";
	}

}
