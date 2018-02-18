package com.nt.beans;

import javax.inject.Named;

@Named("blueDart")
public class BlueDart implements Courier {

	@Override
	public String deliver(int orderId) {
		
		return "delivering Order with OrderId::"+orderId;
	}

}
