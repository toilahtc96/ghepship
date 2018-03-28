
package vn.com.htc.model;

public class User {
		private int userid;
		private String username;
		private String password;
		private String location;
		private String profilePicture;
		private String gmail;
		private String facebook;
		private String infomation;
		private String phoneNumber;
		private double accountbalance;
		private int authenticationid;
		private int notificaid;
		public int getUserid() {
			return userid;
		}
		public void setUserid(int userid) {
			this.userid = userid;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public String getProfilePicture() {
			return profilePicture;
		}
		public void setProfilePicture(String profilePicture) {
			this.profilePicture = profilePicture;
		}
		public String getGmail() {
			return gmail;
		}
		public void setGmail(String gmail) {
			this.gmail = gmail;
		}
		public String getFacebook() {
			return facebook;
		}
		public void setFacebook(String facebook) {
			this.facebook = facebook;
		}
		public String getInfomation() {
			return infomation;
		}
		public void setInfomation(String infomation) {
			this.infomation = infomation;
		}
		public String getPhoneNumber() {
			return phoneNumber;
		}
		public void setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
		}
		public double getAccountbalance() {
			return accountbalance;
		}
		public void setAccountbalance(double accountbalance) {
			this.accountbalance = accountbalance;
		}
		public int getAuthenticationid() {
			return authenticationid;
		}
		public void setAuthenticationid(int authenticationid) {
			this.authenticationid = authenticationid;
		}
		public int getNotificaid() {
			return notificaid;
		}
		public void setNotificaid(int notificaid) {
			this.notificaid = notificaid;
		}
		@Override
		public String toString() {
			return "User [userid=" + userid + ", username=" + username + ", password=" + password + ", location="
					+ location + ", profilePicture=" + profilePicture + ", gmail=" + gmail + ", facebook=" + facebook
					+ ", infomation=" + infomation + ", phoneNumber=" + phoneNumber + ", accountbalance="
					+ accountbalance + ", authenticationid=" + authenticationid + ", notificaid=" + notificaid + "]";
		}
		public User(int userid, String username, String password, String location, String profilePicture, String gmail,
				String facebook, String infomation, String phoneNumber, double accountbalance, int authenticationid,
				int notificaid) {
			super();
			this.userid = userid;
			this.username = username;
			this.password = password;
			this.location = location;
			this.profilePicture = profilePicture;
			this.gmail = gmail;
			this.facebook = facebook;
			this.infomation = infomation;
			this.phoneNumber = phoneNumber;
			this.accountbalance = accountbalance;
			this.authenticationid = authenticationid;
			this.notificaid = notificaid;
		}
		public User() {
			super();
		}
		
}