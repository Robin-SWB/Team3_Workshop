import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;

class ToDoListTest extends TestCase {

	// Define Test Fixtures

	
	public ToDoListTest() {
		super();
	}
	private ToDoList TDL = new ToDoList();
	@Before
	 public void setUp() throws Exception{
		//Initialise Test Fixtures
	}
	@After
	 public void tearDown() throws Exception{
		// Uninitialise test Fixtures
	}

	@Test
	public void testAddTask() {
		assertTrue("Initial tasks state", TDL.tasks.isEmpty());
		Task t1 = new Task("t1", false);
		TDL.addTask(t1);
		assertFalse("After adding one task", TDL.tasks.isEmpty());
//		fail("Not implemented yet");
	}
	
	@Test
	public void testgetStatus() {
		Task t1 = new Task("t1", false);
		TDL.addTask(t1);
		assertFalse("Initial task status",TDL.getStatus("t1"));
	}
	
	@Test
	public void testCompleteTask() {
		Task t1 = new Task("t1", false);
		TDL.addTask(t1);
		TDL.completeTask("t1");
		assertTrue("After completing t1",TDL.getStatus("t1"));
	}
	
	
	@Test
	public void testGetTask() {
		Task t1 = new Task("t1", false);
		TDL.addTask(t1);
		Task retrieved_task = TDL.getTask("t1");
		assertTrue("Retrived task", retrieved_task.getDescription().equals("t1"));
	}
	
	@Test
	public void testRemoveTask() {
		Task t1 = new Task("t1", false);
		TDL.addTask(t1);
		TDL.removeTask("t1");
		assertTrue("Removed t1", TDL.tasks.isEmpty());
		Task t = TDL.removeTask("t2");
		assertTrue("Cannot remove task that does not exist in the list",t==null);
	}
	@Test
	public void testGetCompletedTasks() {
		Task t1 = new Task("t1",true);
		Task t2 = new Task("t2",false);
		Task t3 = new Task("t3",true);
		Task t4 = new Task("t4",false);
		TDL.addTask(t1);
		TDL.addTask(t2);
		TDL.addTask(t3);
		TDL.addTask(t4);
		Collection<Task> c = new ArrayList<Task>();
		c.add(t1);
		c.add(t3);
		assertTrue("Test complete tasks",c.equals(TDL.getCompletedTasks()));
	}

}
