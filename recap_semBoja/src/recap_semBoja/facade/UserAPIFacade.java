package recap_semBoja.facade;


public class UserAPIFacade {

	// the facade method
	public static String getUserProfile(String user, String pass) {

		GameServer server = new GameServer();
		server.connect();

		// 2. Create a login
		Login login = new Login("player1", "1234");
		login.login();

		// 3. Create and get the profile
		UserProfile userProfile = login.getUserProfile();
		String profile = userProfile.getProfile();

		return profile;

	}
}