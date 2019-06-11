package com.casit.webService.cxf.test;

import javax.jws.WebMethod;
import javax.jws.WebService;
/**
 * 
   * @类 名： HelloWorld
   * @功能描述： TODO
   * @作者信息： wangle
   * @创建时间： 2018年7月21日下午4:44:07
   * @修改备注：
 */
@WebService
public interface HelloWorld {
	@WebMethod
	public String hello(String name);
}
