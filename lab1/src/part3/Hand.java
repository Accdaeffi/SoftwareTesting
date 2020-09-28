package part3;

public class Hand implements Contain{
	
	Item contained;
	Action doing;
	
	public void setContained(Item item) {

		if (item != null) {
			doing = Action.TAKING;
		} else {
			doing = Action.IDLE;
		}
		contained = item;
	}
	
	public Item getContained() {
		return contained;
	}
	
}
