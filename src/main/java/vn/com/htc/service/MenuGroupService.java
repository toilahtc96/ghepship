package vn.com.htc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.com.htc.dao.ClassDao;
import vn.com.htc.model.MenuGroup;

@Service("menuGroupService")
public class MenuGroupService implements ClassService<MenuGroup> {

	@Autowired
	private ClassDao<MenuGroup> menuGroupDao;

	public MenuGroup getById(int id) {
		// TODO Auto-generated method stub
		return menuGroupDao.getById(id);
	}

	public List<MenuGroup> getAll() {
		// TODO Auto-generated method stub
		return menuGroupDao.getAll();
	}

	public boolean updateOne(MenuGroup t) {
		// TODO Auto-generated method stub
		return menuGroupDao.updateOne(t);
	}

	public boolean deleteByid(int id) {
		// TODO Auto-generated method stub
		return menuGroupDao.deleteByid(id);
	}

	public boolean save(MenuGroup t) {
		// TODO Auto-generated method stub
		return menuGroupDao.save(t);
	}
	
	
}
