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
	private static final String JSP_NOMINAL_DIAMETER_PARAM = "nominal_diameter";
	private static final String JSP_DATE_PARAM = "date";
	private static final String JSP_SEDIMENT_PARAM = "sediment";
	private static final String JSP_CARD_SIZE_PARAM = "card_size";
	private static final String JSP_BUTCH_NUMBER_PARAM = "butch_number";
	private static final String JSP_LONGITUDINAL_RELEASES_PARAM = "longitudinal_releases";
	private static final String JSP_CROSS_RELEASES_PARAM = "cross_releases";
	private static final String JSP_STRAIGHTFORWARDNESS_PARAM = "straightforwardness";
	private static final String JSP_DIAGONAL_PARAM = "diagonal";
	private static final String JSP_IMPACT_PARAM = "impact";
	private static final String JSP_WIRE_IDWIRE = "wire_idwire";
	private static final String JSP_NOTE_PARAM = "note";

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		Write newWrite;
		 String date;
		 String name;

		 String butch_number;
		 String nominal_diameter;
		
		 String size_cell_1;
		 String size_cell_2;
		
		 String sediment;
		 String card_size;
		 String cross_releases;
		 String longitudinal_releases;
		 String straightforwardness;
		 String diagonal;
		 String impact;
		 int wire_idwire;
		 String note;
		 
		date = request.getParameter(JSP_DATE_PARAM);
		name = request.getParameter(JSP_NAME_PARAM);
		butch_number = request.getParameter(JSP_BUTCH_NUMBER_PARAM);
		nominal_diameter = request.getParameter(JSP_NOMINAL_DIAMETER_PARAM);
		size_cell_1 = request.getParameter(JSP_SIZE_CELL_1);
		size_cell_2 = request.getParameter(JSP_SIZE_CELL_2);
		sediment=  request.getParameter(JSP_SEDIMENT_PARAM);
        card_size= request.getParameter(JSP_CARD_SIZE_PARAM);
        cross_releases= request.getParameter(JSP_CROSS_RELEASES_PARAM);
        longitudinal_releases= request.getParameter(JSP_LONGITUDINAL_RELEASES_PARAM);
        straightforwardness= request.getParameter(JSP_STRAIGHTFORWARDNESS_PARAM);
        diagonal= request.getParameter(JSP_DIAGONAL_PARAM);
        impact= request.getParameter(JSP_IMPACT_PARAM);
        wire_idwire = Integer.parseInt(request.getParameter(JSP_WIRE_IDWIRE));
        note= request.getParameter(JSP_NOTE_PARAM);
        
        newWrite = new Write(date,name,butch_number,nominal_diameter,size_cell_1,size_cell_2,sediment,card_size,cross_releases,
        		longitudinal_releases,straightforwardness,diagonal,impact,wire_idwire,note);
		try {
			
			if (iWriteService.save(newWrite)) {
				request.getSession(true).setAttribute("otk1", "ok");
				request.getSession(true).setAttribute("otk2", "ok");
				response.sendRedirect("frontController?command=go_to_do_write_page");
				
			}else System.out.println("iWriteService.save(newWrite) == false");
			
		
		} catch (SQLException | ServiceException e) {
			
			e.printStackTrace();
		}
	}
}
