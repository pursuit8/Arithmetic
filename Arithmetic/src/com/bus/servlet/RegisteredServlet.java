package com.bus.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bus.entity.Admin;
import com.bus.serviceImp.AdminServiceImp;


@WebServlet("/RegisteredServlet")
public class RegisteredServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	AdminServiceImp as ;
       
    public RegisteredServlet() {
    	as =new AdminServiceImp();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//----------------------��������-----------------------
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String name=request.getParameter("userName");
		String password=request.getParameter("password");
		
		System.out.println(name+"--"+password);
		
		boolean admin=as.insertAdmin(new Admin(name,password));
		System.out.println(admin);
		PrintWriter out=response.getWriter();
		if(admin == true){
			out.write("<script>alert('ע��ɹ���');location.href='login.html';</script>");
		}else{
			out.write("<script>alert('�Բ���ע��ʧ�ܣ�');history.back();</script>");
		}
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		doGet(request, response);
	}

}
