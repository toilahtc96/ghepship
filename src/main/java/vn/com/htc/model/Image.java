package vn.com.htc.model;

public class Image {
	private int imageid;
	private int itemid;
	private String imageLink;
	public int getImageid() {
		return imageid;
	}
	public void setImageid(int imageid) {
		this.imageid = imageid;
	}
	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public String getImageLink() {
		return imageLink;
	}
	public void setImageLink(String imageLink) {
		this.imageLink = imageLink;
	}
	public Image(int imageid, int itemid, String imageLink) {
		this.imageid = imageid;
		this.itemid = itemid;
		this.imageLink = imageLink;
	}
	public Image() {
	}
	@Override
	public String toString() {
		return "Image [imageid=" + imageid + ", itemid=" + itemid + ", imageLink=" + imageLink + "]";
	}
	
}
