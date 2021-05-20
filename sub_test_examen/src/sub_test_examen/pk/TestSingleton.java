package sub_test_examen.pk;

public class TestSingleton {

	public static void main(String[] args) {

		
		Customer customer1 = Customer.getInstace("george", "bft", 1);
		Customer customer2 = Customer.getInstace("gge", "buc", 2);
		
		System.out.println(customer1.getName());
		System.out.println(customer2.getName());
	}

}
