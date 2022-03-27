package com.bus.service;

import java.util.List;

import com.bus.entity.Grade;

public interface GradeService {
	
	boolean insertGrade(Grade grade);
	
	//²é
	List<Grade> findGrades(int id);
	

}
