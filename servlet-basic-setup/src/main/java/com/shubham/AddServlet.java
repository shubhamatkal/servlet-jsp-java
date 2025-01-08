package com.shubham;
import jakarta.servlet.http.HttpServlet;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpServlet;

import jakarta.servlet.http.HttpServletRequest;

public class AddServlet extends HttpServlet {
	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		int i = Integer.parseInt(req.getParameter("num1"));
		int j = Integer.parseInt(req.getParameter("num1"));
		int k = i+j;
		System.out.println("result: "+ k);
		PrintWriter out = res.getWriter();
		
		out.println("Result is "+ k);
	}

}

//package com.shubham;
//public class AddServlet{
//	public void main(String[] args) {
//		System.out.println("Hello");
//	}
//}