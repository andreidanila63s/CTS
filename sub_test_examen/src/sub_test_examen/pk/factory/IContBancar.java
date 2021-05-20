package sub_test_examen.pk.factory;

public interface IContBancar {

	
	void transfer(IContBancar destination, double amount);
	void deposit(double amount);
}
