package vn.com.htc.model;

public class MenuGroup {
private int menuGroupId;
private String menuGroupName;
@Override
public String toString() {
	return "MenuGroup [menuGroupId=" + menuGroupId + ", menuGroupName=" + menuGroupName + "]";
}
public MenuGroup() {
	super();
}
public MenuGroup(int menuGroupId, String menuGroupName) {
	super();
	this.menuGroupId = menuGroupId;
	this.menuGroupName = menuGroupName;
}
public int getMenuGroupId() {
	return menuGroupId;
}
public void setMenuGroupId(int menuGroupId) {
	this.menuGroupId = menuGroupId;
}
public String getMenuGroupName() {
	return menuGroupName;
}
public void setMenuGroupName(String menuGroupName) {
	this.menuGroupName = menuGroupName;
}
}
