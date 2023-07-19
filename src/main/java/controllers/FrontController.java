package controllers;

import java.io.IOException;
import java.io.PrintWriter;

import com.oracle.wls.shaded.org.apache.xpath.operations.Equals;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FrontController extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
public FrontController() {
	super();
}

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
	processRequest(request,response);
}

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
	processRequest(request,response);
}

private void processRequest(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException{
	response.setContentType("text/html");
	String login = request.getParameter("login");
	String password = request.getParameter("password");
	
	if ((login.equals("otk1") && password.equals("1111")) || (login.equals("otk2") && password.equals("2222")) ){

		RequestDispatcher requestDispatcher=request.getRequestDispatcher("/WEB-INF/jsp/main.jsp");
		requestDispatcher.forward(request, response);
	}else {
		RequestDispatcher requestDispatcher=request.getRequestDispatcher("/WEB-INF/jsp/error.jsp");
		requestDispatcher.forward(request, response);
	}
	
			
}
}
