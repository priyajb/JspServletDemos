
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
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
		response.setContentType("text/html");
		// TODO Auto-generated method stub
		String sal=request.getParameter("salary");
		double salary=Double.parseDouble(sal);
		
		String employeeName=request.getParameter("employeeName");
		
		String city=request.getParameter("city");
        String course=request.getParameter("course");
		String mobile=request.getParameter("mobile");
		long mobilenum=Long.parseLong(mobile);

		
		String[] hobbies=request.getParameterValues("hobby");
		
		
		
		//set attribute to send the object to the next page
		request.setAttribute("employeeName", employeeName);
		request.setAttribute("city", city);
		request.setAttribute("course", course);
		request.setAttribute("salary", salary);
		request.setAttribute("mobile",mobilenum);
		request.setAttribute("hobbies", hobbies);
		PrintWriter writer=response.getWriter();
		writer.print("this is from servlet<br>");
		
//		//create a request dispatcher to send to next page
     	RequestDispatcher dispatcher=request.getRequestDispatcher("success.jsp");
//		//forward request and response
     	dispatcher.forward(request, response);
		
		//response.sendRedirect("success.jsp");
	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
