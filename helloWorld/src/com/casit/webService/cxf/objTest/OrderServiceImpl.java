package com.casit.webService.cxf.objTest;

import javax.jws.WebService;

@WebService
public class OrderServiceImpl implements OrderService {

	public Order getOrder(String OrderNo) {
		Order o = new Order();
		o.setID(1000);
		o.setOrderNo(OrderNo);
		o.setPrice(10.00f);
		System.out.println(o);
		return o;
	}

}
