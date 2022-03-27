package com.bus.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bus.entity.Admin;

public interface AdminDao {
	//增
	//删
	//改
	//查
	ResultSet selectAdminByLogin(Connection conn, Admin admin)throws SQLException;
	//查
	boolean insertAdmin(Connection conn,Admin admin)throws SQLException;
	//查

}
