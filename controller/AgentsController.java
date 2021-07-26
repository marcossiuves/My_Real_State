package controller;

import models.Agent;

public class AgentsController{


	Agent a1 = new Agent();
		
	
	public void registerAgent(String name, int timeService) {
		
		a1.setAgentName(name);
		a1.setTimeService(null);
	
	}
	
	public void showAgent(String name) {
		a1.getAgentName();
		a1.getTimeService();
		
	}
	
	
}
