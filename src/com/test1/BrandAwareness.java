package com.test1;

public class BrandAwareness {
	private String brandCode;
	private String targetByProduct;
	private String targetByName;
	private boolean trainerReq;
	private boolean marketClosure;
	private String marketStep;
	private String purchaseMaker;
	private String serviceUser;
	private String marketLeader;
	private String brandHighlight;
	private String distinguishedQuality;

	public BrandAwareness() {

	}

	public BrandAwareness(String brandCode, String targetByProduct, String targetByName, boolean trainerReq,
			boolean marketClosure, String marketStep, String purchaseMaker, String serviceUser, String marketLeader,
			String brandHighlight, String distinguishedQuality) {
		super();
		this.brandCode = brandCode;
		this.targetByProduct = targetByProduct;
		this.targetByName = targetByName;
		this.trainerReq = trainerReq;
		this.marketClosure = marketClosure;
		this.marketStep = marketStep;
		this.purchaseMaker = purchaseMaker;
		this.serviceUser = serviceUser;
		this.marketLeader = marketLeader;
		this.brandHighlight = brandHighlight;
		this.distinguishedQuality = distinguishedQuality;
	}

	public String getBrandCode() {
		return brandCode;
	}

	public void setBrandCode(String brandCode) {
		this.brandCode = brandCode;
	}

	public String getTargetByProduct() {
		return targetByProduct;
	}

	public void setTargetByProduct(String targetByProduct) {
		this.targetByProduct = targetByProduct;
	}

	public String getTargetByName() {
		return targetByName;
	}

	public void setTargetByName(String targetByName) {
		this.targetByName = targetByName;
	}

	public boolean isTrainerReq() {
		return trainerReq;
	}

	public void setTrainerReq(boolean trainerReq) {
		this.trainerReq = trainerReq;
	}

	public boolean isMarketClosure() {
		return marketClosure;
	}

	public void setMarketClosure(boolean marketClosure) {
		this.marketClosure = marketClosure;
	}

	public String getMarketStep() {
		return marketStep;
	}

	public void setMarketStep(String marketStep) {
		this.marketStep = marketStep;
	}

	public String getPurchaseMaker() {
		return purchaseMaker;
	}

	public void setPurchaseMaker(String purchaseMaker) {
		this.purchaseMaker = purchaseMaker;
	}

	public String getServiceUser() {
		return serviceUser;
	}

	public void setServiceUser(String serviceUser) {
		this.serviceUser = serviceUser;
	}

	public String getMarketLeader() {
		return marketLeader;
	}

	public void setMarketLeader(String marketLeader) {
		this.marketLeader = marketLeader;
	}

	public String getBrandHighlight() {
		return brandHighlight;
	}

	public void setBrandHighlight(String brandHighlight) {
		this.brandHighlight = brandHighlight;
	}

	public String getDistinguishedQuality() {
		return distinguishedQuality;
	}

	public void setDistinguishedQuality(String distinguishedQuality) {
		this.distinguishedQuality = distinguishedQuality;
	}

}
