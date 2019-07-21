
package com.vz.VerizonTest.contoller;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "inProgress"
})
public class Recommendation {

    @JsonProperty("inProgress")
    private InProgress inProgress;
    private InHold inHold;
    
    @JsonProperty("inProgress")
    public InProgress getInProgress() {
        return inProgress;
    }

    @JsonProperty("inProgress")
    public void setInProgress(InProgress inProgress) {
        this.inProgress = inProgress;
    }

	public InHold getInHold() {
		return inHold;
	}

	public void setInHold(InHold inHold) {
		this.inHold = inHold;
	}

}
