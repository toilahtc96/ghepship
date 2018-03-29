package vn.com.htc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import vn.com.htc.dao.ClassDao;
import vn.com.htc.model.ItemType;

@Service("ItemTypeService")
@Transactional
public class ItemTypeService implements ClassService<ItemType>{
	@Autowired
	private ClassDao<ItemType> itemTypeDao;

	
	public ItemType getById(int id) {
		// TODO Auto-generated method stub
		return itemTypeDao.getById(id);
	}

	
	public List<ItemType> getAll() {
		// TODO Auto-generated method stub
		return itemTypeDao.getAll();
	}

	
	public boolean updateOne(ItemType t) {
		// TODO Auto-generated method stub
		return itemTypeDao.updateOne(t);
	}

	
	public boolean deleteByid(int id) {
		// TODO Auto-generated method stub
		return itemTypeDao.deleteByid(id);
	}

	
	public boolean save(ItemType t) {
		// TODO Auto-generated method stub
		return itemTypeDao.save(t);
	}
	

}
