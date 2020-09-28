package part3;

public class Container extends Item implements Contain{

	public Container(String s) {
		this(s, StarSystem.UNKNOWN);
	}

	public Container(String s, StarSystem ss) {
		super(s, ss);
	}

	Item contained;
	
	public void setContained(Item item) {
		contained = item;
	}
	
	public Item getContained() {
		return contained;
	}
}
