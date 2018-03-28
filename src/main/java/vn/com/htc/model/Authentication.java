package vn.com.htc.model;

public class Authentication {
	private int authenticationid;
	private String authenticationName;
	public int getAuthenticationid() {
		return authenticationid;
	}
	public void setAuthenticationid(int authenticationid) {
		this.authenticationid = authenticationid;
	}
	public String getAuthenticationName() {
		return authenticationName;
	}
	public void setAuthenticationName(String authenticationName) {
		this.authenticationName = authenticationName;
	}
	@Override
	public String toString() {
		return "Authentication [authenticationid=" + authenticationid + ", authenticationName=" + authenticationName
				+ "]";
	}
	public Authentication(int authenticationid, String authenticationName) {
		super();
		this.authenticationid = authenticationid;
		this.authenticationName = authenticationName;
	}
	public Authentication() {
	}
	
}
