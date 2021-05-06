package ro.ase.csie.cts.g1093.dp.strategy;

public class EasterCampaign implements BonusStrategyInterface{

	@Override
	public void getBonusPoints(int points) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getBonusPoints(int points, Player player) {
		if(player.playTime > 5) {
			player.experiencePoints += (2*points);
		}
	}
	
	

}
