package com.tektaurus.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tektaurus.bean.Student;
import com.tektaurus.dao.StudentDAO;

/**
 * Servlet implementation class ModifyStudent
 */
@WebServlet("/Modify")
public class ModifyStudent extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	 StudentDAO dao;
	   Student s;
	   PrintWriter out;
    public ModifyStudent() {
    	 dao=new StudentDAO();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		try
		{
			out=response.getWriter();
			out.println("Modify Servlet doGet Called");
			System.out.println("Modify Servlet doGet Called");
			int sid=Integer.parseInt(request.getParameter("sid"));
			int ra=dao.delete(sid);
			if(ra>0)
				out.println("<font color=green>Student Details Deleted Succcessfully.</font><br>");
			else
				out.println("<font color=red>Student Details are not deleted.</font><br>");
			out.println("To Go Back To The Form <a href='home.html'>Click Here</a>");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		out=response.getWriter();
		System.out.println("In doPost of Modify Servlet..");
		int sid=Integer.parseInt(request.getParameter("sid"));
		String name=request.getParameter("name");
		String mobile=request.getParameter("mobile");
		String address=request.getParameter("address");
		String stream=request.getParameter("stream");
		
		s=new Student(sid,name,mobile,address,stream);
		int ra=dao.update(s);
		if(ra>0)
			out.println("<font color=green>Student Details Updated Succcessfully.</font>");
		else
			out.println("<font color=red>Student Details are not Updated.</font>");
		out.println("To Go Back To The Form <a href='http://localhost:9090/StudentManagementSystem/home.html'>Click Here</a>");
	}

}
