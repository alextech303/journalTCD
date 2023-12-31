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
		String chooseIdS500 = request.getParameter("chooseIdS500");
		request.getSession(true).setAttribute("chooseIdS500", chooseIdS500);
		request.getRequestDispatcher("WEB-INF/jsp/23279.jsp").forward(request, response);
		
	}

}
