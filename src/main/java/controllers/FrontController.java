package controllers;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

import daoPoolConnection.ConnectionPool;
import daoPoolConnection.ConnectionPoolException;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FrontController extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private final CommandProvider provider = new CommandProvider();
	
public FrontController() {
	super();
}

public void init(ServletConfig config) throws ServletException {
	try {
		ConnectionPool.getInstance().initPoolData();
		ConnectionPool.getInstance().takeConnection();
		System.out.println("start frontController.init"); 

	} catch (ConnectionPoolException e) {
		System.out.println("start frontController.init-exception"); 
		e.printStackTrace();

	}
}

public void destroy() {
	
	System.out.println("start frontController.destroy"); 
	ConnectionPool.getInstance().dispose();
}

protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
	try {
		processRequest(request, response);
	} catch (NoSuchAlgorithmException | InvalidKeySpecException | IOException | ServletException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}

protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException,IOException{
	loginRequest(request,response);
}

private void loginRequest(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException{
	response.setContentType("text/html");
	String login = request.getParameter("login");
	String password = request.getParameter("password");
	System.out.println("start frontController.loginRequest"); 
	
	if ((login.equals("Bogush") && password.equals("1111")) || (login.equals("otk2") && password.equals("2222")) ){

		/*
		 * RequestDispatcher
		 * requestDispatcher=request.getRequestDispatcher("/WEB-INF/jsp/main.jsp");
		 * requestDispatcher.forward(request, response);
		 */
		String commandName = request.getParameter("command");

		Command command = provider.getCommand(commandName);
		try {
			command.execute(request, response);
		} catch (ServletException | IOException	 | NoSuchAlgorithmException | InvalidKeySpecException e ) {
			e.printStackTrace();
			response.sendRedirect("controller?command=go_to_error_page");
		}
	}else {
		RequestDispatcher requestDispatcher=request.getRequestDispatcher("/WEB-INF/jsp/error.jsp");
		requestDispatcher.forward(request, response);
	}
	
			
}


private void processRequest(HttpServletRequest request,HttpServletResponse response) throws IOException, ServletException, NoSuchAlgorithmException, InvalidKeySpecException{
	String commandName = request.getParameter("command");
	System.out.println("start frontController.processRequest"); 
	Command command = provider.getCommand(commandName);
	try {
		command.execute(request, response);
	} catch (ServletException | IOException	 | NoSuchAlgorithmException | InvalidKeySpecException e ) {
		e.printStackTrace();
		response.sendRedirect("controller?command=go_to_error_page");
	}

}

}
