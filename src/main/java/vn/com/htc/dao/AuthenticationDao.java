package vn.com.htc.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import vn.com.htc.model.Authentication;

@Repository
@Qualifier("AuthenticationDao")
@SuppressWarnings({ "unchecked", "rawtypes" })
public class AuthenticationDao implements ClassDao<Authentication>{
	
	@Autowired
	JdbcTemplate jdbcTemplate;

	public Authentication getById(int id) {
		Authentication authentication = (Authentication) jdbcTemplate.queryForObject("select * from `authentication` where authenticationid = ?" ,new Object[] {id}	 ,new BeanPropertyRowMapper(Authentication.class));
		return authentication;
	}

	public List<Authentication> getAll() {
		List<Authentication> listAuthentication = jdbcTemplate.query("select * from `authentication`", new BeanPropertyRowMapper(Authentication.class));
		return listAuthentication;
	}

	public boolean updateOne(Authentication t) {
		jdbcTemplate.update("update `authentication` set authenticationid = ?, authenticationName = ?",t.getAuthenticationid(),t.getAuthenticationName());
		return true;
	}

	public boolean deleteByid(int id) {
		jdbcTemplate.update("detele from `authentication` where authenticationid = ?",new Object[] {id});
		return true;
	}

	public boolean save(Authentication t) {
		jdbcTemplate.update("insert into `authentication` values (?,?)",t.getAuthenticationid(),t.getAuthenticationName());
		return true;
	}
	
	/*Connection conn;
	public AuthenticationDao() {
		GetDB get = new GetDB();
		conn = get.getDB();
	}
	
	public Authentication getById(int id) {
		String sql = "select * from authentication where authenticationid ='"+id+"'";
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				int authenticationId = rs.getInt(1);
				String authenticationName = rs.getString(2);
				Authentication authentication = new Authentication(authenticationId, authenticationName);
				return authentication;
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return null;
	}

	public List<Authentication> getAll() {
		String sql ="Select * from authentication";
		PreparedStatement ps;
		ArrayList<Authentication> listAuthentication = new ArrayList<Authentication>()  ;
		try {
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				int authenticationId = rs.getInt(1);
				String authenticationName = rs.getString(2);
				Authentication authentication = new Authentication(authenticationId, authenticationName);
				listAuthentication.add(authentication);
			}
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return listAuthentication;
	}

	public boolean updateOne(Authentication t) {
		String sql ="Update authentication set authenticationname=? where authenticationid = '"+t.getAuthenticationid()+"'";
		PreparedStatement ps;
		try {
			
			ps = conn.prepareStatement(sql);
			ps.setString(1, t.getAuthenticationName());
			ps.executeUpdate();
			return true;
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return false;
	}

	public boolean deleteByid(int id) {
		String sql = "Delete from authentication where authenticationid = '"+id+"'";
		PreparedStatement ps ;
		try {
			ps = conn.prepareStatement(sql);
			return ps.execute();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return false;
	}

	public boolean save(Authentication t) {
		String sql ="Insert into authentication Values (?,?)";
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, t.getAuthenticationid());
			ps.setString(2, t.getAuthenticationName());
			System.out.println(ps.toString());
			ps.execute();
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return false;
		
	}*/

}
