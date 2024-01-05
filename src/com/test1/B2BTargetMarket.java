package com.test1;

public class B2BTargetMarket {
	private String customer;
	private String sellingEffort;
	private String primaryAudience;
	private String primaryBuyer;
	private String targetAudience;
	private String targetBuyer;
	private String currentBase;
	private String markettingEffort;
	private String charecteristics;

	public B2BTargetMarket() {

	}

	public B2BTargetMarket(String customer, String sellingEffort, String primaryAudience, String primaryBuyer,
			String targetAudience, String targetBuyer, String currentBase, String markettingEffort,
			String charecteristics) {
		super();
		this.customer = customer;
		this.sellingEffort = sellingEffort;
		this.primaryAudience = primaryAudience;
		this.primaryBuyer = primaryBuyer;
		this.targetAudience = targetAudience;
		this.targetBuyer = targetBuyer;
		this.currentBase = currentBase;
		this.markettingEffort = markettingEffort;
		this.charecteristics = charecteristics;
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public String getSellingEffort() {
		return sellingEffort;
	}

	public void setSellingEffort(String sellingEffort) {
		this.sellingEffort = sellingEffort;
	}

	public String getPrimaryAudience() {
		return primaryAudience;
	}

	public void setPrimaryAudience(String primaryAudience) {
		this.primaryAudience = primaryAudience;
	}

	public String getPrimaryBuyer() {
		return primaryBuyer;
	}

	public void setPrimaryBuyer(String primaryBuyer) {
		this.primaryBuyer = primaryBuyer;
	}

	public String getTargetAudience() {
		return targetAudience;
	}

	public void setTargetAudience(String targetAudience) {
		this.targetAudience = targetAudience;
	}

	public String getTargetBuyer() {
		return targetBuyer;
	}

	public void setTargetBuyer(String targetBuyer) {
		this.targetBuyer = targetBuyer;
	}

	public String getCurrentBase() {
		return currentBase;
	}

	public void setCurrentBase(String currentBase) {
		this.currentBase = currentBase;
	}

	public String getMarkettingEffort() {
		return markettingEffort;
	}

	public void setMarkettingEffort(String markettingEffort) {
		this.markettingEffort = markettingEffort;
	}

	public String getCharecteristics() {
		return charecteristics;
	}

	public void setCharecteristics(String charecteristics) {
		this.charecteristics = charecteristics;
	}

}
