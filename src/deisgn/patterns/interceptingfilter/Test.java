package deisgn.patterns.interceptingfilter;

public class Test {
public static void main(String[] args) {
	Client client=new Client();
	Target target=new Target();
	FilterManager filterManager=new FilterManager(target);
	filterManager.setFilter(new AuthenticationFilter());
	filterManager.setFilter(new DebugFilter());
	client.setFilterManager(filterManager);
	client.sendRequest("HOME");
}
}
