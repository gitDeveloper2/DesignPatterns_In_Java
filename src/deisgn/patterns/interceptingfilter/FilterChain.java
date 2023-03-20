package deisgn.patterns.interceptingfilter;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {
	private List<Filter> filters;
	private Target target;
	public FilterChain() {
		this.filters = new ArrayList<>();
	}
	public void addFilter(Filter filter) {
		this.filters.add(filter);
	}
	public void setTarget(Target target) {
		this.target=target;
	}
	public void execute(String request) {
		for(Filter filter:this.filters) {
			filter.execute(request);
		}
		this.target.execute(request);
	}
	
	


}
