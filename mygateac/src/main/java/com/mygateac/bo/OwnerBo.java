package com.mygateac.bo;

import java.io.Serializable;
import java.util.Date;

public class OwnerBo implements Serializable {
	protected int ownerNo;
	protected String firstName;
	protected String lastName;
	protected Date dob;
	protected String gender;
	protected String mobileNo;
	protected String emailAddress;

	public OwnerBo(int ownerNo, String firstName, String lastName, Date dob, String gender, String mobileNo,
			String emailAddress) {
		super();
		this.ownerNo = ownerNo;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.gender = gender;
		this.mobileNo = mobileNo;
		this.emailAddress = emailAddress;
	}

	public int getOwnerNo() {
		return ownerNo;
	}

	public void setOwnerNo(int ownerNo) {
		this.ownerNo = ownerNo;
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

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

}
