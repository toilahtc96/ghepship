package vn.com.htc.model;

public class History {
	private int userid;
	private int orderid;
	
	public History(int userid, int orderid) {
		this.userid = userid;
		this.orderid = orderid;
	}
	public History() {
		super();
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	@Override
	public String toString() {
		return "History [userid=" + userid + ", orderid=" + orderid + "]";
	}
}
