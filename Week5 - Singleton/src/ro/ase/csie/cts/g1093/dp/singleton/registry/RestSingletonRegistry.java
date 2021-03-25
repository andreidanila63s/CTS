package ro.ase.csie.cts.g1093.dp.singleton.registry;

public class RestSingletonRegistry {

	public static void main(String[] args) {
		
		
		RESTBackend backend1 = RESTBackend.getRESTBackend("10.0.0.1", "profile");
		RESTBackend backend2 = RESTBackend.getRESTBackend("10.0.0.1", "profile");
		 if(backend1 == backend2) {
			 System.out.println("they point to the same obj");
			 
		 }
		 else
		 {System.out.println("they are different");
	}
		 
		 RESTBackend backend3 = RESTBackend.getRESTBackend("127.0.0.1", "profile");
		 if(backend1 == backend3) {
			 System.out.println("they point to the same obj");
			 
		 }else
		 {
			 System.out.println("they are different");
		 }

}
