package controllerImpl;

import java.io.IOException;
import java.sql.SQLException;

import beans.Write;
import beans.WriteS500;
import controllers.Command;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import service.IWriteService;
import service.ServiceException;
import service.ServiceProvider;

public class DoWriteS500 implements Command {
	
private final IWriteService iWriteService = ServiceProvider.getInstance().getiWriteService();
	

    private static final String JSP_DATE_PARAM = "date";
	private static final String JSP_NAME_PARAM = "name";
	private static final String JSP_BUTCH_NUMBER_PARAM = "butch_number";
	private static final String JSP_NOMINAL_DIAMETER_PARAM = "nominal_diameter";
	private static final String JSP_NOMINAL_SQUARE = "nominal_square";
	private static final String JSP_LINEAR_MASS = "linear_mass";
	private static final String JSP_OVALITY = "ovality";
	private static final String JSP_CARBON_EQUIVALENT = "carbon_equivalent";
	private static final String JSP_ULTIMATE_STRENGHTH = "ultimate_strength";
	private static final String JSP_YIELD_STRENGHTH = "yield_strength";
	private static final String JSP_RELATION_OF_ULT = "relation_of_ultStr_to_yieldStr";
	private static final String JSP_RELATIVE_ELONGATION = "relative_elongation";
	private static final String JSP_HEIGHT_OF_TRANSVERSE_RIBS = "height_of_transverse_ribs";
	private static final String JSP_RIB_THICKNESS = "rib_thickness";
	private static final String JSP_EDGE_PITCH = "edge_pitch";
	private static final String JSP_NOTE_PARAM = "note";
	
	
	

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		 WriteS500 newWriteS500;
		
		 String date;
		 String name;
		 String butch_number;
		 String nominal_diameter;
		 String nominal_square;
		 String linear_mass;
		 String ovality;
		 String carbon_equivalent;
		 String ultimate_strength;
		 String yield_strength;
		 String relation_of_ultStr_to_yieldStr;
		 String relative_elongation;
		 String height_of_transverse_ribs;
		 String rib_thickness;
		 String edge_pitch;
		 String note;
		 
		date = request.getParameter(JSP_DATE_PARAM);
		name = request.getParameter(JSP_NAME_PARAM);
		butch_number = request.getParameter(JSP_BUTCH_NUMBER_PARAM);
		nominal_diameter = request.getParameter(JSP_NOMINAL_DIAMETER_PARAM);
		nominal_square = request.getParameter(JSP_NOMINAL_SQUARE);
		linear_mass = request.getParameter(JSP_LINEAR_MASS);
		ovality = request.getParameter(JSP_OVALITY);
		carbon_equivalent = request.getParameter(JSP_CARBON_EQUIVALENT);
		ultimate_strength = request.getParameter(JSP_ULTIMATE_STRENGHTH);
		yield_strength=request.getParameter(JSP_YIELD_STRENGHTH);
		relation_of_ultStr_to_yieldStr=request.getParameter(JSP_RELATION_OF_ULT);
		relative_elongation=request.getParameter(JSP_RELATIVE_ELONGATION);
		height_of_transverse_ribs=request.getParameter(JSP_HEIGHT_OF_TRANSVERSE_RIBS);
		rib_thickness=request.getParameter(JSP_RIB_THICKNESS);
		edge_pitch=request.getParameter(JSP_EDGE_PITCH);
		note= request.getParameter(JSP_NOTE_PARAM);
		
        newWriteS500 = new WriteS500(date,name,butch_number,nominal_diameter,nominal_square,linear_mass,ovality,carbon_equivalent,ultimate_strength, yield_strength,relation_of_ultStr_to_yieldStr,relative_elongation,height_of_transverse_ribs,rib_thickness,edge_pitch,note);
		try {
			
			if (iWriteService.save(newWriteS500)) {
				//request.getSession(true).setAttribute("otk1", "ok");
				//request.getSession(true).setAttribute("otk2", "ok");
				response.sendRedirect("frontController?command=go_to_do_write_page");
				
			}//else System.out.println("iWriteService.save(newWrite) == false");
			
		
		} catch (SQLException | ServiceException e) {
			
			e.printStackTrace();
		}
	}

}
