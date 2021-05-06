package ro.ase.csie.cts.g1093.dp.strategy;

public class NoCampaign implements BonusStrategyInterface{

	@Override
	public void getBonusPoints(int points) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getBonusPoints(int points, Player player) {
		player.experiencePoints += points;
	}

}
