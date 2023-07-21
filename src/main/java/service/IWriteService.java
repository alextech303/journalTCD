package service;

import java.sql.SQLException;

import beans.Write;



public interface IWriteService {
	
	boolean save(Write write) throws SQLException, ServiceException;
}
