package controllerImpl;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.sql.SQLException;
import java.util.List;
import beans.Write;
import controllers.Command;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.IWriteService;
import service.ServiceProvider;

public class Show5WriteInJourney implements Command {
	
	
	
private final IWriteService iWriteService = ServiceProvider.getInstance().getiWriteService();
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, NoSuchAlgorithmException, InvalidKeySpecException, SQLException {
		
		List<Write> writes_5;
		
		writes_5 = iWriteService.getListWrite();
		
		System.out.println(writes_5.get(26));
		
		request.setAttribute("hello", "ok" );
		
		request.setAttribute("writes", writes_5 );
		
	

			request.getRequestDispatcher("WEB-INF/jsp/show_journal.jsp").forward(request, response);
	
			
			//response.sendRedirect("controller?command=go_to_error_page");
		
	}

		
	}


