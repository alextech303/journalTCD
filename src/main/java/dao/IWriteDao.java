package dao;

import java.sql.SQLException;
import java.util.List;

import beans.Write;
import beans.WriteS500;

public interface IWriteDao {
	
	List<Write> getListWrite() throws SQLException;  
	
	List<WriteS500> getListWriteS500() throws SQLException;
	

	boolean addWrite(Write write) throws SQLException;
	
	boolean addWriteS500(WriteS500 writeS500) throws SQLException;
	


}
