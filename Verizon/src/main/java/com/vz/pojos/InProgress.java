
package com.vz.pojos;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "critical", "high" })
public class InProgress {

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
