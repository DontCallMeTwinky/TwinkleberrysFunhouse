import java.util.Set;

public class CommandSet {
	
	public Set<Command> commands;
	
	public CommandSet() {
		
	}
	
	public Set<Command> getCommands() {
		return commands;
	}
	
	public void setCommands(Set<Command> commands) {
		this.commands = commands;
	}
	
	public void add(Command command) {
		commands.add(command);
	}
}