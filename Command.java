import java.util.HashSet;
import java.util.Set;

public class Command {
	public String title = "look";
	public Set<String> altTitles;
	public String description = "Ancient stone walls, dim light, unnerving echoes; but most strikingly, every facet of a medieval torture chamber surrounds you. The monstrous devices, with their gruesome residual ichor of torture sessions past, seem too nightmaresome to be real. Whatever sadist runs -- or ran -- this decrepit dungeon must have been colder than ice.";
	
	public Command() {
		altTitles = new HashSet<String>();
		altTitles.add("check");
		altTitles.add("examine");
		altTitles.add("peruse");
		altTitles.add("analyse");
		altTitles.add("ascertain");
		altTitles.add("construe");
		altTitles.add("interpret");
		altTitles.add("fathom");
		altTitles.add("acknowledge");
	}
}