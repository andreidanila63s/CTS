package ro.ase.csie.cts.g1093.dp.singleton;

public class RESTBackend {
	String url;
	String data;
	//eager-instan
	//public static RESTBackend theBackend = new RESTBackend();
	public static RESTBackend theBackend = null;
	
	
	private RESTBackend(String url, String data) {
		System.out.println("opening a connection to the backend service");
		this.url = url;
		this.data = data;
	}
	
	private RESTBackend() {
		
	}
	
	public void sendGET() {
		System.out.println("send get command to" + this.url);
	}
	// lazy - instantiation example
	public static synchronized RESTBackend getRESTBackend() {
		if(theBackend == null) {
			// get the backend data from a config/settings file
			String url = "www.ase.acs.ro/game";
			String data = "get backend connection";
			theBackend = new RESTBackend (url,data);
					
		}
		return theBackend;
	}

}
