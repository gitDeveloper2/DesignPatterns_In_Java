package deisgn.patterns.servicelocator;

public class InitialContext {
public Services lookup(String jndiName) {
	if(jndiName.equalsIgnoreCase("Service1")) {
		return new Service1();
	}else if(jndiName.equalsIgnoreCase("Service2")) {
		return new Service2();
	}
	return null;
}
}
