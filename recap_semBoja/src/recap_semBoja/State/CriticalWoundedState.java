package recap_semBoja.State;


public class CriticalWoundedState implements MoveStateInterface{

	@Override
	public void moveAtDifferentLocation() {
		System.out.println("The hero can't move");
	}

}