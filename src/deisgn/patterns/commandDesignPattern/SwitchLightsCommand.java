package deisgn.patterns.commandDesignPattern;

public class SwitchLightsCommand implements Command{
private Light light;

	public SwitchLightsCommand(Light light) {
	this.light=light;
}

	@Override
	public void execute() {
		
		this.light.switchLights();
		System.out.println("lights on");
	}

}
