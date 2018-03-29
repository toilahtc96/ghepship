package vn.com.htc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import vn.com.htc.model.History;

@Repository
@Qualifier("HistoryDao")
@SuppressWarnings({ "unchecked", "rawtypes" })
public class HistoryDao implements ClassDao<History> {
	@Autowired
	JdbcTemplate jdbcTemplate;

	public History getById(int id) {
		History history = (History) jdbcTemplate.queryForObject("select * from `history` where historyid = ?",
				new Object[] { id }, new BeanPropertyRowMapper(History.class));
		return history;
	}

	public List<History> getAll() {
		List<History> listHistory = jdbcTemplate.query("select * from `history`",
				new BeanPropertyRowMapper(History.class));
		return listHistory;
	}

	public boolean updateOne(History t) {
		jdbcTemplate.update("update `history` set orderid = ? where userid = ?",t.getOrderid(),t.getUserid());
		return true;
	}

	public boolean deleteByid(int id) {
		return false;
	}
	public boolean deleteByid(int userid,int orderid) {
		jdbcTemplate.update("delete from `history` where userid = ?, orderid = ?",userid,orderid);
		return true;
	}
	public boolean save(History t) {
		jdbcTemplate.update("Insert into `history` values (?,?)",t.getUserid(),t.getOrderid());
		return true;
	}

	/*
	 * Connection conn;
	 * 
	 * public HistoryDao() { GetDB get = new GetDB(); conn = get.getDB(); }
	 * 
	 * public History getById(int id) { String sql =
	 * "Select * from history where userid = '" + id + "'"; PreparedStatement ps;
	 * History history = new History(); try { ps = conn.prepareStatement(sql);
	 * ResultSet rs = ps.executeQuery(); while (rs.next()) {
	 * history.setUserid(rs.getInt(1)); history.setOrderid(rs.getInt(2)); return
	 * history; } } catch (Exception e) { System.out.println(e.getMessage()); }
	 * return null; }
	 * 
	 * public List<History> getAll() { String sql = "Select * from history";
	 * PreparedStatement ps; ArrayList<History> listHistory = new
	 * ArrayList<History>(); try { ps = conn.prepareStatement(sql); ResultSet rs =
	 * ps.executeQuery(); while (rs.next()) { History history = new History();
	 * history.setUserid(rs.getInt(1)); history.setOrderid(rs.getInt(2));
	 * listHistory.add(history); } return listHistory; } catch (Exception e) {
	 * System.out.println(e.getMessage()); } return listHistory; }
	 * 
	 * public boolean updateOne(History t) { String sql =
	 * "Update history set userid = ?, orderid = ? where userid = " + t.getUserid()
	 * + "'"; PreparedStatement ps; try { ps = conn.prepareStatement(sql);
	 * ps.setInt(1, t.getUserid()); ps.setInt(2, t.getOrderid());
	 * ps.executeUpdate(); return true; } catch (Exception e) {
	 * System.out.println(e.getMessage()); } return false; }
	 * 
	 * public boolean deleteByid(int id) { String sql =
	 * "Delete from history where userid = '" + id + "'"; PreparedStatement ps; try
	 * { ps = conn.prepareStatement(sql); return ps.execute(); } catch (Exception e)
	 * { System.out.println(e.getMessage()); } return false; }
	 * 
	 * public boolean save(History t) { String sql =
	 * "Insert into history ('userid','orderid') values(?,?)"; PreparedStatement ps;
	 * try { ps = conn.prepareStatement(sql); ps.setInt(1, t.getUserid());
	 * ps.setInt(2, t.getOrderid()); return ps.execute(); } catch (Exception e) {
	 * System.out.println(e.getMessage()); } return false; }
	 */

}
