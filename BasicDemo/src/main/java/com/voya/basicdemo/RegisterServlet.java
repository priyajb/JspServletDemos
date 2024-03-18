package com.voya.basicdemo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
	
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String sal=request.getParameter("salary");
		double salary=Double.parseDouble(sal);
		
		String employeeName=request.getParameter("employeeName");
		
		String city=request.getParameter("city");

		String mobile=request.getParameter("mobile");
		long mobilenum=Long.parseLong(mobile);

		
		String[] hobbies=request.getParameterValues("hobby");
		PrintWriter writer=response.getWriter();
		for(String hobby:hobbies) {
		writer.print("Hobby "+hobby );
			
		}
		
		writer.print("Welcome"+employeeName +"<br>");
		writer.print("City:"+   city+  "<br>");
		writer.print("MobileNumber: "+   mobilenum +  "<br>"  );
	    writer.print("Salary: " +salary+ "<br>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
