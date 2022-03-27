package com.bus.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bus.entity.Grade;

public interface GradeDao {
	
	//²é
	
	ResultSet selectGrades(Connection conn , int id)throws SQLException;
	
	//Ôö
	boolean insertGrade(Connection conn,Grade grade)throws SQLException;

}
