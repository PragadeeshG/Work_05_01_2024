package com.test1;

public class B2BAction {
	private String market;
	private String buyers;
	private String transactTogether;
	private String widerRelevance;
	private String productsOrServices;
	private String onlineMarket;
	private String physicalSetting;
	private String seller;
	private String sellerInteraction;
	private String companySite;

	public B2BAction() {

	}

	public B2BAction(String market, String buyers, String transactTogether, String widerRelevance,
			String productsOrServices, String onlineMarket, String physicalSetting, String seller,
			String sellerInteraction, String companySite) {
		super();
		this.market = market;
		this.buyers = buyers;
		this.transactTogether = transactTogether;
		this.widerRelevance = widerRelevance;
		this.productsOrServices = productsOrServices;
		this.onlineMarket = onlineMarket;
		this.physicalSetting = physicalSetting;
		this.seller = seller;
		this.sellerInteraction = sellerInteraction;
		this.companySite = companySite;
	}

	public String getMarket() {
		return market;
	}

	public void setMarket(String market) {
		this.market = market;
	}

	public String getBuyers() {
		return buyers;
	}

	public void setBuyers(String buyers) {
		this.buyers = buyers;
	}

	public String getTransactTogether() {
		return transactTogether;
	}

	public void setTransactTogether(String transactTogether) {
		this.transactTogether = transactTogether;
	}

	public String getWiderRelevance() {
		return widerRelevance;
	}

	public void setWiderRelevance(String widerRelevance) {
		this.widerRelevance = widerRelevance;
	}

	public String getProductsOrServices() {
		return productsOrServices;
	}

	public void setProductsOrServices(String productsOrServices) {
		this.productsOrServices = productsOrServices;
	}

	public String getOnlineMarket() {
		return onlineMarket;
	}

	public void setOnlineMarket(String onlineMarket) {
		this.onlineMarket = onlineMarket;
	}

	public String getPhysicalSetting() {
		return physicalSetting;
	}

	public void setPhysicalSetting(String physicalSetting) {
		this.physicalSetting = physicalSetting;
	}

	public String getSeller() {
		return seller;
	}

	public void setSeller(String seller) {
		this.seller = seller;
	}

	public String getSellerInteraction() {
		return sellerInteraction;
	}

	public void setSellerInteraction(String sellerInteraction) {
		this.sellerInteraction = sellerInteraction;
	}

	public String getCompanySite() {
		return companySite;
	}

	public void setCompanySite(String companySite) {
		this.companySite = companySite;
	}

}
