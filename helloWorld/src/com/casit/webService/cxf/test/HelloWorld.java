package com.casit.webService.cxf.test;

import javax.jws.WebMethod;
import javax.jws.WebService;
/**
 * 
   * @�� ���� HelloWorld
   * @���������� TODO
   * @������Ϣ�� wangle
   * @����ʱ�䣺 2018��7��21������4:44:07
   * @�޸ı�ע��
 */
@WebService
public interface HelloWorld {
	@WebMethod
	public String hello(String name);
}
