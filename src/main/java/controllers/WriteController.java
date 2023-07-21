package controllers;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class WriteController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	public WriteController() {
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
		String name = request.getParameter("name");
		RequestDispatcher requestDispatcher=request.getRequestDispatcher("/WEB-INF/jsp/name.jsp");
		requestDispatcher.forward(request, response);
		
}
}
