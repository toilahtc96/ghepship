package vn.com.htc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import vn.com.htc.dao.ClassDao;
import vn.com.htc.model.Item;

@Service("ItemService")
@Transactional
public class ItemService implements ClassService<Item> {
	@Autowired
	private ClassDao<Item> itemDao;

	
	public Item getById(int id) {
		// TODO Auto-generated method stub
		return itemDao.getById(id);
	}

	
	public List<Item> getAll() {
		// TODO Auto-generated method stub
		return itemDao.getAll();
	}

	
	public boolean updateOne(Item t) {
		// TODO Auto-generated method stub
		return itemDao.updateOne(t);
	}

	
	public boolean deleteByid(int id) {
		// TODO Auto-generated method stub
		return itemDao.deleteByid(id);
	}

	
	public boolean save(Item t) {
		// TODO Auto-generated method stub
		return itemDao.save(t);
	}

}
