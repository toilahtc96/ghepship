package vn.com.htc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import vn.com.htc.model.Plan;

@Repository
@Qualifier("planDao")
@SuppressWarnings({ "unchecked", "rawtypes" })
public class PlanDao implements ClassDao<Plan> {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public Plan getById(int id) {

		Plan plan = (Plan) jdbcTemplate.queryForObject("select * from `plan` where planid = ?", new Object[] {id},new BeanPropertyRowMapper(Plan.class));
		return plan;
	}

	public List<Plan> getAll() {
		List<Plan> listPlan = jdbcTemplate.query("Select * from `plan`", new BeanPropertyRowMapper(Plan.class));
		return listPlan;
	}

	public boolean updateOne(Plan t) {
		jdbcTemplate.update("Update `plan` set userid = ?, departuretime = ?, arrivaltime = ?," + 
				"pickuplocation = ?, destination = ? where planid = ? "
				, t.getUserid(),t.getDepartureTime(),t.getArrivalTime(),t.getPickupLocation(),t.getDestination(),t.getPlanid());
		return true;
	}

	public boolean deleteByid(int id) {
		jdbcTemplate.update("delete from `plan` where planid = ?",new Object[] {id});
		return true;
	}

	public boolean save(Plan t) {
		jdbcTemplate.update("Insert into `plan` values (?,?,?,?,?,?)"
				,t.getPlanid(),t.getUserid(),t.getDepartureTime(),t.getArrivalTime(),t.getPickupLocation(),t.getDestination());
		return true;
	}
	/*
	 * Connection conn; public PlanDao() { GetDB get = new GetDB(); conn =
	 * (Connection) get.getDB(); }
	 * 
	 * 
	 * public Plan getById(int id) { String sql =
	 * "Select * from plan where planid = '"+id+"'"; PreparedStatement ps; Plan plan
	 * = new Plan(); try { ps = conn.prepareStatement(sql); ResultSet rs =
	 * ps.executeQuery(); while(rs.next()) { plan.setPlanid(id);
	 * plan.setUserid(rs.getInt(2)); plan.setDepartureTime(rs.getDate(3));
	 * plan.setArrivalTime(rs.getDate(4)); plan.setPickupLocation(rs.getString(5));
	 * plan.setDestination(rs.getString(6)); return plan; } } catch (Exception e) {
	 * System.out.println(e.getMessage()); } return null; }
	 * 
	 * 
	 * public List<Plan> getAll() { String sql = "Select * from plan";
	 * PreparedStatement ps; ArrayList<Plan> listPlan = new ArrayList<Plan>(); try {
	 * ps = conn.prepareStatement(sql); ResultSet rs = ps.executeQuery();
	 * while(rs.next()) { Plan plan = new Plan(); plan.setPlanid(rs.getInt(1));
	 * plan.setUserid(rs.getInt(2)); plan.setDepartureTime(rs.getDate(3));
	 * plan.setArrivalTime(rs.getDate(4)); plan.setPickupLocation(rs.getString(5));
	 * plan.setDestination(rs.getString(6)); listPlan.add(plan); } return listPlan;
	 * }catch (Exception e) { System.out.println(e.getMessage()); } return null; }
	 * 
	 * 
	 * public boolean updateOne(Plan t) { String sql =
	 * "Update plan set userid = ?, departuretime = ?, arrivaltime = ?, " +
	 * "pickuplocation = ?, destination = ? where planid = '" +t.getPlanid()+"'";
	 * PreparedStatement ps; try { ps = conn.prepareCall(sql);
	 * 
	 * ps.setInt(1, t.getUserid()); ps.setDate(2,(java.sql.Date)
	 * t.getDepartureTime()); ps.setDate(3, (java.sql.Date) t.getArrivalTime());
	 * ps.setString(4, t.getPickupLocation()); ps.setString(5, t.getDestination());
	 * System.out.println(ps.toString()); ps.executeUpdate(); return true; }catch
	 * (Exception e) { System.out.println(e.getMessage()); } return false; }
	 * 
	 * 
	 * public boolean deleteByid(int id) { String sql =
	 * "delete from plan where planid = `"+id+"`"; PreparedStatement ps; try { ps =
	 * conn.prepareStatement(sql); return ps.execute(); }catch (Exception e) {
	 * System.out.println(e.getMessage()); } return false; }
	 * 
	 * 
	 * public boolean save(Plan t) { String sql =
	 * "Insert into `plan`(`planid`,`userid`," +
	 * "`departuretime`,`arrivaltime`,`pickuplocation`,`destination`) " +
	 * "values(?,?,?,?,?,?)"; PreparedStatement ps; try { ps =
	 * conn.prepareStatement(sql); ps.setInt(1, t.getPlanid()); ps.setInt(2,
	 * t.getUserid()); ps.setDate(3, (java.sql.Date)t.getDepartureTime());
	 * ps.setDate(4, (java.sql.Date)t.getArrivalTime()); ps.setString(5,
	 * t.getPickupLocation()); ps.setString(6, t.getDestination()); return
	 * ps.execute(); }catch (Exception e) { System.out.println(e.getMessage()); }
	 * return false; }
	 */

	
	
}
