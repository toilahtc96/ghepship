package vn.com.htc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import vn.com.htc.dao.ClassDao;
import vn.com.htc.model.Order;

@Service("OrderService")
@Transactional
public class OrderService implements ClassService<Order> {

	@Autowired
	private ClassDao<Order> orderDao;
	
	
	public Order getById(int id) {
		// TODO Auto-generated method stub
		return orderDao.getById(id);
	}

	
	public List<Order> getAll() {
		// TODO Auto-generated method stub
		return orderDao.getAll();
	}

	
	public boolean updateOne(Order t) {
		// TODO Auto-generated method stub
		return orderDao.updateOne(t);
	}

	
	public boolean deleteByid(int id) {
		// TODO Auto-generated method stub
		return orderDao.deleteByid(id);
	}

	
	public boolean save(Order t) {
		// TODO Auto-generated method stub
		return orderDao.save(t);
	}

}
