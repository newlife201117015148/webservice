package com.casit.webService.helloWebService;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.xml.ws.Endpoint;
/**
 * 
   * @类 名： HelloWebService
   * @功能描述： 测试apache自带的webservice的API
   * @作者信息： wangle
   * @创建时间： 2018年7月21日下午4:36:11
   * @修改备注：
 */
@WebService
@SOAPBinding(style=Style.RPC)
public class HelloWebService {
	/**
	 * 
	   * @Title : helloWord 
	   * @功能描述: 操作
	   * @设定文件：@param name
	   * @设定文件：@return 
	   * @返回类型：String 
	   * @throws ：
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
