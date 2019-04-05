package com.mygateac.bo;

import java.io.Serializable;

public class FlatBo implements Serializable {
	protected int flatNo;
	protected String flatType;
	protected int floor;
	protected String facing;
	protected int sqft;
	protected int ownerNo;
	protected int blockNo;

	public FlatBo(int flatNo, String flatType, int floor, String facing, int sqft, int ownerNo, int blockNo) {
		super();
		this.flatNo = flatNo;
		this.flatType = flatType;
		this.floor = floor;
		this.facing = facing;
		this.sqft = sqft;
		this.ownerNo = ownerNo;
		this.blockNo = blockNo;
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

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}

	public String getFacing() {
		return facing;
	}

	public void setFacing(String facing) {
		this.facing = facing;
	}

	public int getSqft() {
		return sqft;
	}

	public void setSqft(int sqft) {
		this.sqft = sqft;
	}

	public int getOwnerNo() {
		return ownerNo;
	}

	public void setOwnerNo(int ownerNo) {
		this.ownerNo = ownerNo;
	}

	public int getBlockNo() {
		return blockNo;
	}

	public void setBlockNo(int blockNo) {
		this.blockNo = blockNo;
	}

}
