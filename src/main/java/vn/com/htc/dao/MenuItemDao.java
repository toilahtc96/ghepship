package vn.com.htc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import vn.com.htc.model.MenuItem;

@Repository
@Qualifier("menuItemDao")
@SuppressWarnings({ "unchecked", "rawtypes" })
public class MenuItemDao implements ClassDao<MenuItem> {
	@Autowired
	JdbcTemplate jdbcTemplate;

	public MenuItem getById(int id) {
	
		MenuItem menuItem = (MenuItem) jdbcTemplate.queryForObject("select * from menuitem where menuitemid = ?"
													, new Object[] {id},new BeanPropertyRowMapper(MenuItem.class));
		return menuItem;
	}

	public List<MenuItem> getAll() {
		List<MenuItem> listMenuItem  = jdbcTemplate.query("select * from menuitem", new BeanPropertyRowMapper(MenuItem.class));
		return listMenuItem;
	}

	public boolean updateOne(MenuItem t) {
		jdbcTemplate.update("update menuitem set menuitemname = ?,menuitemposition = ?, menugroupid = ? where menuitemid =?"
										,t.getMenuItemName(),t.getMenuItemPosition(),t.getMenuGroupId(),t.getMenuItemId());
		return true;
	}

	public boolean deleteByid(int id) {
		jdbcTemplate.update("delete from menuitem where menuitemid = ?",new Object[] {id});
		return true;
	}

	public boolean save(MenuItem t) {
		jdbcTemplate.update("insert into menuitem values (?,?,?,?)"
					,t.getMenuItemId(),t.getMenuItemName(),t.getMenuItemPosition(),t.getMenuGroupId());
		return true;
	}
	
}
