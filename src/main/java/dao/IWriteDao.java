package dao;

import java.sql.SQLException;
import java.util.List;

import beans.Write;

public interface IWriteDao {
	
	List<Write> getListWrite5() throws SQLException;  

	boolean addWrite(Write write) throws SQLException;


}
