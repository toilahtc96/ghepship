package vn.com.htc.model;

public class BankCard {
	private int cardid;
	private int userid;
	private String accountNumber;
	private double accountBalance;
	public int getCardid() {
		return cardid;
	}
	public void setCardid(int cardid) {
		this.cardid = cardid;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	@Override
	public String toString() {
		return "BankCard [cartid=" + cardid + ", userid=" + userid + ", accountNumber=" + accountNumber
				+ ", accountBalance=" + accountBalance + "]";
	}
	public BankCard(int cardid, int userid, String accountNumber, double accountBalance) {
		super();
		this.cardid = cardid;
		this.userid = userid;
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
	}
	public BankCard() {
		super();
	}
	
}
