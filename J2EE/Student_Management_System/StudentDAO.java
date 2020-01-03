package com.tektaurus.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.tektaurus.bean.Student;

public class StudentDAO {

	Connection con;
	PreparedStatement pre;
	ResultSet res;
	
	public StudentDAO()

	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","seed1234");
			System.out.println("Database Connected....");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	public int insert(Student s)

	{
		System.out.println("In Insert");
		int ra=0;
		try
		{
			pre=con.prepareStatement("insert into student values(?,?,?,?,?)");
			pre.setInt(1, s.getSid());
			pre.setString(2,s.getName());
			pre.setString(3, s.getMobile());
			pre.setString(4,s.getAddress());
			pre.setString(5, s.getStream());
			ra=pre.executeUpdate();
			pre.close();
			
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return ra;
	}
	public int update(Student s)

	{
		System.out.println("In Update");
		int ra=0;
		try
		{
			pre=con.prepareStatement("update student set name=?,mobile=?,address=?,stream=? where sid=?");
			pre.setInt(5, s.getSid());
			pre.setString(1,s.getName());
			pre.setString(2, s.getMobile());
			pre.setString(3,s.getAddress());
			pre.setString(4, s.getStream());
			ra=pre.executeUpdate();
			pre.close();
			
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return ra;
	}
	public int delete(int sid)

	{
		System.out.println("In Delete");
		int ra=0;
		try
		{
			pre=con.prepareStatement("delete from student where sid=?");
			pre.setInt(1, sid);
			
			ra=pre.executeUpdate();
			pre.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return ra;
	}
	public ResultSet retrieve(int sid)
	{
		System.out.println("In Retrieve");
		try
		{
			
			pre=con.prepareStatement("select * from student where sid=?");
			pre.setInt(1,sid);
			res=pre.executeQuery();
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return res;
	}
}
