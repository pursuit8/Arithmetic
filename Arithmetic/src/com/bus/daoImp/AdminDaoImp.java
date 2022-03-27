package com.bus.daoImp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bus.dao.AdminDao;
import com.bus.dao.BaseDao;
import com.bus.entity.Admin;

public class AdminDaoImp extends BaseDao implements AdminDao{

	@Override
	public ResultSet selectAdminByLogin(Connection conn, Admin admin) throws SQLException {
		String sql = "select * from admin where name = ? and password = ?";//拼接SQL语句前面加个空格
		
		return super.selectDate(conn, sql, admin.getName(),admin.getPassword());
	}

	@Override
	public boolean insertAdmin(Connection conn, Admin admin) throws SQLException {
		String sql = "insert into admin (name,password) value (?,?)";
//		Object[] objs={admin.getName(),admin.getPassword()};
//		return super.selectDate(conn, sql, objs);
		return super.insertDate(conn, sql, admin.getName(),admin.getPassword());
	}


	
	
	

}
