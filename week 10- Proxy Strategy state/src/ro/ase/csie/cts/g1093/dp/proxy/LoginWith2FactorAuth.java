package ro.ase.csie.cts.g1093.dp.proxy;

public class LoginWith2FactorAuth implements LoginInterface{
	
	LoginInterface loginModule = null;

	
	public LoginWith2FactorAuth(LoginInterface loginModule) {
		super();
		this.loginModule = loginModule;
	}
	
	public boolean checkgeneratedCode (int code) {
		if(code == 1245)
			return true;
		else 
			return false;
	}
	@Override
	public boolean login(String username, String pass) {
		if(this.loginModule.login(username, pass)) {
			System.out.println("please write sms");
			System.out.println("check received code");
			if(checkgeneratedCode(1234)) {
				System.out.println("hello" + username);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean checkServerStatus() {
		
		return this.loginModule.checkServerStatus();
	}

	
	

}
