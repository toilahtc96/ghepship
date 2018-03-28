package vn.com.htc.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import vn.com.htc.model.Image;

@Repository(value="ImageDao")
public class ImageDao implements ClassDao<Image>{
	java.sql.Connection conn;
	public ImageDao() {
		GetDB get = new GetDB();
		conn = get.getDB();
	}
	public Image getById(int id) {
		String sql = "Select * from image where imageid = '"+id+"'";
		PreparedStatement ps;
		Image image = new Image();
		try {
			ps = conn.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				image.setImageid(rs.getInt(1));
				image.setItemid(rs.getInt(2));
				image.setImageLink(rs.getString(3));
				return image;
			}
			
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		return image;
	}

	public List<Image> getAll() {
		String sql = "Select * from image";
		PreparedStatement ps;
		ArrayList<Image> listImage = new ArrayList<Image>();
		try {
			ps = conn.prepareStatement(sql);
		    ResultSet rs = ps.executeQuery();
		    while(rs.next()) {
		    	Image image = new Image();
		    	image.setImageid(rs.getInt(1));
		    	image.setItemid(rs.getInt(2));
		    	image.setImageLink(rs.getString(3));
		    	listImage.add(image);
		    }
		    return listImage;
		} catch (Exception e) {
			// TODO: handle exception
		}
		return listImage;
	}

	public boolean updateOne(Image t) {
		String sql = "Update image set itemid = ?, imagelink = ? where imageid = '"+t.getImageid()+"'";
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, t.getItemid());
			ps.setString(2, t.getImageLink());
			ps.executeUpdate();
			return true;
		} catch (Exception e) {
			System.out.println("Update: "+e.getMessage());
		}
		return false;
	}


	public boolean deleteByid(int id) {
		String sql = "delete from image where imageid = '"+id+"'";
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(sql);
			return ps.execute();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return false;
	}


	public boolean save(Image t) {
		String sql ="Insert into image (imageid,itemid,imagelink) values (?,?,?) ";
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, t.getImageid());
			ps.setInt(2, t.getItemid());
			ps.setString(3, t.getImageLink());
			ps.execute();
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return false;
	}
}
