package part3;

public class Hand implements Contain{
	Item contained;
	
	public void setContained(Item item) {
		contained = item;
	}
	
	public Item getContained() {
		return contained;
	}
	
}
