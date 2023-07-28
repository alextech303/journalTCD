package controllerImpl;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

import controllers.Command;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Go_To_Base_Page implements Command {
	
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, NoSuchAlgorithmException, InvalidKeySpecException{
		System.out.println("class Go_To_Base_Page -> WEB-INF/jsp/main.jsp");
		request.getRequestDispatcher("WEB-INF/jsp/main.jsp").forward(request, response);
		
	}

}
