package vn.com.htc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import vn.com.htc.model.ItemType;


@Repository
@Qualifier("ItemTypeDao")
@SuppressWarnings({ "unchecked", "rawtypes" })
public class ItemTypeDao implements ClassDao<ItemType>{
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	public ItemType getById(int id) {
		
		ItemType itemType = (ItemType) jdbcTemplate.queryForObject("select * from `itemtypr` where typeid = ?"
									, new Object[] {id},new BeanPropertyRowMapper(ItemType.class));
		return itemType;
	}

	public List<ItemType> getAll() {
		List<ItemType> listItemType = jdbcTemplate
				.query("select* from `itemtype`", new BeanPropertyRowMapper(ItemType.class));
		return listItemType;
	}

	public boolean updateOne(ItemType t) {
		jdbcTemplate.update("Update `itemtype` set size = ?, description = ?, suggestedPrice = ? where typeid = ?",t.getSize(),t.getDescription(),t.getSuggestedPrice(),t.getTypeid());
		
		return true;
	}

	public boolean deleteByid(int id) {
		jdbcTemplate.update("delete from `itemtype` where typeid = ?",new Object[] {id});
		return true;
	}

	public boolean save(ItemType t) {
		jdbcTemplate.update("Insert into `itemtype` values(?,?,?,?)",t.getTypeid(),t.getSize(),t.getDescription(),t.getSuggestedPrice());
		return true;
	}
	
	/*Connection conn;
	public ItemTypeDao() {
		GetDB get = new GetDB();
		conn = get.getDB();
	}

	public ItemType getById(int id) {
		String sql ="Select * from itemtype where typeid ='" +id+"'";
		PreparedStatement ps;
		ItemType itemType = new ItemType();
		try {
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				itemType.setTypeid(rs.getInt(1));
				itemType.setSize(rs.getString(2));
				itemType.setDescription(rs.getString(3));
				itemType.setSuggestedPrice(rs.getDouble(4));
				return itemType;
				}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

	public List<ItemType> getAll() {
		String sql = "Select * from itemtype";
		PreparedStatement ps;
		ArrayList<ItemType> listItemType = new ArrayList<ItemType>();
		try {
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				ItemType itemType = new ItemType();
				itemType.setTypeid(rs.getInt(1));
				itemType.setSize(rs.getString(2));
				itemType.setDescription(rs.getString(3));
				itemType.setSuggestedPrice(rs.getDouble(4));
				listItemType.add(itemType);
			}
			return listItemType;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return listItemType;
	}

	public boolean updateOne(ItemType t) {
		String sql = "update itemtype set size = ?, description = ?, "
				+ "suggestedprice =? where typeid = '"+t.getTypeid()+"'";
		PreparedStatement ps;
		try {
			ps = conn.prepareCall(sql);
			ps.setString(1, t.getSize());
			ps.setString(2, t.getDescription());
			ps.setDouble(3, t.getSuggestedPrice());
			ps.executeUpdate();
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return false;
	}

	public boolean deleteByid(int id) {
		String sql = "delete from itemtype where typeid = '" + id +"'";
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(sql);
			return ps.execute();
		} catch (Exception e) {
			System.out.println(e.getMessage() );
		}
		return false;
	}

	public boolean save(ItemType t) {
		String sql = "Insert into itemtype values (?,?,?,?)";
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, t.getTypeid());
			ps.setString(2, t.getSize());
			ps.setString(3, t.getDescription());
			ps.setDouble(4, t.getSuggestedPrice());
			return ps.execute();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return false;
	}
*/	
}
