package recap_semBoja.Strategy;

public class NoCampaign implements BonusStrategyInterface{

	@Override
	public void getBonusPoints(int points, Player player) {
		player.experiencePoints += points;
	}

}