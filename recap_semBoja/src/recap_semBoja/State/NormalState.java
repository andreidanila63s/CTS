package recap_semBoja.State;


public class NormalState implements MoveStateInterface {

	@Override
	public void moveAtDifferentLocation() {
		System.out.println("The hero is running");
	}

}