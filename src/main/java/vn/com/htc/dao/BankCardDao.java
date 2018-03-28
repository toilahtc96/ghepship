package vn.com.htc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import vn.com.htc.model.BankCard;

@Repository(value="BankCardDao")
public class BankCardDao implements ClassDao<BankCard> {

	Connection conn;
	public BankCardDao() {
		GetDB get = new GetDB();
		conn = get.getDB();
	}
	public BankCard getById(int id) {
		String sql = "Select * from bankcard where cardid ='"+id+"'";
		PreparedStatement ps;
		BankCard bankCard = null;
		try {
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				int userid = rs.getInt(2);
				String accountNumber = rs.getString(3);
				double accountBalance = rs.getDouble(4);
				bankCard = new BankCard(id, userid, accountNumber, accountBalance);
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return bankCard;
	}

	public List<BankCard> getAll() {
		String sql ="Select * from bankcard";
		PreparedStatement ps;
		List<BankCard> listBankCard = new ArrayList<BankCard>();
		try {
			ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				int id = rs.getInt(1);
				int userid = rs.getInt(2);
				String accountNumber = rs.getString(3);
				double accountBalance = rs.getDouble(4);
				BankCard bankCard = new BankCard(id, userid, accountNumber, accountBalance);
				listBankCard.add(bankCard);
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return listBankCard;
	}

	public boolean updateOne(BankCard t) {
		String sql =" Update bankcard set userid =?, "
				+ "accountnumber = ? "
				+ "where cardid = '"+t.getCartid()+"'";
		PreparedStatement ps;
		try {
			ps = conn.prepareCall(sql);
			ps.setInt(1,t.getUserid());
			ps.setString(2, t.getAccountNumber());
			ps.executeUpdate();
			return true;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return false;
	}


	public boolean deleteByid(int id) {
		String sql = "delete from bankcard where cardid = '"+id+"'";
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(sql);
			return ps.execute();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return false;
	}


	
	public boolean save(BankCard t) {
		String sql = "Insert into `bankcard`"
				+ "	(`userid`,`accountnumber`,`accountbalance`) values(?,?,?)";
		PreparedStatement ps;
		try {
			ps = conn.prepareStatement(sql);
			ps.setInt(1, t.getUserid());
			ps.setString(2, t.getAccountNumber());
			ps.setDouble(3, t.getAccountBalance());
			ps.toString();
			return ps.execute();
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return false;
	}
	

}
