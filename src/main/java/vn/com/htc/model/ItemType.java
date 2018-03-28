package vn.com.htc.model;

public class ItemType {
	private int typeid;
	private String size;
	private String description;
	private double suggestedPrice;
	public int getTypeid() {
		return typeid;
	}
	public void setTypeid(int typeid) {
		this.typeid = typeid;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getSuggestedPrice() {
		return suggestedPrice;
	}
	public void setSuggestedPrice(double suggestedPrice) {
		this.suggestedPrice = suggestedPrice;
	}
	public ItemType(int typeid, String size, String description, double suggestedPrice) {
		super();
		this.typeid = typeid;
		this.size = size;
		this.description = description;
		this.suggestedPrice = suggestedPrice;
	}
	public ItemType() {
	}
	@Override
	public String toString() {
		return "ItemType [typeid=" + typeid + ", size=" + size + ", description=" + description + ", suggestedPrice="
				+ suggestedPrice + "]";
	}
	
}
