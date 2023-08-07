package serviceImpl;

import java.sql.SQLException;
import java.util.List;

import beans.Write;

import dao.DaoProvider;
import dao.IWriteDao;
import service.IWriteService;
import service.ServiceException;
public class WriteServiceImpl implements IWriteService{
	
	private final IWriteDao iwriteServiceDao = DaoProvider.getInstance().getWriteDAO();

	@Override
	public boolean save(Write write) throws SQLException, ServiceException {
		boolean saveWrite = true;
		System.out.println(" WriteServiceImpl : boolean addWrite = true;"); 
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
}
