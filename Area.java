public class Area {
	
	public String title = "CHAMBER OF TORTURE";
	public String description = "Ancient stone walls, dim light, unnerving echoes; but most strikingly, every facet of a medieval torture chamber surrounds you. The monstrous devices, with their gruesome residual ichor of torture sessions past, seem too nightmaresome to be real. Whatever sadist runs -- or ran -- this decrepit dungeon must have been colder than ice.";
	
	public ObjectSet theObjects;
	public CommandSet theCommands;
	
	public Area() {
	    theObjects = new ObjectSet();
	    theCommands = new CommandSet();
	}
	
	public void addObject(Object object) {
		theObjects.add(object);
	}
	
	public void addCommand(Command command) {
		theCommands.add(command);
	}
	
	
}