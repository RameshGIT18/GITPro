package com.mygateac.dto;

import java.io.Serializable;

public class FlatOwnerDto implements Serializable {
	protected int flatNo;
	protected String flatType;
	protected String facing;
	protected int floor;
	protected String ownerName;
	protected String mobileNo;
	protected String emailAddress;

	public FlatOwnerDto(int flatNo, String flatType, String facing, int floor, String ownerName, String mobileNo,
			String emailAddress) {
		this.flatNo = flatNo;
		this.flatType = flatType;
		this.facing = facing;
		this.floor = floor;
		this.ownerName = ownerName;
		this.mobileNo = mobileNo;
		this.emailAddress = emailAddress;
	}

	public int getFlatNo() {
		return flatNo;
	}

	public void setFlatNo(int flatNo) {
		this.flatNo = flatNo;
	}

	public String getFlatType() {
		return flatType;
	}

	public void setFlatType(String flatType) {
		this.flatType = flatType;
	}

	public String getFacing() {
		return facing;
	}

	public void setFacing(String facing) {
		this.facing = facing;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
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
