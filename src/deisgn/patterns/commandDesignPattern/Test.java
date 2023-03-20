package deisgn.patterns.commandDesignPattern;

public class Test {
public static void main(String[] args) {
	Room livingRoom=new Room();
	Light light=new Light();
	SwitchLightsCommand switchLightsCommand=new SwitchLightsCommand(light);
	livingRoom.setCommand(switchLightsCommand);
	livingRoom.executeCommand();
}

}
