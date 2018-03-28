package vn.com.htc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import vn.com.htc.model.SignupForm;

@SuppressWarnings({ "unchecked", "rawtypes" })
@Repository
@Qualifier("signupFormDao")
public class SignupFormDao implements ClassDao<SignupForm> {
	@Autowired
	JdbcTemplate jdbcTemplate;

	public SignupForm getById(int id) {

		SignupForm signupForm = (SignupForm) jdbcTemplate.queryForObject("Select * from `signupform` where formid = ?",
				new Object[] { id }, new BeanPropertyRowMapper(SignupForm.class));

		return signupForm;
	}

	public List<SignupForm> getAll() {
		List<SignupForm> listSignupForm = jdbcTemplate.query("select * from `signupform`",
				new BeanPropertyRowMapper(SignupForm.class));
		return listSignupForm;
	}

	public boolean updateOne(SignupForm t) {
		jdbcTemplate.update("Update `signupform` set  userid = ?,  startingPoint = ?,  destination = ?,  "
				+ "advancemoney = ?,  wage = ?,  receiverid = ?,  departuretime = ?,  "
				+ "arrivaltime = ?,  result = ?,  status = ? where formid =?"
				,t.getUserid(),t.getStartingPoint(),t.getDestination(),t.getAdvancemoney(),t.getWage()
				,t.getReceiverid(),t.getDepartureTime(),t.getArrivalTime(),t.getResult(),t.getStatus(),t.getFormid());
		return true;
	}

	public boolean deleteByid(int id) {
		jdbcTemplate.update("delete from `signupform` where formid = ? ",new Object[] {id});
		return true;
	}

	public boolean save(SignupForm t) {
		jdbcTemplate.update("Insert into `signupform` Values(?,?,?,?,?,?,?,?,?,?,?)"
				,t.getFormid(),t.getUserid(),t.getStartingPoint(),t.getDestination(),t.getAdvancemoney(),t.getWage()
				,t.getReceiverid(),t.getDepartureTime(),t.getArrivalTime(),t.getResult()
				,t.getStatus());
		return true;
	}

	/*
	 * Connection conn; public SignupFormDao() { GetDB get = new GetDB(); conn =
	 * get.getDB(); }
	 * 
	 * public SignupForm getById(int id) { String sql =
	 * "select * from signupform where formid ='"+id+"'"; PreparedStatement ps;
	 * SignupForm signupForm = null; try { ps = conn.prepareStatement(sql);
	 * ResultSet rs = ps.executeQuery(); while(rs.next()) { int formid =
	 * rs.getInt(1); int userid = rs.getInt(2); String startingPoint =
	 * rs.getString(3); String destination = rs.getString(4); double advancemoney =
	 * rs.getDouble(5); double wage = rs.getDouble(6); int receiverid =
	 * rs.getInt(7); Date departuretime = rs.getDate(8); Date arrivaltime =
	 * rs.getDate(9); String result = rs.getString(10); String status =
	 * rs.getString(11); signupForm = new
	 * SignupForm(formid,userid,startingPoint,destination,advancemoney,wage,
	 * receiverid,departuretime,arrivaltime,result,status); return signupForm;
	 * 
	 * } }catch (Exception e) { System.out.println(e.getMessage()); } return
	 * signupForm; }
	 * 
	 * 
	 * public List<SignupForm> getAll() { String sql = "select * from signupform";
	 * PreparedStatement ps; List<SignupForm> listSignupForm = new
	 * ArrayList<SignupForm>(); try { ps = conn.prepareStatement(sql); ResultSet rs
	 * = ps.executeQuery(); while(rs.next()) { int formid = rs.getInt(1); int userid
	 * = rs.getInt(2); String startingPoint = rs.getString(3); String destination =
	 * rs.getString(4); double advancemoney = rs.getDouble(5); double wage =
	 * rs.getDouble(6); int receiverid = rs.getInt(7); Date departuretime =
	 * rs.getDate(8); Date arrivaltime = rs.getDate(9); String result =
	 * rs.getString(10); String status = rs.getString(11); SignupForm signupForm =
	 * new SignupForm(formid,userid,startingPoint,destination,advancemoney,wage,
	 * receiverid,departuretime,arrivaltime,result,status);
	 * listSignupForm.add(signupForm); } }catch (Exception e) {
	 * System.out.println(e.getMessage()); } return listSignupForm; }
	 * 
	 * 
	 * public boolean updateOne(SignupForm t) { String sql
	 * ="Update signupform set  userid = ?,  startingPoint = ?,  destination = ?,  advancemoney = ?,  wage = ?,  receiverid = ?,  departuretime = ?,  arrivaltime = ?,  result = ?,  status = ? where formid ='"
	 * + t.getFormid()+"'"; PreparedStatement ps; try { ps = conn.prepareCall(sql);
	 * ps.setInt(1, t.getUserid()); ps.setString(2, t.getStartingPoint());
	 * ps.setString(3, t.getDestination()); ps.setDouble(4, t.getAdvancemoney());
	 * ps.setDouble(5, t.getWage()); ps.setInt(6, t.getReceiverid()); ps.setDate(7,
	 * (java.sql.Date) t.getDepartureTime()); ps.setDate(8, (java.sql.Date)
	 * t.getArrivalTime()); ps.setString(9, t.getResult()); ps.setString(10,
	 * t.getStatus()); ps.executeUpdate(); return true; }catch (Exception e) {
	 * System.out.println(e.getMessage()); } return false; }
	 * 
	 * 
	 * public boolean deleteByid(int id) { String sql =
	 * "delete from signupform where formid = '"+id+"'"; PreparedStatement ps; try {
	 * ps = conn.prepareStatement(sql); return ps.execute(); }catch (Exception e) {
	 * System.out.println(e.getMessage()); } return false; }
	 * 
	 * public boolean save(SignupForm t) { String
	 * sql="Insert into signupform Values(?,?,?,?,?,?,?,?,?,?,?)"; PreparedStatement
	 * ps; try { ps = conn.prepareStatement(sql); ps.setInt(1, 9); ps.setInt(2, 4);
	 * ps.setString(3, t.getStartingPoint()); ps.setString(4, t.getDestination());
	 * ps.setDouble(5, t.getAdvancemoney()); ps.setDouble(6, t.getWage());
	 * ps.setInt(7, t.getReceiverid()); ps.setDate(8, (java.sql.Date)
	 * t.getDepartureTime()); ps.setDate(9, (java.sql.Date )t.getArrivalTime());
	 * ps.setString(10, t.getResult()); ps.setString(11, t.getStatus());
	 * System.out.println(ps.toString()); ps.executeQuery(); return true; } catch
	 * (Exception e) { System.out.println(e.getMessage()); } return false; }
	 */

}
