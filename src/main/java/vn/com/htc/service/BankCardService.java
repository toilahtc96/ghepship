package vn.com.htc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.com.htc.dao.ClassDao;
import vn.com.htc.model.BankCard;

@Service("BankCardService")
public class BankCardService implements ClassService<BankCard> {
	@Autowired
	private ClassDao<BankCard> bankCardDao;

	 
	public BankCard getById(int id) {
		return bankCardDao.getById(id);
	}

	 
	public List<BankCard> getAll() {
		// TODO Auto-generated method stub
		return bankCardDao.getAll();
	}

	 
	public boolean updateOne(BankCard t) {
		return bankCardDao.updateOne(t);
	}

	 
	public boolean deleteByid(int id) {
		return bankCardDao.deleteByid(id);
	}

	 
	public boolean save(BankCard t) {
		// TODO Auto-generated method stub
		return bankCardDao.save(t);
	}

}
