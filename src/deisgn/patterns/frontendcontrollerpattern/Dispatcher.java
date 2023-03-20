package deisgn.patterns.frontendcontrollerpattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Dispatcher {
private Map<String,View> views;


public Dispatcher() {
	
	this.views = new HashMap<>();
}
public void dispatch(String viewName) {
	View view;
	if((view=views.get(viewName))!=null) {
		view.show();
	}
}
public void addView(String viewName,View view) {
	this.views.put(viewName,view);
}
public void removeView(View view) {
	this.views.remove(view);
}

}
