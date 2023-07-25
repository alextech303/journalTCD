package daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.List;

import beans.Write;


import dao.IWriteDao;
import daoPoolConnection.ConnectionPool;
import daoPoolConnection.ConnectionPoolException;

public class WriteDaoImpl implements IWriteDao{

	@Override
	public List<Write> getListWrite() {
		// TODO Auto-generated method stub
		return null;
	}
	
	//private LocalDate date;
	@Override
	public boolean addWrite(Write write) throws SQLException {
		boolean addWrite = true;
		try (Connection connect = ConnectionPool.getInstance().takeConnection()) {
System.out.println("class WriteDaoImpl.addWrite");
			String sql = "INSERT INTO 23279_2012(name,size_cell_1,size_cell_2,diameter,date) VALUES(?,?,?,?,?)";
			PreparedStatement ps = connect.prepareStatement(sql);

			ps.setString(1, write.getName());
			ps.setString(2, write.getSize_cell_1());
			ps.setString(3, write.getSize_cell_2());
			ps.setString(4, write.getDiameter());
			ps.setString(5, write.getDate());
			
			ps.executeUpdate();

		} catch (ConnectionPoolException e) {
			addWrite = false;
			e.printStackTrace();

		}
		return addWrite;
		
	}

}
