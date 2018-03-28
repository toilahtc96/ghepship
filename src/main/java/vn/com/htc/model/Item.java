package vn.com.htc.model;

public class Item {
	private int itemid;
	private int formid;
	private String description;
	private int itemtypeid;
	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public int getFormid() {
		return formid;
	}
	public void setFormid(int formid) {
		this.formid = formid;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getItemtypeid() {
		return itemtypeid;
	}
	public void setItemtypeid(int itemtypeid) {
		this.itemtypeid = itemtypeid;
	}
	public Item(int itemid, int formid, String description, int itemtypeid) {
		this.itemid = itemid;
		this.formid = formid;
		this.description = description;
		this.itemtypeid = itemtypeid;
	}
	public Item() {
	}
	@Override
	public String toString() {
		return "Item [itemid=" + itemid + ", formid=" + formid + ", description=" + description + ", itemtypeid="
				+ itemtypeid + "]";
	}
	
}
