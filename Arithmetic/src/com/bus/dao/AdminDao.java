package com.bus.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bus.entity.Admin;

public interface AdminDao {
	//��
	//ɾ
	//��
	//��
	ResultSet selectAdminByLogin(Connection conn, Admin admin)throws SQLException;
	//��
	boolean insertAdmin(Connection conn,Admin admin)throws SQLException;
	//��

}
