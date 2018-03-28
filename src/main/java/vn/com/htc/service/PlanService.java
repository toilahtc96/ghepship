package vn.com.htc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import vn.com.htc.dao.ClassDao;
import vn.com.htc.model.Plan;

@Service("PlanService")
@Transactional
public class PlanService implements ClassService<Plan>{

	@Autowired
	private ClassDao<Plan> planDao;
	
	
	public Plan getById(int id) {
		// TODO Auto-generated method stub
		return planDao.getById(id);
	}

	
	public List<Plan> getAll() {
		// TODO Auto-generated method stub
		return planDao.getAll();
	}

	
	public boolean updateOne(Plan t) {
		// TODO Auto-generated method stub
		return planDao.updateOne(t);
	}

	
	public boolean deleteByid(int id) {
		// TODO Auto-generated method stub
		return planDao.deleteByid(id);
	}

	
	public boolean save(Plan t) {
		// TODO Auto-generated method stub
		return planDao.save(t);
	}

}
