package vn.com.htc.dao;

import java.util.List;

public interface ClassDao<T> {
	public T getById(int id);
	public List<T> getAll();
	public boolean updateOne(T t);
	public boolean deleteByid(int id);
	public boolean save(T t);
}
