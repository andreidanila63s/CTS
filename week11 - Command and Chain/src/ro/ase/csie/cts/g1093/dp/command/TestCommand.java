package ro.ase.csie.cts.g1093.dp.command;

public class TestCommand {

	public static void main(String[] args) {
		
		TaskManager manager = new TaskManager("background tasks");
		
		manager.addSyncTask(new AsyncTask(new AutoSaveModule(5), "", 0));
		manager.addSyncTask(new AsyncTask(new UpdateModule(), "", 0));
		
	}

}
