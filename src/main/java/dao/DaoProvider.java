package dao;

import daoImpl.WriteDaoImpl;

public final class DaoProvider {
	
	private static final DaoProvider instance = new DaoProvider();
	
	private final IWriteDao writeDAO = new WriteDaoImpl();
	
	private DaoProvider() {
		
	}

	public static DaoProvider getInstance() {
		return instance;
	}

	public IWriteDao getWriteDAO() {
		return writeDAO;
	}
	
	
	
	
	
	
}
