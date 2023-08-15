package service;

import java.sql.SQLException;
import java.util.List;

import beans.Write;
import beans.WriteS500;



public interface IWriteService {
	
	boolean save(Write write) throws SQLException, ServiceException;
	List<Write> getListWrite() throws SQLException;
	boolean save(WriteS500 writeS500) throws SQLException, ServiceException;
	
}
