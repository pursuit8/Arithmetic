package com.bus.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bus.entity.Grade;

public interface GradeDao {
	
	//��
	
	ResultSet selectGrades(Connection conn , int id)throws SQLException;
	
	//��
	boolean insertGrade(Connection conn,Grade grade)throws SQLException;

}
