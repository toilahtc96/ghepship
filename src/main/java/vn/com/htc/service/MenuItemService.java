package vn.com.htc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.com.htc.dao.ClassDao;
import vn.com.htc.model.MenuItem;

@Service("menuItemService")
public class MenuItemService implements ClassService<MenuItem>{

	@Autowired
	private ClassDao<MenuItem> menuItemDao;

	public MenuItem getById(int id) {
		// TODO Auto-generated method stub
		return menuItemDao.getById(id);
	}

	public List<MenuItem> getAll() {
		// TODO Auto-generated method stub
		return menuItemDao.getAll();
	}

	public boolean updateOne(MenuItem t) {
		// TODO Auto-generated method stub
		return menuItemDao.updateOne(t);
	}

	public boolean deleteByid(int id) {
		// TODO Auto-generated method stub
		return menuItemDao.deleteByid(id);
	}

	public boolean save(MenuItem t) {
		// TODO Auto-generated method stub
		return menuItemDao.save(t);
	}
	
}
