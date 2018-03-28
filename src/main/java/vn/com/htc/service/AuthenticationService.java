package vn.com.htc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.com.htc.dao.AuthenticationDao;
import vn.com.htc.model.Authentication;

@Service(value="AuthenticationService")
public class AuthenticationService implements ClassService<Authentication>{

	@Autowired
	private AuthenticationDao authenticationDao;
	
	public Authentication getById(int id) {
		return authenticationDao.getById(id);
	}

	public List<Authentication> getAll() {
		return authenticationDao.getAll();
	}

	public boolean updateOne(Authentication t) {
		return authenticationDao.updateOne(t);
	}

	public boolean deleteByid(int id) {
		return authenticationDao.deleteByid(id);
	}

	public boolean save(Authentication t) {
		return authenticationDao.save(t);
	}

}
