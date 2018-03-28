package vn.com.htc.model;

public class BankCard {
	private int cartid;
	private int userid;
	private String accountNumber;
	private double accountBalance;
	public int getCartid() {
		return cartid;
	}
	public void setCartid(int cartid) {
		this.cartid = cartid;
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
		return "BankCard [cartid=" + cartid + ", userid=" + userid + ", accountNumber=" + accountNumber
				+ ", accountBalance=" + accountBalance + "]";
	}
	public BankCard(int cartid, int userid, String accountNumber, double accountBalance) {
		super();
		this.cartid = cartid;
		this.userid = userid;
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
	}
	public BankCard() {
		super();
	}
	
}
