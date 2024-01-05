package com.test1;

public class BalanceSheet {
	private long statementId;
	private String assetReport;
	private String liabilityReport;
	private String equity;
	private String snapshotVersion;
	private String snapshotContent;
	private String cashFlow;
	private String pricing;

	public BalanceSheet() {

	}

	public BalanceSheet(long statementId, String assetReport, String liabilityReport, String equity,
			String snapshotVersion, String snapshotContent, String cashFlow, String pricing) {
		super();
		this.statementId = statementId;
		this.assetReport = assetReport;
		this.liabilityReport = liabilityReport;
		this.equity = equity;
		this.snapshotVersion = snapshotVersion;
		this.snapshotContent = snapshotContent;
		this.cashFlow = cashFlow;
		this.pricing = pricing;
	}

	public long getStatementId() {
		return statementId;
	}

	public void setStatementId(long statementId) {
		this.statementId = statementId;
	}

	public String getAssetReport() {
		return assetReport;
	}

	public void setAssetReport(String assetReport) {
		this.assetReport = assetReport;
	}

	public String getLiabilityReport() {
		return liabilityReport;
	}

	public void setLiabilityReport(String liabilityReport) {
		this.liabilityReport = liabilityReport;
	}

	public String getEquity() {
		return equity;
	}

	public void setEquity(String equity) {
		this.equity = equity;
	}

	public String getSnapshotVersion() {
		return snapshotVersion;
	}

	public void setSnapshotVersion(String snapshotVersion) {
		this.snapshotVersion = snapshotVersion;
	}

	public String getSnapshotContent() {
		return snapshotContent;
	}

	public void setSnapshotContent(String snapshotContent) {
		this.snapshotContent = snapshotContent;
	}

	public String getCashFlow() {
		return cashFlow;
	}

	public void setCashFlow(String cashFlow) {
		this.cashFlow = cashFlow;
	}

	public String getPricing() {
		return pricing;
	}

	public void setPricing(String pricing) {
		this.pricing = pricing;
	}

}
