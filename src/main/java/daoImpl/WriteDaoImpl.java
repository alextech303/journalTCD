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

			String sql = "INSERT INTO 23279_2012(name,size_cell_1,size_cell_2,diameteruser) VALUES(?,?,?,?)";
			PreparedStatement ps = connect.prepareStatement(sql);

			ps.setString(1, write.getName());
			ps.setDouble(2, write.getSize_cell_1());
			ps.setDouble(3, write.getSize_cell_2());
			ps.setDouble(4, write.getDiameter());
		//	ps.setDa
			
			ps.executeUpdate();

		} catch (ConnectionPoolException e) {
		
			e.printStackTrace();

		}
		return addWrite;
		
	}

}
