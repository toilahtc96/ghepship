package vn.com.htc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import vn.com.htc.model.Notification;

@Repository
@Qualifier("notificaDao")
@SuppressWarnings({ "unchecked", "rawtypes" })
public class NotificaDao implements ClassDao<Notification> {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public Notification getById(int id) {

		Notification notification = (Notification) jdbcTemplate.queryForObject(
				"select * from `notification` where notificaid = ?", new Object[] { id },
				new BeanPropertyRowMapper(Notification.class));
		return notification;
	}

	public List<Notification> getAll() {
		List<Notification> listNotification = jdbcTemplate.query("select * from `notification`", new BeanPropertyRowMapper(Notification.class));
		return listNotification;
	}

	public boolean updateOne(Notification t) {
		jdbcTemplate.update("Update notification set notifica = ?, planid = ?, formid = ?",t.getNotifica(),t.getPlanid(),t.getFormid());
		return true;
	}

	public boolean deleteByid(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean save(Notification t) {
		jdbcTemplate.update("Insert into `notification`  values (?,?,?,?)", t.getNotificaid(),t.getNotifica(),t.getPlanid(),t.getFormid());
		return true;
	}

	/*
	 * Connection conn; public NotificaDao() { GetDB get = new GetDB(); conn =
	 * (Connection) get.getDB(); }
	 * 
	 * public Notification getById(int id) { String sql =
	 * "Select * from notification where notificaid = '"+id+"'"; PreparedStatement
	 * ps; Notification notifica = new Notification(); try { ps =
	 * conn.prepareStatement(sql); ResultSet rs = ps.executeQuery();
	 * while(rs.next()) { notifica.setNotificaid(rs.getInt(1));
	 * notifica.setNotifica(rs.getString(2)); notifica.setPlanid(rs.getInt(3));
	 * notifica.setFormid(rs.getInt(4)); return notifica; } }catch(Exception e) {
	 * System.out.println(e.getMessage()); } return null; }
	 * 
	 * public List<Notification> getAll() { String sql
	 * ="Select * from notification"; PreparedStatement ps; ArrayList<Notification>
	 * listNotification = new ArrayList<Notification>(); try { ps =
	 * conn.prepareStatement(sql); ResultSet rs = ps.executeQuery();
	 * while(rs.next()) { Notification notifica = new Notification();
	 * notifica.setNotificaid(rs.getInt(1)); notifica.setNotifica(rs.getString(2));
	 * notifica.setPlanid(rs.getInt(3)); notifica.setFormid(rs.getInt(4));
	 * listNotification.add(notifica); } return listNotification; }catch(Exception
	 * e) { System.out.println(e.getMessage()); } return null; }
	 * 
	 * public boolean updateOne(Notification t) { String sql =
	 * "Update notification set notifica = ? ," +
	 * "planid = ?, formid = ? where notificaid = '"+t.getNotificaid()+"'";
	 * PreparedStatement ps; try { ps = conn.prepareCall(sql); ps.setString(1,
	 * t.getNotifica()); ps.setInt(2, t.getPlanid()); ps.setInt(3, t.getFormid());
	 * ps.executeUpdate(); return true; }catch (Exception e) {
	 * System.out.println(e.getMessage()); } return false; }
	 * 
	 * public boolean deleteByid(int id) { String sql =
	 * "Delete from notification where notificaid = '"+id+"'"; PreparedStatement ps;
	 * try { ps = conn.prepareStatement(sql); return ps.execute(); }catch (Exception
	 * e) { System.out.println(e.getMessage()); } return false; }
	 * 
	 * public boolean save(Notification t) { String sql
	 * =" Insert into notification " +
	 * "(`notifica`,`planid`,`formid`) values (?,?,?)"; PreparedStatement ps; try {
	 * ps = conn.prepareStatement(sql); ps.setString(1, t.getNotifica());
	 * ps.setInt(2, t.getPlanid()); ps.setInt(3, t.getFormid());
	 * System.out.println(ps.toString()); return ps.execute(); } catch (Exception e)
	 * { System.out.println(e.getMessage()); } return false; }
	 */
}
