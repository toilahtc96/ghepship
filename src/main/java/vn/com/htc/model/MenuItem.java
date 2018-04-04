package vn.com.htc.model;

public class MenuItem {
private int menuItemId;
private String menuItemName;
private int menuItemPosition;
private int menuGroupId;
public MenuItem() {
	super();
}
public MenuItem(int menuItemId, String menuItemName, int menuItemPosition, int menuGroupId) {
	super();
	this.menuItemId = menuItemId;
	this.menuItemName = menuItemName;
	this.menuItemPosition = menuItemPosition;
	this.menuGroupId = menuGroupId;
}
@Override
public String toString() {
	return "MenuItem [menuItemId=" + menuItemId + ", menuItemName=" + menuItemName + ", menuItemPosition="
			+ menuItemPosition + ", menuGroupId=" + menuGroupId + "]";
}
public int getMenuItemId() {
	return menuItemId;
}
public void setMenuItemId(int menuItemId) {
	this.menuItemId = menuItemId;
}
public String getMenuItemName() {
	return menuItemName;
}
public void setMenuItemName(String menuItemName) {
	this.menuItemName = menuItemName;
}
public int getMenuItemPosition() {
	return menuItemPosition;
}
public void setMenuItemPosition(int menuItemPosition) {
	this.menuItemPosition = menuItemPosition;
}
public int getMenuGroupId() {
	return menuGroupId;
}
public void setMenuGroupId(int menuGroupId) {
	this.menuGroupId = menuGroupId;
}
}
