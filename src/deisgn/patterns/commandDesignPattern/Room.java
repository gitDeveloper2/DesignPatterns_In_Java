package deisgn.patterns.commandDesignPattern;

public class Room {
private Command command;



public Command getCommand() {
	return command;
}

public void setCommand(Command command) {
	this.command = command;
}



public void executeCommand() {
	this.command.execute();
}
}
