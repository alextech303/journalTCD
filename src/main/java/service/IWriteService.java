package service;

import java.sql.SQLException;
import java.util.List;

import beans.Write;



public interface IWriteService {
	
	boolean save(Write write) throws SQLException, ServiceException;
	List<Write> getListWrite() throws SQLException;
	
}
