package vn.com.htc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import vn.com.htc.dao.ClassDao;
import vn.com.htc.model.User;

@Service("UserService")
@Transactional
public class UserService implements ClassDao<User> {
	
	@Autowired
	private ClassDao<User> userDao;
	//UserDao UserDao;

	public User getById(int id) {
		System.out.println(userDao.toString()+" Service");
		return userDao.getById(id);
	}

	public List<User> getAll() {
		// TODO Auto-generated method stub
		return userDao.getAll();
	}

	public boolean updateOne(User t) {
		// TODO Auto-generated method stub
		return userDao.updateOne(t);
	}

	public boolean deleteByid(int id) {
		// TODO Auto-generated method stub
		return userDao.deleteByid(id);
	}

	public boolean save(User t) {
		// TODO Auto-generated method stub
		return userDao.save(t);
	}

}
