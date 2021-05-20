package sub_test_examen.pk.factory;

public class AccountFactory {
	public static IContBancar getAccount(String name) {
		IContBancar cont = null;
		if(name == "Credit")
			cont = new CreditAccount();
		if(name =="Debit")
			cont = new DebitAccount();
		if(name!= "Credit" && name!="Debit")
			cont = null;
		
		return cont;
	}
}
