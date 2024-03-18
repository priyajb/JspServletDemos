package com.doctorapp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctorapp.service.DoctorServiceImpl;
import com.doctorapp.service.IDoctorService;

/**
 * Servlet implementation class UpdateServlet
 */
@WebServlet("/updateServlet")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IDoctorService doctorService=new DoctorServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String doctorId=request.getParameter("doctorId");
		int doctorid=Integer.parseInt(doctorId);
		String doctorfees=request.getParameter("fees");
		double fees=Double.parseDouble(doctorfees);
		
		doctorService.updateDoctor(doctorid, fees);
		
		PrintWriter writer=response.getWriter();
		
		RequestDispatcher dispatcher=request.getRequestDispatcher("adminDash.jsp");
		dispatcher.include(request, response);
		
		writer.print("doctor data updated ");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
