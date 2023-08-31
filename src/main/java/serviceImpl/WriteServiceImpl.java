package serviceImpl;

import java.sql.SQLException;
import java.util.List;

import beans.Write;
import beans.WriteS500;
import beans.WriteS500_2;
import dao.DaoProvider;
import dao.IWriteDao;
import service.IWriteService;
import service.ServiceException;
public class WriteServiceImpl implements IWriteService{
	
	private final IWriteDao iwriteServiceDao = DaoProvider.getInstance().getWriteDAO();

	@Override
	public boolean save(Write write) throws SQLException, ServiceException {
		boolean saveWrite = true;
		try {
		if(iwriteServiceDao.addWrite(write)) {
			saveWrite = true;
			
		} else {
			throw new ServiceException("Write don't save in BD");
		}
		} catch (SQLException e) {
			
			throw new SQLException(e);
	}
		
		return saveWrite;

}

	
	
	@Override
	public List<Write> getListWrite() throws SQLException   {
			
		
			return iwriteServiceDao.getListWrite() ;
		
				
	}



	@Override
	public boolean save(WriteS500 writeS500) throws SQLException, ServiceException {
		boolean saveWrite = true;
		try {
		if(iwriteServiceDao.addWriteS500(writeS500)) {
			saveWrite = true;
			
		} else {
			throw new ServiceException("Write don't save in BD");
		}
		} catch (SQLException e) {
			
			throw new SQLException(e);
	}
		
		return saveWrite;

}



	@Override
	public List<WriteS500> getListWriteS500() throws SQLException {
		return iwriteServiceDao.getListWriteS500() ;
	}



	@Override
	public List<WriteS500_2> getListWriteS500_2() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}
}
