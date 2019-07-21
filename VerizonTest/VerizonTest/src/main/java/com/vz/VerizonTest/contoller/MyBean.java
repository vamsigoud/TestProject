package com.vz.VerizonTest.contoller;

public class MyBean {
	private long fuzePlanId;
	private long augmentId;
	private String thresholdLevel;
	private String augmentStatus;
	private String neType;
	

	public MyBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyBean(long fuzePlanId, long augmentId, String thresholdLevel, String augmentStatus, String neType) {
		super();
		this.fuzePlanId = fuzePlanId;
		this.augmentId = augmentId;
		this.thresholdLevel = thresholdLevel;
		this.augmentStatus = augmentStatus;
		this.neType = neType;
	}

	public long getFuzePlanId() {
		return fuzePlanId;
	}

	public void setFuzePlanId(long fuzePlanId) {
		this.fuzePlanId = fuzePlanId;
	}

	public long getAugmentId() {
		return augmentId;
	}

	public void setAugmentId(long augmentId) {
		this.augmentId = augmentId;
	}

	public String getThresholdLevel() {
		return thresholdLevel;
	}

	public void setThresholdLevel(String thresholdLevel) {
		this.thresholdLevel = thresholdLevel;
	}

	public String getAugmentStatus() {
		return augmentStatus;
	}

	public void setAugmentStatus(String augmentStatus) {
		this.augmentStatus = augmentStatus;
	}

	public String getNeType() {
		return neType;
	}

	public void setNeType(String neType) {
		this.neType = neType;
	}

}
