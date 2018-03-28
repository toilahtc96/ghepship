package vn.com.htc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import vn.com.htc.model.History;

@Repository(value = "HistoryDao")
public class HistoryDao implements ClassDao<History> {
	Connection conn;

	public HistoryDao() {
		GetDB get = new GetDB();
		conn = get.getDB();
	}

	public History getById(int id) {
		String sql = "Select * from history where userid = '" + id + "'";
		PreparedStatement ps;
		History history = new History();
		try {
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				history.setUserid(rs.getInt(1));
				history.setOrderid(rs.getInt(2));
				return history;
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

	public List<History> getAll() {
		String sql = "Select * from history";
		PreparedStatement ps;
		ArrayList<History> listHistory = new ArrayList<History>();
		try {
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				History history = new History();
				history.setUserid(rs.getInt(1));
				history.setOrderid(rs.getInt(2));
				listHistory.add(history);
			}
			return listHistory;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return listHistory;
	}

	public boolean updateOne(History t) {
		String sql = "Update history set userid = ?, orderid = ? where userid = " + t.getUserid() + "'";
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, t.getUserid());
			ps.setInt(2, t.getOrderid());
			ps.executeUpdate();
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return false;
	}

	public boolean deleteByid(int id) {
		String sql = "Delete from history where userid = '" + id + "'";
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(sql);
			return ps.execute();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return false;
	}

	public boolean save(History t) {
		String sql = "Insert into history ('userid','orderid') values(?,?)";
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, t.getUserid());
			ps.setInt(2, t.getOrderid());
			return ps.execute();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return false;
	}

}
