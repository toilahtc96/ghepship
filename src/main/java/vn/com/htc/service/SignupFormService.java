package vn.com.htc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import vn.com.htc.dao.ClassDao;
import vn.com.htc.model.SignupForm;

@Service("SignupFormService")
@Transactional
public class SignupFormService implements ClassService<SignupForm>{

	@Autowired
	private ClassDao<SignupForm> signupFormDao;
	
	public SignupForm getById(int id) {
		// TODO Auto-generated method stub
		return signupFormDao.getById(id);
	}

	
	public List<SignupForm> getAll() {
		// TODO Auto-generated method stub
		return signupFormDao.getAll();
	}

	
	public boolean updateOne(SignupForm t) {
		// TODO Auto-generated method stub
		return signupFormDao.updateOne(t);
	}

	
	public boolean deleteByid(int id) {
		// TODO Auto-generated method stub
		return signupFormDao.deleteByid(id);
	}

	
	public boolean save(SignupForm t) {
		// TODO Auto-generated method stub
		return signupFormDao.save(t);
	}

}
