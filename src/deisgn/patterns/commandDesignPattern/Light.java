package deisgn.patterns.commandDesignPattern;

public class Light {
private boolean switchedOn;

public boolean isSwitchedOn() {
	return switchedOn;
}


public void switchLights() {
	switchedOn=!switchedOn;
	
}


}
