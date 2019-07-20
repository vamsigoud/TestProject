package com.vz.pojos;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class InHold {


	@JsonProperty("critical")
	private List<GenericValues> critical = null;
	@JsonProperty("high")
	private List<GenericValues> high = null;

	public List<GenericValues> getCritical() {
		return critical;
	}

	public void setCritical(List<GenericValues> critical) {
		this.critical = critical;
	}

	public List<GenericValues> getHigh() {
		return high;
	}

	public void setHigh(List<GenericValues> high) {
		this.high = high;
	}


}
