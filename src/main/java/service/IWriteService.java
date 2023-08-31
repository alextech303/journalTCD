package service;

import java.sql.SQLException;
import java.util.List;

import beans.Write;
import beans.WriteS500;
import beans.WriteS500_2;



public interface IWriteService {
	
	boolean save(Write write) throws SQLException, ServiceException;
	List<Write> getListWrite() throws SQLException;
	boolean save(WriteS500 writeS500) throws SQLException, ServiceException;
	List<WriteS500> getListWriteS500() throws SQLException;
	List<WriteS500_2> getListWriteS500_2() throws SQLException;
	
}
