package com.bus.serviceImp;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bus.daoImp.GradeDaoImp;
import com.bus.entity.Grade;
import com.bus.service.GradeService;
import com.bus.until.DBHelper;

public class GradeServiceImp implements GradeService {
	
	private GradeDaoImp gd;
	public GradeServiceImp() {
		gd = new GradeDaoImp();
	}

	@Override
	public boolean insertGrade(Grade grade) {
		Connection conn=DBHelper.getConnection();
		
		try {
			gd.insertGrade(conn, grade);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally{
			gd.closeAll();
		}
		
		return true;
	}

	@Override
	public List<Grade> findGrades(int id) {
		ArrayList<Grade> list = new ArrayList<Grade>();
		Connection conn = DBHelper.getConnection();
		ResultSet set;
		
		try {
			set = gd.selectGrades(conn, id);
			
			while(set.next()) {
				int grade = set.getInt("grade");
				list.add(new Grade(grade));
			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		finally{
			gd.closeAll();
		}
		return list;
		
	}

}
