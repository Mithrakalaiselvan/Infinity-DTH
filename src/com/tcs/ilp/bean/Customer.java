package com.tcs.ilp.bean;

import java.util.Date;

public class Customer {
	private String customerID;
	private String firstName;
	private String lastName;
	private String emailId;
	private long mobileNo;
	private String address1;
	private String address2;
	private String landmark;
	private int pincode;
	private Date creationDate;
	private String operatorId;
	private String operatorName;
	private String retailerID;
	private String retailerName;
	
	public Customer(){
		
	}
	public Customer(String firstName, String lastName, String emailId, long mobileNo, String address1, String address2,
			String landmark, int pincode, String operatorId,
			String operatorName, String retailerID, String retailerName) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.mobileNo = mobileNo;
		this.address1 = address1;
		this.address2 = address2;
		this.landmark = landmark;
		this.pincode = pincode;
		
		this.operatorId = operatorId;
		this.operatorName = operatorName;
		this.retailerID = retailerID;
		this.retailerName = retailerName;
	}
	public Customer(String customerID, String firstName, String lastName,
			String emailId, long mobileNo, String address1, String address2,
			String landmark, int pincode, Date creationDate) {
		super();
		this.customerID = customerID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.mobileNo = mobileNo;
		this.address1 = address1;
		this.address2 = address2;
		this.landmark = landmark;
		this.pincode = pincode;
		this.creationDate = creationDate;
	}

	public String getCustomerID() {
		return customerID;
	}
	public void setCustomerID(String customerID) {
		this.customerID = customerID;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public long getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public String getOperatorId() {
		return operatorId;
	}
	public void setOperatorId(String operatorId) {
		this.operatorId = operatorId;
	}
	public String getOperatorName() {
		return operatorName;
	}
	public void setOperatorName(String operatorName) {
		this.operatorName = operatorName;
	}
	public String getRetailerID() {
		return retailerID;
	}
	public void setRetailerID(String retailerID) {
		this.retailerID = retailerID;
	}
	public String getRetailerName() {
		return retailerName;
	}
	public void setRetailerName(String retailerName) {
		this.retailerName = retailerName;
	}
	
}
