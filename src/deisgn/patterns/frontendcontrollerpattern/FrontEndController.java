package deisgn.patterns.frontendcontrollerpattern;

public class FrontEndController {
Dispatcher dispatcher;

public Dispatcher getDispatcher() {
	return dispatcher;
}

public void setDispatcher(Dispatcher dispatcher) {
	this.dispatcher = dispatcher;
}

public FrontEndController() {
	this.dispatcher = new Dispatcher();
}

public void authenticate() {
	System.out.println("Authenticated");
}
public boolean authorize() {
	System.out.println("Authorized");
	return true;
}
public void dispathRequest(String request) {
	authenticate();
	boolean result=authorize();
	if(result) {
		dispatcher.dispatch(request);
	}
	
}

}
