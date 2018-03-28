package vn.com.htc.service;

import java.util.List;

import org.springframework.stereotype.Service;
@Service
public interface ClassService<T> {
	public T getById(int id);
	public List<T> getAll();
	public boolean updateOne(T t);
	public boolean deleteByid(int id);
	public boolean save(T t);
}
