package deisgn.patterns.servicelocator;

public class ServiceLocator {
private static Cache cache;
static {
	cache=new Cache();
}
public static Services getService(String jndiName) {
	Services service=cache.getService(jndiName);
	if(service!=null) {
		return service;
	}else {
		InitialContext initialContext=new InitialContext();
		Services createdservice=initialContext.lookup(jndiName);
		cache.addService(createdservice);
		return createdservice;
	}
}
}
