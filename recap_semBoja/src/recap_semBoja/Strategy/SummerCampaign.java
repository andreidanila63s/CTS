package recap_semBoja.Strategy;

public class SummerCampaign implements BonusStrategyInterface{

	@Override
	public void getBonusPoints(int points, Player player) {
		player.experiencePoints += (1.5 * points);
	}

}