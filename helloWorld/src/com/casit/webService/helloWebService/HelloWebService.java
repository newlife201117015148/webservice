package com.casit.webService.helloWebService;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.xml.ws.Endpoint;
/**
 * 
   * @�� ���� HelloWebService
   * @���������� ����apache�Դ���webservice��API
   * @������Ϣ�� wangle
   * @����ʱ�䣺 2018��7��21������4:36:11
   * @�޸ı�ע��
 */
@WebService
@SOAPBinding(style=Style.RPC)
public class HelloWebService {
	/**
	 * 
	   * @Title : helloWord 
	   * @��������: ����
	   * @�趨�ļ���@param name
	   * @�趨�ļ���@return 
	   * @�������ͣ�String 
	   * @throws ��
	 */
	@WebMethod
	public String helloWord(String name){
		
		return "Hello "+name;
	}
	
	public static void main(String[] args) {
		System.out.println("SSSS");
		Endpoint.publish("http://localhost:8091/helloworld", new HelloWebService());
	}
	
	
}
