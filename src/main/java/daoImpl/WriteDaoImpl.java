package daoImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import beans.Write;
import dao.IWriteDao;
import daoPoolConnection.ConnectionPool;
import daoPoolConnection.ConnectionPoolException;

public class WriteDaoImpl implements IWriteDao{

	@Override
	public List<Write> getListWrite5() {
		
		List<Write> listOfWrite5 = new ArrayList<Write>();
		Statement st = null;
		ResultSet rs = null;

		try (Connection connect = ConnectionPool.getInstance().takeConnection()) {

			st = connect.createStatement();
			rs = st.executeQuery("SELECT * FROM journey");

			while (rs.next()) {
				
				
				int id = rs.getInt(1);
				String name = rs.getString(2);
				String size_cell_1 = rs.getString(3);
				String size_cell_2 = rs.getString(4);
				String diameter = rs.getString(5);
				String date = rs.getString(6);

				listOfWrite5.add(new Write(id,name, size_cell_1, size_cell_2, diameter, date));

			}

		} catch (Exception e) {
			
			e.printStackTrace();
		}

		return listOfWrite5;
		
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
