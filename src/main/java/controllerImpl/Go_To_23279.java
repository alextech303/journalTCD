package controllerImpl;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

import controllers.Command;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Go_To_23279 implements Command {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, NoSuchAlgorithmException, InvalidKeySpecException {
		String idS500 = request.getParameter("idS500");
		request.getSession(true).setAttribute("idS500", idS500);
		request.getRequestDispatcher("WEB-INF/jsp/23279.jsp").forward(request, response);
		
	}

}
