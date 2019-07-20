
package com.vz.pojos;

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
