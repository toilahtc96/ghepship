package vn.com.htc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import vn.com.htc.model.User;

@Repository
@Qualifier("userDao")
public class UserDao implements ClassDao<User> {
	@Autowired
	JdbcTemplate jdbcTemplate;

	public User getById(int id) {
		@SuppressWarnings({ "rawtypes", "unchecked" })
		User user = (User) jdbcTemplate.queryForObject("Select * from `user` where userid =?", new Object[] { id },
				new BeanPropertyRowMapper(User.class));
		return user;
	}

	public List<User> getAll() {
		@SuppressWarnings({ "unchecked", "rawtypes" })
		List<User> listUser = jdbcTemplate.query("Select * from `user`", new BeanPropertyRowMapper(User.class));
		System.out.println("Get all");
		return listUser;
	}

	public boolean updateOne(User t) {
		jdbcTemplate.update(
				"Update ghepship_ss2.user Set username = ?, password = ?, location = ?, gmail = ?, facebook = ?, profilepicture = ?, info = ?, phonenumber = ?, accountbalance = ?, authenticationid = ?, notificaid = ? where userid = ?",
				t.getUsername(), t.getPassword(), t.getLocation(), t.getGmail(), t.getFacebook(), t.getProfilePicture(),
				t.getInfomation(), t.getPhoneNumber(), t.getAccountbalance(),t.getAuthenticationid(), t.getNotificaid(), t.getUserid());
		System.out.println("Updated");
		return true;
	}

	public boolean deleteByid(int id) {
		jdbcTemplate.update("delete from `user` where userid = ?",new Object[] {id});
		System.out.println("delete");
		return true;
	}

