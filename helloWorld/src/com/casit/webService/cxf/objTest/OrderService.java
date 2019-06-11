package com.casit.webService.cxf.objTest;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface OrderService {
	@WebMethod
	public Order getOrder(String OrderNo);
}
