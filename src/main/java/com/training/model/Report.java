package com.training.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="report")
public class Report {
	
	
	private int id ; 
	private BigDecimal sales;
	private int qty ; 
	private String staffName ; 
	private Date date ;
	
	@XmlAttribute(name="id")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@XmlAttribute(name="sales")
	public BigDecimal getSales() {
		return sales;
	}
	public void setSales(BigDecimal sales) {
		this.sales = sales;
	}
	
	@XmlAttribute(name="qty")
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	
	@XmlAttribute(name="staffName")
	public String getStaffName() {
		return staffName;
	}
	public void setStaffName(String staffName) {
		this.staffName = staffName;
	}
	@XmlAttribute(name="date")
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	} 
	
	public String toString() {
		return "Report [id="+id + ", sales="+sales + ", staffName="+staffName+ ", date="+date+"]";
	}
}
