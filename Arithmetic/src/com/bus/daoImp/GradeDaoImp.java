package com.bus.daoImp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.bus.dao.BaseDao;
import com.bus.dao.GradeDao;
import com.bus.entity.Grade;

public class GradeDaoImp extends BaseDao implements GradeDao {

	@Override
	public boolean insertGrade(Connection conn, Grade grade) throws SQLException {
		String sql = "insert into grade (grade,id) value (?,?)";
		return super.insertDate(conn, sql, grade.getGrade(),grade.getId());
	}

	@Override
	public ResultSet selectGrades(Connection conn, int id) throws SQLException {
		String sql = "select grade from grade where id = ?";
		return super.selectDate(conn, sql, id);
	}
	

}
