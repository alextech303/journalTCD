package controllerImpl;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.sql.SQLException;
import java.util.List;

import beans.WriteS500;
import beans.WriteS500_2;
import controllers.Command;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.IWriteService;
import service.ServiceProvider;

public class ShowWritesInJourneyS500_2 implements Command {
	private final IWriteService iWriteService = ServiceProvider.getInstance().getiWriteService();
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, NoSuchAlgorithmException, InvalidKeySpecException, SQLException {
		
		List<WriteS500> listWritesS500;
		
		listWritesS500 = iWriteService.getListWriteS500();
								
		request.setAttribute("listWritesS500", listWritesS500 );
			
		request.getRequestDispatcher("WEB-INF/jsp/show_journalS500_2.jsp").forward(request, response);
	
			
			//response.sendRedirect("controller?command=go_to_error_page");
		
	}

		
	}

