package service;


import serviceImpl.WriteServiceImpl;

public final class ServiceProvider {

	private static ServiceProvider instance = new ServiceProvider();
	private final IWriteService iWriteService = new WriteServiceImpl();
	
	private ServiceProvider() {
		
	}
	
	
	public static ServiceProvider getInstance() {
		return instance;
	}


	public IWriteService getiWriteService() {
		return iWriteService;
	}




	




	
	
	
}
