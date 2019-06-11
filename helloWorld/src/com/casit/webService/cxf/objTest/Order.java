package com.casit.webService.cxf.objTest;

import org.apache.cxf.aegis.type.java5.IgnoreProperty;
import org.apache.cxf.aegis.type.java5.XmlAttribute;
import org.apache.cxf.aegis.type.java5.XmlElement;

public class Order {
	
	private int ID;
	private String OrderNo;
	private float Price;
	@XmlAttribute(name="_id_")
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	@XmlElement(name="_orderno_")
	public String getOrderNo() {
		return OrderNo;
	}
	public void setOrderNo(String orderNo) {
		OrderNo = orderNo;
	}
	@IgnoreProperty
	public float getPrice() {
		return Price;
	}
	public void setPrice(float price) {
		Price = price;
	}
	
}
