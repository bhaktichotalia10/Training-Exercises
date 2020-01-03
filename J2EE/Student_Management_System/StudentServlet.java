package com.tektaurus.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tektaurus.bean.Student;
import com.tektaurus.dao.StudentDAO;


@WebServlet("/Student")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	   StudentDAO dao;
	   Student s;
	   PrintWriter out;
    public StudentServlet() {

       dao=new StudentDAO();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try
		{
			out=response.getWriter();
			int sid=Integer.parseInt(request.getParameter("sid"));
			ResultSet res=dao.retrieve(sid);
			out.println("<table border=3><tr><th>Student Id</th><th>Student Name</th><th>Mobile No</th><th>Address</th><th>Stream</th></tr>");
			while(res.next())
			{
				out.println("<tr>");
				out.println("<td>"+res.getInt("sid")+"</td>");
				out.println("<td>"+res.getString("name")+"</td>");
				out.println("<td>"+res.getString("mobile")+"</td>");
				out.println("<td>"+res.getString("address")+"</td>");
				out.println("<td>"+res.getString("stream")+"</td>");
				out.println("</tr>");
			}
			out.println("</table>");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		out=response.getWriter();
		int sid=Integer.parseInt(request.getParameter("sid"));
		String name=request.getParameter("name");
		String mobile=request.getParameter("mobile");
		String address=request.getParameter("address");
		String stream=request.getParameter("stream");
		
		s=new Student(sid,name,mobile,address,stream);
		int ra=dao.insert(s);
		if(ra>0)
			out.println("<font color=green>Student Details Inserted Succcessfully.</font>");
		else
			out.println("<font color=red>Student Details are not inserted.</font>");
		out.println("To Go Back To The Form <a href='home.html'>Click Here</a>");
			
	}

	
	

}
