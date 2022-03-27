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


@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	AdminServiceImp as;

    public LoginServlet() {
        as=new AdminServiceImp();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//----------------------��������-----------------------
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String name=request.getParameter("userName");
		String password=request.getParameter("password");
		
		System.out.println(name+"-111-"+password);
		
		Admin admin=as.findAdminByLogin(new Admin(name,password));
		
		PrintWriter out=response.getWriter();
		if(admin !=null){
			//��¼�ɹ�����Ӧ�ðѵ�¼�û��������session����
			HttpSession session=request.getSession();
			session.setAttribute("loginName", admin.getName());
			out.write("<script>location.href='index.jsp';</script>");
		}else{
			out.write("<script>alert('�Բ��𣬵�¼ʧ�ܣ�');history.back();</script>");
		}
		
		

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
