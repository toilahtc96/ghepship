package vn.com.htc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import vn.com.htc.model.Order;

@Repository
@Qualifier("orderDao")
@SuppressWarnings({ "unchecked", "rawtypes" })
public class OrderDao implements ClassDao<Order> {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public Order getById(int id) {
		Order order = (Order) jdbcTemplate.queryForObject("select * from `order` where formid = ? ", new Object[] {id},new BeanPropertyRowMapper<Order>(Order.class));
		return order;
	}

	public List<Order> getAll() {
		
		List<Order> listOrder = jdbcTemplate.query("select * from `order`", new BeanPropertyRowMapper(Order.class));
		return listOrder;
	}

	public boolean updateOne(Order t) {
		jdbcTemplate.update("Update `order` set shiperid = ? where formid = ?",t.getShiperid(),t.getFormid()); 
		return true;
	}

	public boolean deleteByid(int id) {
		jdbcTemplate.update("delete from `order` where formid = ?",new Object[] {id});
		return true;
	}

	public boolean save(Order t) {
		jdbcTemplate.update("Insert into `order` values(?,?)",t.getFormid(),t.getShiperid());
		return true;
	}
	
	
	/*Connection conn;

	public OrderDao() {
		GetDB get = new GetDB();
		conn = get.getDB();
	}

	public Order getById(int id) {
		String sql = "select * from order where orderid = '" + id + "'";
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int formid = rs.getInt(1);
				int shiperid = rs.getInt(2);
				Order order = new Order(formid, shiperid);
				return order;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

	public List<Order> getAll() {
		String sql = "select * from order";
		PreparedStatement ps;
		List<Order> listOrder = new ArrayList<Order>();
		try {
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				int formid = rs.getInt(1);
				int shiperid = rs.getInt(2);
				Order order = new Order(formid, shiperid);
				listOrder.add(order);
			}
			return listOrder;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

	public boolean updateShiperId(int orderid, int shipid) {
		String sql = "Update order Set shiperid = '" + shipid + " where orderid =" + orderid + "'";
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(sql);
			ps.executeUpdate();
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return false;
	}

	public boolean updateOrderId(int orderidOld, int shipid, int orderidNew) {
		String sql = "Update order Set orderid = '" + orderidNew + " where orderid =" + orderidOld + "And shiperid ='"
				+ shipid + "'";
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(sql);
			ps.executeUpdate();
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return false;
	}

	public boolean updateOne(Order t) {
		return false;
	}

	public boolean deleteByid(int id) {
		String sql = "Delete from order where orderid = '" + id + "'";
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(sql);
			return ps.execute();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return false;
	}

	public boolean save(Order t) {
		String sql = "INSERT INTO `order` VALUES (?,?)";
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, t.getFormid());
			ps.setInt(2, t.getShiperid());
			ps.execute();
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return false;
	}*/

}
