package ro.ase.csie.cts.g1093.dp.singleton.staticversion;

public class RESTBackend {

	String url;
	String data;
	
	public static final RESTBackend theBackend;
	
	static {
	  System.out.println("is executed when is loaded");
	  theBackend = new RESTBackend();
	  theBackend.url="www.acs.ase.ro/cts";
	  
	}
	private RESTBackend() {
		
	}

}
