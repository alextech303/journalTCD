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
import beans.WriteS500;
import dao.IWriteDao;
import daoPoolConnection.ConnectionPool;
import daoPoolConnection.ConnectionPoolException;

public class WriteDaoImpl implements IWriteDao{

	@Override
	public List<Write> getListWrite() {
		
		List<Write> listOfWrite = new ArrayList<Write>();
		Statement st = null ;
		ResultSet rs ;

		try (Connection connect = ConnectionPool.getInstance().takeConnection()) {
			st=connect.createStatement();
			rs = st.executeQuery("SELECT * FROM 23279_2012");

			while (rs.next()) {
				
				
				int id = rs.getInt(1);
				String date = rs.getString(2);
				String name = rs.getString(3);
				String butch_number = rs.getString(4);
				String nominal_diameter=rs.getString(5);
				String size_cell_1 = rs.getString(6);
				String size_cell_2 = rs.getString(7);
				String sediment = rs.getString(8);
				String card_size = rs.getString(9);
				String cross_releases = rs.getString(10);
				String longitudinal_releases = rs.getString(11);
				String straightforwardness = rs.getString(12);
				String diagonal = rs.getString(13);
				String impact = rs.getString(14);
				int wire_idwire=rs.getInt(15);
				String note = rs.getString(16);

				listOfWrite.add(new Write(id,date,name,butch_number,nominal_diameter, size_cell_1, size_cell_2,
						sediment, card_size,cross_releases,longitudinal_releases,straightforwardness,diagonal,impact,wire_idwire,note));

			}

		} catch (Exception e) {
			
			e.printStackTrace();
		}

		return listOfWrite;
		
	}
	
	@Override
	public List<WriteS500> getListWriteS500() {
		
		List<WriteS500> listOfWriteS500 = new ArrayList<WriteS500>();
		Statement st = null ;
		ResultSet rs ;

		try (Connection connect = ConnectionPool.getInstance().takeConnection()) {
			st=connect.createStatement();
			rs = st.executeQuery("SELECT * FROM wire");

			while (rs.next()) {
				
				
				int id = rs.getInt(1);
				String date = rs.getString(2);
				String name = rs.getString(3);
				String butch_number = rs.getString(4);
				String nominal_diameter=rs.getString(5);
				String nominal_square = rs.getString(6);
				String linear_mass = rs.getString(7);
				String ovality = rs.getString(8);
				String carbon_equivalent = rs.getString(9);
				String ultimate_strength = rs.getString(10);
				String yield_strength = rs.getString(11);
				String relation_of_ultStr_to_yieldStr = rs.getString(12);
				String relative_elongation = rs.getString(13);
				String height_of_transverse_ribs = rs.getString(14);
				String rib_thickness = rs.getString(15);
				String edge_pitch = rs.getString(16);
				String note = rs.getString(17);
				
				
				
				listOfWriteS500.add(new WriteS500(id,date,name,butch_number,nominal_diameter, nominal_square, linear_mass,
						ovality, carbon_equivalent,ultimate_strength,yield_strength,relation_of_ultStr_to_yieldStr,relative_elongation,height_of_transverse_ribs,rib_thickness,edge_pitch,note));

			}

		} catch (Exception e) {
			
			e.printStackTrace();
		}

		return listOfWriteS500;
		
	}
	
	@Override
	public boolean addWrite(Write write) throws SQLException {
		boolean addWrite = true;
		try (Connection connect = ConnectionPool.getInstance().takeConnection()) {

			String sql = "INSERT INTO 23279_2012(date,name,butch_number,nominal_diameter, size_cell_1, size_cell_2,sediment, card_size,cross_releases,longitudinal_releases,straightforwardness,diagonal,impact,wire_idwire,note) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps = connect.prepareStatement(sql);

			ps.setString(1, write.getDate());
			ps.setString(2, write.getName());
			ps.setString(3, write.getButch_number());
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
			ps.setInt(14, write.getWire_idwire());
			ps.setString(15, write.getNote());
			
			ps.executeUpdate();

		} catch (ConnectionPoolException e) {
			
			addWrite = false;
			e.printStackTrace();

		}
		return addWrite;
		
	}
	@Override
	public boolean addWriteS500(WriteS500 writeS500) throws SQLException {
		boolean addWriteS500 = true;
		try (Connection connect = ConnectionPool.getInstance().takeConnection()) {

			String sql = "INSERT INTO wire(date,name,butch_number,nominal_diameter, nominal_square, linear_mass,ovality, carbon_equivalent,ultimate_strength,yield_strength,relation_of_ultStr_to_yieldStr,relative_elongation,height_of_transverse_ribs,rib_thickness,edge_pitch,note) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
			PreparedStatement ps = connect.prepareStatement(sql);

			ps.setString(1, writeS500.getDate());
			ps.setString(2, writeS500.getName());
			ps.setString(3, writeS500.getButch_number());
			ps.setString(4, writeS500.getNominal_diameter());
			ps.setString(5, writeS500.getNominal_square());
			ps.setString(6, writeS500.getLinear_mass());
			ps.setString(7, writeS500.getOvality());
			ps.setString(8, writeS500.getCarbon_equivalent());
			ps.setString(9, writeS500.getUltimate_strength());
			ps.setString(10, writeS500.getYield_strength());
			ps.setString(11, writeS500.getRelation_of_ultStr_to_yieldStr());
			ps.setString(12, writeS500.getRelative_elongation());
			ps.setString(13, writeS500.getHeight_of_transverse_ribs());
			ps.setString(14, writeS500.getRib_thickness());
			ps.setString(15, writeS500.getEdge_pitch());
			ps.setString(16, writeS500.getNote());
			
			
			ps.executeUpdate();

		} catch (ConnectionPoolException e) {
			addWriteS500 = false;
			e.printStackTrace();

		}
		return addWriteS500;
		
	}

}
