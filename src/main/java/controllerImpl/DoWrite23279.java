package controllerImpl;

import java.io.IOException;
import java.sql.SQLException;
import java.time.LocalDate;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import beans.Write;
import controllers.Command;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.IWriteService;
import service.ServiceException;
import service.ServiceProvider;

public class DoWrite23279 implements Command {
	
	private final IWriteService iWriteService = ServiceProvider.getInstance().getiWriteService();
	

	private static final String JSP_NAME_PARAM = "name";
	private static final String JSP_SIZE_CELL_1 = "size_cell_1";
	private static final String JSP_SIZE_CELL_2 = "size_cell_2";
	private static final String JSP_DIAMETER_PARAM = "diameter";
	private static final String JSP_DATE_PARAM = "date";

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("DoWrite23279.execute");
		Write newWrite;
		String name;
		
		String size_cell_1;
		String size_cell_2;
		String diameter;
		String date;

		name = request.getParameter(JSP_NAME_PARAM);
		System.out.println("name from request : "+name);

		
		size_cell_1 = request.getParameter(JSP_SIZE_CELL_1);
		System.out.println("size_cell_1 from request : "+size_cell_1);
		size_cell_2 = request.getParameter(JSP_SIZE_CELL_2);
		diameter = request.getParameter(JSP_DIAMETER_PARAM);
        date = request.getParameter(JSP_DATE_PARAM);
        newWrite = new Write(name,size_cell_1,size_cell_2,diameter,date);
		try {
			System.out.println(iWriteService.save(newWrite));
			if (iWriteService.save(newWrite)) {
				request.getSession(true).setAttribute("otk1", "ok");
				response.sendRedirect("frontController?command=go_to_do_write_page");
				
			}
			
		
		} catch (SQLException e) {
			
		
	} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
