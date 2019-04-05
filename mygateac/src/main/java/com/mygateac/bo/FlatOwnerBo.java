package com.mygateac.bo;

import java.io.Serializable;

public class FlatOwnerBo implements Serializable {
	protected FlatBo flat;
	protected OwnerBo owner;

	public FlatBo getFlat() {
		return flat;
	}

	public void setFlat(FlatBo flat) {
		this.flat = flat;
	}

	public OwnerBo getOwner() {
		return owner;
	}

	public void setOwner(OwnerBo owner) {
		this.owner = owner;
	}

}
