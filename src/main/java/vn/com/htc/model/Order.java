package vn.com.htc.model;

public class Order {
	private int formid;
	private int shiperid;
	@Override
	public String toString() {
		return "Order [formid=" + formid + ", shiperid=" + shiperid + "]";
	}
	public int getFormid() {
		return formid;
	}
	public void setFormid(int formid) {
		this.formid = formid;
	}
	public int getShiperid() {
		return shiperid;
	}
	public void setShiperid(int shiperid) {
		this.shiperid = shiperid;
	}
	public Order(int formid, int shiperid) {
		super();
		this.formid = formid;
		this.shiperid = shiperid;
	}
	public Order() {
	}
	
}
