package vn.com.htc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import vn.com.htc.model.MenuGroup;

@Repository
@Qualifier("menuGroupDao")
@SuppressWarnings({ "unchecked", "rawtypes" })
public class MenuGroupDao implements ClassDao<MenuGroup> {
	@Autowired
	JdbcTemplate jdbcTemplate;

	public MenuGroup getById(int id) { 
		
		MenuGroup menuGroup = (MenuGroup) jdbcTemplate.queryForObject("select * from menugroup where menugroupid = ?", 
																new Object[] {id},new BeanPropertyRowMapper(MenuGroup.class));
		
		return menuGroup;
	}

	public List<MenuGroup> getAll() {
		List<MenuGroup> listMenuGroup = jdbcTemplate.query("select * from menugroup", new BeanPropertyRowMapper(MenuGroup.class));
		return listMenuGroup;
	}

	public boolean updateOne(MenuGroup t) {
		jdbcTemplate.update("Update menugroup set menugroupname = ? where menugroupid =? ",t.getMenuGroupName(),t.getMenuGroupId());
		return true;
	}

	public boolean deleteByid(int id) {
		jdbcTemplate.update("delete from menugroup where menugroupid = ?", new Object[] {id});
		return true;
	}

	public boolean save(MenuGroup t) {
		jdbcTemplate.update("insert into menugroup values(?,?)",t.getMenuGroupId(),t.getMenuGroupName());
		return true;
	}
	
}
