package vn.com.htc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import vn.com.htc.dao.ClassDao;
import vn.com.htc.model.Image;

@Service("ImageService")
public class ImageService implements ClassService<Image> {

	@Autowired
	private ClassDao<Image> imageDao;
	
	public Image getById(int id) {
		// TODO Auto-generated method stub
		return imageDao.getById(id);
	}

	
	public List<Image> getAll() {
		// TODO Auto-generated method stub
		return imageDao.getAll();
	}

	
	public boolean updateOne(Image t) {
		// TODO Auto-generated method stub
		return imageDao.updateOne(t);
	}

	
	public boolean deleteByid(int id) {
		// TODO Auto-generated method stub
		return imageDao.deleteByid(id);
	}

	
	public boolean save(Image t) {
		// TODO Auto-generated method stub
		return imageDao.save(t);
	}

}
