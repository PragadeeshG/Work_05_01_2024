package com.test1;

public class Marketing {
	private String strategyCode;
	private String strategyName;
	private String buyingPromotion;
	private String sellingPromotion;
	private String offers;
	private String acceptanceCriteria;
	private String billboardData;
	private String customerAttention;
	private String pphsicalFlyers;

	public Marketing() {

	}

	public Marketing(String strategyCode, String strategyName, String buyingPromotion, String sellingPromotion,
			String offers, String acceptanceCriteria, String billboardData, String customerAttention,
			String pphsicalFlyers) {
		super();
		this.strategyCode = strategyCode;
		this.strategyName = strategyName;
		this.buyingPromotion = buyingPromotion;
		this.sellingPromotion = sellingPromotion;
		this.offers = offers;
		this.acceptanceCriteria = acceptanceCriteria;
		this.billboardData = billboardData;
		this.customerAttention = customerAttention;
		this.pphsicalFlyers = pphsicalFlyers;
	}

	public String getStrategyCode() {
		return strategyCode;
	}

	public void setStrategyCode(String strategyCode) {
		this.strategyCode = strategyCode;
	}

	public String getStrategyName() {
		return strategyName;
	}

	public void setStrategyName(String strategyName) {
		this.strategyName = strategyName;
	}

	public String getBuyingPromotion() {
		return buyingPromotion;
	}

	public void setBuyingPromotion(String buyingPromotion) {
		this.buyingPromotion = buyingPromotion;
	}

	public String getSellingPromotion() {
		return sellingPromotion;
	}

	public void setSellingPromotion(String sellingPromotion) {
		this.sellingPromotion = sellingPromotion;
	}

	public String getOffers() {
		return offers;
	}

	public void setOffers(String offers) {
		this.offers = offers;
	}

	public String getAcceptanceCriteria() {
		return acceptanceCriteria;
	}

	public void setAcceptanceCriteria(String acceptanceCriteria) {
		this.acceptanceCriteria = acceptanceCriteria;
	}

	public String getBillboardData() {
		return billboardData;
	}

	public void setBillboardData(String billboardData) {
		this.billboardData = billboardData;
	}

	public String getCustomerAttention() {
		return customerAttention;
	}

	public void setCustomerAttention(String customerAttention) {
		this.customerAttention = customerAttention;
	}

	public String getPphsicalFlyers() {
		return pphsicalFlyers;
	}

	public void setPphsicalFlyers(String pphsicalFlyers) {
		this.pphsicalFlyers = pphsicalFlyers;
	}

}
