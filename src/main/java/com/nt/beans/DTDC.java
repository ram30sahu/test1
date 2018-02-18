package com.nt.beans;

import javax.inject.Named;

@Named("dtdc")
public class DTDC implements Courier {

	@Override
	public String deliver(int orderId) {

 return "delivering Order with OrderId::"+orderId;
	}

}
