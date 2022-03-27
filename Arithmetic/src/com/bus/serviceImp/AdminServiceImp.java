package com.bus.serviceImp;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bus.daoImp.AdminDaoImp;
import com.bus.entity.Admin;
import com.bus.service.AdminService;
import com.bus.until.DBHelper;



public class AdminServiceImp implements AdminService{
	
	private AdminDaoImp ad;
	
	public AdminServiceImp(){
		ad = new AdminDaoImp();
	}

	@Override
	public Admin findAdminByLogin(Admin admin) {
		Connection conn = DBHelper.getConnection();	
		try {
			
			ResultSet set = ad.selectAdminByLogin(conn, admin);
			if(set.next()){
				int id = set.getInt("id");
				String name = set.getString("name");
				String password = set.getString("password");
				return new Admin(id,name,password);
			}			
		} catch (SQLException e) {	
			e.printStackTrace();
		}finally{
			ad.closeAll();
		}
		return null;
	}
	@Override
	public boolean insertAdmin(Admin admin) {
		Connection conn=DBHelper.getConnection();
		try {
			ad.insertAdmin(conn, admin);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			ad.closeAll();
		}
		return true;	
	}



}
