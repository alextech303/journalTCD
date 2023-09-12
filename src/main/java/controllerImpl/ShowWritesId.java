package controllerImpl;

import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.sql.SQLException;
import java.util.List;

import beans.WriteS500;
import controllers.Command;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.IWriteService;
import service.ServiceProvider;

public class ShowWritesId implements Command {
	
	private final IWriteService iWriteService = ServiceProvider.getInstance().getiWriteService();
	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException, NoSuchAlgorithmException, InvalidKeySpecException, SQLException {
		
		WriteS500 writesS500Id;
		//String chooseIdS500 = request.getParameter("idS500_2");
		//System.out.println("request.getParameter(chooseIdS500) = "+chooseIdS500);
	//	String id = "${sessionScope.idS500}";
		 int id = Integer.parseInt(request.getParameter("idS500_2"));
		  
		
		 
		
		writesS500Id = iWriteService.getWriteS500Id(id);
								
		request.setAttribute("writesS500Id", writesS500Id );
			
		request.getRequestDispatcher("WEB-INF/jsp/show_journalS500_Id.jsp").forward(request, response);
	
				
	}

		
	}