	public boolean save(User t) {
		jdbcTemplate.update(
				"Insert INTO `user`(username,password,location,gmail,facebook,profilepicture,info,phonenumber,accountbalance,authenticationid,notificaid) Values(?,?,?,?,?,?,?,?,?,?,?)",
				t.getUsername(), t.getPassword(), t.getLocation(), t.getGmail(), t.getFacebook(), t.getProfilePicture(),
				t.getInfomation(), t.getPhoneNumber(), t.getAccountbalance(),t.getAuthenticationid(), t.getNotificaid());
		System.out.println("save");
		return true;
	}
	/*
	 * Connection conn;
	 * 
	 * public UserDao() { System.out.println("UserDao"); GetDB get = new GetDB();
	 * conn = get.getDB(); }
	 * 
	 * @Autowired JdbcTemplate jdbcTemplate;
	 * 
	 * @SuppressWarnings("unchecked") public User getById(int id) {
	 * 
	 * String sql = "Select * from user where userid ='" + id + "'";
	 * PreparedStatement ps; User user = null; System.out.println(sql); try { ps =
	 * conn.prepareStatement(sql); ResultSet rs = ps.executeQuery(); while
	 * (rs.next()) { int userid = rs.getInt(1); String username = rs.getString(2);
	 * String password = rs.getString(3); String location = rs.getString(4); String
	 * gmail = rs.getString(5); String facebook = rs.getString(6); String
	 * profilePicture = rs.getString(7); String info = rs.getString(8); String
	 * phoneNumber = rs.getString(9); double accountBalance = rs.getDouble(10); int
	 * authenticationid = rs.getInt(11); int notificaid = rs.getInt(12); user = new
	 * User(userid, username, password, location, profilePicture, gmail, facebook,
	 * info, phoneNumber, accountBalance, authenticationid, notificaid); } } catch
	 * (Exception e) { System.out.println("getById UserDao: "+e.getMessage()); }
	 * return user;
	 * 
	 * @SuppressWarnings("rawtypes") User user = (User)
	 * jdbcTemplate.queryForObject("Select * from user where userid =?", new
	 * Object[] { id }, new BeanPropertyRowMapper(User.class)); return user;
	 * 
	 * }
	 * 
	 * public User getUserByUsernameAndPassword(String usernameParam, String
	 * passwordParam) { String sql = "Select * from user where username = '" +
	 * usernameParam + "'"; PreparedStatement ps; User user = null; try { ps =
	 * conn.prepareStatement(sql); ResultSet rs = ps.executeQuery(); while
	 * (rs.next()) { String password = rs.getString(3); if
	 * (password.equals(passwordParam)) { int userid = rs.getInt(1); String username
	 * = rs.getString(2); String location = rs.getString(4); String gmail =
	 * rs.getString(5); String facebook = rs.getString(6); String profilePicture =
	 * rs.getString(7); String info = rs.getString(8); String phoneNumber =
	 * rs.getString(9); double accountBalance = rs.getDouble(10); int
	 * authenticationid = rs.getInt(11); int notificaid = rs.getInt(12); user = new
	 * User(userid, username, password, location, profilePicture, gmail, facebook,
	 * info, phoneNumber, accountBalance, authenticationid, notificaid); } else {
	 * return null; }
	 * 
	 * } } catch (Exception e) { System.out.println(e.getMessage()); } return user;
	 * }
	 * 
	 * public List<User> getAll() { String sql = "Select * from user";
	 * PreparedStatement ps; List<User> listUser = new ArrayList<User>(); try { ps =
	 * conn.prepareStatement(sql); ResultSet rs = ps.executeQuery(); while
	 * (rs.next()) { int userid = rs.getInt(1); String username = rs.getString(2);
	 * String password = rs.getString(3); String location = rs.getString(4); String
	 * gmail = rs.getString(5); String facebook = rs.getString(6); String
	 * profilePicture = rs.getString(7); String info = rs.getString(8); String
	 * phoneNumber = rs.getString(9); double accountBalance = rs.getDouble(10); int
	 * authenticationid = rs.getInt(11); int notificaid = rs.getInt(12); User user =
	 * new User(userid, username, password, location, profilePicture, gmail,
	 * facebook, info, phoneNumber, accountBalance, authenticationid, notificaid);
	 * listUser.add(user); } } catch (Exception e) {
	 * System.out.println(e.getMessage()); } return listUser; }
	 * 
	 * public boolean updateOne(User t) { String sql =
	 * "Update ghepship_ss2.user Set username = ?, password = ?, location = ?, gmail = ?, facebook = ?, profilepicture = ?, info = ?, phonenumber = ?, accountbalance = ?, authenticationid = ?, notificaid = ? where userid = '"
	 * + t.getUserid() + "'"; PreparedStatement ps; try { ps =
	 * conn.prepareCall(sql); ps.setString(1, t.getUsername()); ps.setString(2,
	 * t.getPassword()); ps.setString(3, t.getLocation()); ps.setString(4,
	 * t.getGmail()); ps.setString(5, t.getFacebook()); ps.setString(6,
	 * t.getProfilePicture()); ps.setString(7, t.getInfomation()); ps.setString(8,
	 * t.getPhoneNumber()); ps.setDouble(9, t.getAccountbalance()); ps.setInt(10,
	 * t.getAuthenticationid()); ps.setInt(11, t.getNotificaid());
	 * ps.executeUpdate(); return true; } catch (Exception e) {
	 * System.out.println(e.getMessage()); } return false; }
	 * 
	 * public boolean deleteByid(int id) { String sql =
	 * "delete from user where userid = '" + id + "'"; PreparedStatement ps; try {
	 * ps = conn.prepareStatement(sql); return ps.execute(); } catch (Exception e) {
	 * System.out.println(e.getMessage()); } return false; }
	 * 
	 * public boolean save(User t) { String sql =
	 * "Insert INTO user(username,password,location,gmail,facebook,profilepicture,info,phonenumber,accountbalance,authenticationid,notificaid) Values(?,?,?,?,?,?,?,?,?,?,?)"
	 * ; PreparedStatement ps; try { ps = conn.prepareStatement(sql);
	 * ps.setString(1, t.getUsername()); ps.setString(2, t.getPassword());
	 * ps.setString(3, t.getLocation()); ps.setString(4, t.getGmail());
	 * ps.setString(5, t.getFacebook()); ps.setString(6, t.getProfilePicture());
	 * ps.setString(7, t.getInfomation()); ps.setString(8, t.getPhoneNumber());
	 * ps.setDouble(9, t.getAccountbalance()); ps.setInt(10,
	 * t.getAuthenticationid()); ps.setInt(11, t.getNotificaid());
	 * System.out.println("try"); ps.execute(); return true; } catch (Exception e) {
	 * System.out.println(e.getMessage()); } System.out.println("out"); return
	 * false; }
	 * 
	 * public static void main(String[] args) { UserDao userDao = new UserDao();
	 * User user = userDao.getById(3); System.out.println(user.toString()); }
	 */

}
