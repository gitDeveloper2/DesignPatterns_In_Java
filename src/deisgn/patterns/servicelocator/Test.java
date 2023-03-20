package deisgn.patterns.servicelocator;

public class Test {
public static void main(String[] args) {
	ServiceLocator.getService("service1").execute();
	ServiceLocator.getService("service1").execute();
}
}
