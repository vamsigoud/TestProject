
package com.vz.pojos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "recommendation" })
public class RecommendationRes {

	@JsonProperty("recommendation")
	private Recommendation recommendation;

	@JsonProperty("recommendation")
	public Recommendation getRecommendation() {
		return recommendation;
	}

	@JsonProperty("recommendation")
	public void setRecommendation(Recommendation recommendation) {
		this.recommendation = recommendation;
	}

}
