package com.bus.view;

import java.util.List;

import com.bus.entity.Admin;
import com.bus.entity.Grade;
import com.bus.serviceImp.AdminServiceImp;
import com.bus.serviceImp.GradeServiceImp;

public class Run {

	public static void main(String[] args) {
		//测试登录正确		
				/*AdminServiceImp as;
				as=new AdminServiceImp();
				
				Admin admin=as.findAdminByLogin(new Admin("AAA","aaa"));
				
				System.out.println(admin);
				if(admin != null) {
					System.out.println("yes");
				}else {
					System.out.println("no");
				}*/
		//测试新增成绩正确
		/*GradeServiceImp gs;
		gs = new GradeServiceImp();
		
		boolean grade = gs.insertGrade(new Grade(100,admin.getId()));
		System.out.println(grade);
		*/
		GradeServiceImp gs;
		gs = new GradeServiceImp();
		AdminServiceImp as;
		as=new AdminServiceImp();
		
		Admin admin=as.findAdminByLogin(new Admin("AAA","aaa"));
		List<Grade> list= gs.findGrades(admin.getId());
		for(Grade g: list) {
			System.out.println(g.getGrade());
		}
//		String loginName=(String)session.getAttribute("loginName");
		
//		new Process().process();
	}

}
