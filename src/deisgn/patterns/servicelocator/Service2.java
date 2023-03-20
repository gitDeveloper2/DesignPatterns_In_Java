package deisgn.patterns.servicelocator;

public class Service2 implements Services{

	@Override
	public void execute() {
		System.out.println("Service 2 executing");
		
	}

	@Override
	public String getName() {
		return "Service2";
	}

}
