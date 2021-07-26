package controller;

import models.Client;

public class ClientsController {

	Client c1 = new Client();

	public void registerClient(String clientName, String user, String clientPassword) {
		
		c1.setClientName(clientName);
		c1.setUser(user);
		c1.setClientPassword(clientPassword);
		
	}

	public void showClient(String name) {

		c1.getClientPassword();
		
	}
	
	public void clientLogin(String user, String password) throws Exception {
		
		if(c1.getUser().equals(user)&&c1.getClientPassword().equals(password)) {
			
			System.out.println("LOGADO");
			
		} else {
			
			throw new Exception("Erro login");
			
		}
		
	}
}