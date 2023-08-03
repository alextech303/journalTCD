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
	public List<Write> getListWrite() {
		
		List<Write> listOfWrite = new ArrayList<Write>();
		Statement st = null;
		ResultSet rs = null;

		try (Connection connect = ConnectionPool.getInstance().takeConnection()) {
			
			rs = st.executeQuery("SELECT * FROM 23279_2012");

			while (rs.next()) {
				
				
				int id = rs.getInt(1);
				String date = rs.getString(2);
				String name = rs.getString(3);
				String batch_number = rs.getString(4);
				String nominal_diameter=rs.getString(5);
				String size_cell_1 = rs.getString(6);
				String size_cell_2 = rs.getString(7);
				String sediment = rs.getString(8);
				String card_size = rs.getString(9);
				String cross_releases = rs.getString(10);
				String longitudinal_releases = rs.getString(11);
				String Straightforwardness = rs.getString(12);
				String diagonal = rs.getString(13);
				String impact = rs.getString(14);
				String note = rs.getString(15);

				listOfWrite.add(new Write(id,date,name,batch_number,nominal_diameter, size_cell_1, size_cell_2,
						sediment, card_size,cross_releases,longitudinal_releases,Straightforwardness,diagonal,impact,note));

			}

		} catch (Exception e) {
			
			e.printStackTrace();
		}

		return listOfWrite;
		
	}
	
	
	@Override
	public boolean addWrite(Write write) throws SQLException {
		boolean addWrite = true;
		try (Connection connect = ConnectionPool.getInstance().takeConnection()) {

			String sql = "INSERT INTO 23279_2012(date,name,batch_number,nominal_diameter, size_cell_1, size_cell_2,\r\n"
					+ "						sediment, card_size,cross_releases,longitudinal_releases,Straightforwardness,diagonal,impact,note) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps = connect.prepareStatement(sql);

			ps.setString(1, write.getDate());
			ps.setString(2, write.getName());
			ps.setString(3, write.getBatch_number());
			ps.setString(4, write.getNominal_diameter());
			ps.setString(5, write.getSize_cell_1());
			ps.setString(6, write.getSize_cell_2());
			ps.setString(7, write.getSediment());
			ps.setString(8, write.getCard_size());
			ps.setString(9, write.getCross_releases());
			ps.setString(10, write.getLongitudinal_releases());
			ps.setString(11, write.getStraightforwardness());
			ps.setString(12, write.getDiagonal());
			ps.setString(13, write.getImpact());
			ps.setString(14, write.getNote());
						
			ps.executeUpdate();

		} catch (ConnectionPoolException e) {
			addWrite = false;
			e.printStackTrace();

		}
		return addWrite;
		
	}

}
