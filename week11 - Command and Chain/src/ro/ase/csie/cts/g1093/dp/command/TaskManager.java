package ro.ase.csie.cts.g1093.dp.command;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
	
	List<AsyncTaskInterface> tasks = new ArrayList<>();
	String name;
	public TaskManager(String name) {
		super();
		this.name = name;
	}
	
public TaskManager(String name) {
	super();
	this.name=name;
	
}
public void addSyncTask(AsyncTaskInterface task) {
	this.tasks.add(task);
	
}

public void doNextTask() {
	//determine the task with the bigest priority 
	//...
	
	if(tasks.size()>0) {
		AsyncTaskInterface task = tasks.get(0);
		task.startTask();
		tasks.remove(0);
	}
}
}
