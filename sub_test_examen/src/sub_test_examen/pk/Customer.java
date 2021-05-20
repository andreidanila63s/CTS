package sub_test_examen.pk;

public class Customer {

	
	private String name;
	private String adress;
	private int counter;
	
	private static Customer instance = null;
	
	private Customer(String name, String adress, int counter) {
		super();
		this.name = name;
		this.adress = adress;
		this.counter = counter;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}
	
	public static Customer getInstace(String name, String adress, int counter) {
		
		if(instance == null) {
			instance = new Customer( name,  adress,  counter);
		}
		
		return instance;
	}
	
}
