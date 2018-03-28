package vn.com.htc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import vn.com.htc.model.Item;

@Repository
@Qualifier("itemDao")
@SuppressWarnings({ "unchecked", "rawtypes" })
public class ItemDao implements ClassDao<Item> {
	@Autowired
	JdbcTemplate jdbcTemplate;

	public Item getById(int id) {
		Item item = (Item) jdbcTemplate.queryForObject("select * from item where itemid = ? ", new Object[] { id },
				new BeanPropertyRowMapper(Item.class));
		return item;
	}

	public List<Item> getAll() {
		List<Item> listItem = jdbcTemplate.query("select * from item", new BeanPropertyRowMapper(Item.class));
		return listItem;
	}

	public boolean updateOne(Item t) {
		jdbcTemplate.update("Update item set itemid = ?, formid = ?,description =?, itemtypeid = ? where itemid = ?",
				t.getItemid(), t.getFormid(), t.getDescription(), t.getItemtypeid(), t.getItemid());
		return true;
	}

	public boolean deleteByid(int id) {
		jdbcTemplate.update("delete from item where itemid = ? ", new Object[] { id });
		return true;
	}

	public boolean save(Item t) {
		jdbcTemplate.update("Insert into item values(?,?,?,?) ", t.getItemid(), t.getFormid(), t.getDescription(),
				t.getItemtypeid());
		return true;
	}
	/*
	 * Connection conn;
	 * 
	 * public ItemDao() { GetDB get = new GetDB(); conn = get.getDB(); }
	 * 
	 * public Item getById(int id) { String sql =
	 * "Select * from item where itemid ='" + id + "'"; PreparedStatement ps; try {
	 * ps = conn.prepareStatement(sql); ResultSet rs = ps.executeQuery(); while
	 * (rs.next()) { Item item = new Item(); item.setItemid(rs.getInt(1));
	 * item.setFormid(rs.getInt(2)); item.setDescription(rs.getString(3));
	 * item.setItemtypeid(rs.getInt(4)); return item; } } catch (Exception e) {
	 * System.out.println(e.getMessage()); } return null; }
	 * 
	 * public List<Item> getAll() { String sql = "Select * from item ";
	 * PreparedStatement ps; ArrayList<Item> listItem = new ArrayList<Item>(); try {
	 * ps = conn.prepareStatement(sql); ResultSet rs = ps.executeQuery(); while
	 * (rs.next()) { Item item = new Item(); item.setItemid(rs.getInt(1));
	 * item.setFormid(rs.getInt(2)); item.setDescription(rs.getString(3));
	 * item.setItemtypeid(rs.getInt(4)); listItem.add(item); } return listItem; }
	 * catch (Exception e) { System.out.println(e.getMessage()); } return null; }
	 * 
	 * public boolean updateOne(Item t) { String sql =
	 * "Update item set formid = ?, description = ?, itemtypeid = ?" +
	 * " where itemid = '" + t.getItemid() + "'"; PreparedStatement ps; try { ps =
	 * conn.prepareCall(sql); ps.setInt(1, t.getFormid()); ps.setString(2,
	 * t.getDescription()); ps.setInt(3, t.getItemtypeid()); ps.executeUpdate();
	 * return true;
	 * 
	 * } catch (Exception e) { System.out.println(e.getMessage()); } return false; }
	 * 
	 * public boolean deleteByid(int id) { String sql =
	 * "delete from item where itemid ='" + id + "'"; PreparedStatement ps; try { ps
	 * = conn.prepareStatement(sql); return ps.execute(); } catch (Exception e) {
	 * e.getMessage(); } return false; }
	 * 
	 * public boolean save(Item t) { String sql =
	 * "Insert into item values (?,?,?,?) "; PreparedStatement ps; try { ps =
	 * conn.prepareStatement(sql); ps.setInt(1, t.getItemid()); ps.setInt(2,
	 * t.getFormid()); ps.setString(3, t.getDescription()); ps.setInt(4,
	 * t.getItemtypeid()); ps.execute(); return true; } catch (Exception e) {
	 * System.out.println(e.getMessage()); } return false; }
	 */

}
