package com.doctorapp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.doctorapp.model.Doctor;
import com.doctorapp.service.DoctorServiceImpl;
import com.doctorapp.service.IDoctorService;



/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/addServlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
     IDoctorService doctorService = new DoctorServiceImpl();
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String doctorName=request.getParameter("doctorName");
		String speciality=request.getParameter("speciality");
		String doctorfees=request.getParameter("fees");
		double fees=Double.parseDouble(doctorfees);
		String doctorratings=request.getParameter("ratings");
		int ratings=Integer.parseInt(doctorratings);
		String doctorexperience=request.getParameter("experience");
		int experience=Integer.parseInt(doctorexperience);
		
		
	    Doctor doctor=new Doctor();

		doctor.setDoctorName(doctorName);
		doctor.setSpeciality(speciality);
		doctor.setExperience(experience);
		doctor.setFees(fees);
		doctor.setRatings(ratings);
		
		doctorService.addDoctor(doctor);
		RequestDispatcher dispatcher=request.getRequestDispatcher("addDoctor.jsp");
		dispatcher.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
