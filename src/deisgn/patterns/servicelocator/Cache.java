package deisgn.patterns.servicelocator;

import java.util.ArrayList;
import java.util.List;

public class Cache {
InitialContext initialContext=new InitialContext();
private List<Services> services;
public Cache() {
	this.services = new ArrayList<>();
}
public Services getService (String serviceName) {
	for(Services service:services) {
		
		if(service.getName().equalsIgnoreCase(serviceName)) {
			System.out.println("returning cached service");
			
			return service;
		}
	}
	System.out.println("creating new service");
	return null;
}

public void addService(Services service) {
	boolean exists=false;
	for(Services currentService:services) {
		if(currentService.getName().equalsIgnoreCase(service.getName())) {
			exists=true;
		}
	}
	if(!exists) {
	this.services.add(service);
	}
}

}
