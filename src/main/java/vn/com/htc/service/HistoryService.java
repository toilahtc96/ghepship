package vn.com.htc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.com.htc.dao.HistoryDao;
import vn.com.htc.model.History;

@Service(value="HistoryService")
public class HistoryService implements ClassService<History> {

	@Autowired
	private HistoryDao historyDao;
	
	public History getById(int id) {
		return historyDao.getById(id);
	}

	
	public List<History> getAll() {
		// TODO Auto-generated method stub
		return historyDao.getAll();
	}

	
	public boolean updateOne(History t) {
		// TODO Auto-generated method stub
		return historyDao.updateOne(t);
	}

	
	public boolean deleteByid(int id) {
		// TODO Auto-generated method stub
		return historyDao.deleteByid(id);
	}

	
	public boolean save(History t) {
		// TODO Auto-generated method stub
		return historyDao.save(t);
	}

}
