import java.util.Set;

public class ObjectSet {
	
	public Set<Object> objects;
	
	public ObjectSet() {
		
	}
	
	public Set<Object> getObjects() {
		return objects;
	}
	
	public void setObjects(Set<Object> objects) {
		this.objects = objects;
	}
	
	public void add(Object command) {
		objects.add(command);
	}
}