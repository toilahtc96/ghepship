package vn.com.htc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import vn.com.htc.dao.ClassDao;
import vn.com.htc.model.Notification;

@Service("NotificaService")
@Transactional
public class NotificaService implements ClassService<Notification>{
	
	@Autowired
	private ClassDao<Notification> notificaDao;

	
	public Notification getById(int id) {
		// TODO Auto-generated method stub
		return notificaDao.getById(id);
	}

	
	public List<Notification> getAll() {
		// TODO Auto-generated method stub
		return notificaDao.getAll();
	}

	
	public boolean updateOne(Notification t) {
		// TODO Auto-generated method stub
		return notificaDao.updateOne(t);
	}

	
	public boolean deleteByid(int id) {
		// TODO Auto-generated method stub
		return notificaDao.deleteByid(id);
	}

	
	public boolean save(Notification t) {
		// TODO Auto-generated method stub
		return notificaDao.save(t);
	}

}
