import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class ToDoList {
public HashMap<String, Task> tasks = new HashMap<String, Task>();

	public void addTask (Task task) {
		tasks.put(task.getDescription(), task);
	}
	public void completeTask(String description) {
		tasks.get(description).setComplete(true);		
	}
	public boolean getStatus(String description) {
		//Add code here
		return tasks.get(description).isComplete();
	}
	public Task getTask(String description) {
		// Add code here
		return tasks.get(description);
	}
	public Task removeTask(String description) {
		// Add code here
		return tasks.remove(description);
	}
	public Collection<Task> getAllTasks() {
		return tasks.values();

	}
	public Collection<Task> getCompletedTasks() {
		// Add code here
		Collection<Task> CT = new ArrayList();
		for (String key : tasks.keySet()) {
			if (tasks.get(key).isComplete()) {
				CT.add(tasks.get(key));
			}
		}
		return CT;
	}
	public static void main(String[] args) {
		System.out.println("111");
	}
}
