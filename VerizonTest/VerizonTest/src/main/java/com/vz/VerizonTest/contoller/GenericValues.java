
package com.vz.VerizonTest.contoller;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "neType",
    "value"
})
public class GenericValues {

    @JsonProperty("neType")
    private String neType;
    @JsonProperty("value")
    private Long value;
   

    public GenericValues() {
		super();
		// TODO Auto-generated constructor stub
	}

	public GenericValues(String key, Long value2) {
    	this.neType=key;
    	this.value=value2;
    	
		// TODO Auto-generated constructor stub
	}

	@JsonProperty("neType")
    public String getNeType() {
        return neType;
    }

    @JsonProperty("neType")
    public void setNeType(String neType) {
        this.neType = neType;
    }

    @JsonProperty("value")
    public Long getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(Long value) {
        this.value = value;
    }

}
