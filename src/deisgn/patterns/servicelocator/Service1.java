package deisgn.patterns.servicelocator;

public class Service1 implements Services{

	@Override
	public void execute() {
		System.out.println("Service 1 executing");
		
	}

	@Override
	public String getName() {
	return "Service1";
	}

}
