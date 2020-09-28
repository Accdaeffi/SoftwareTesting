package part3;

public class Item {	
	String name;
	StarSystem homeland = StarSystem.UNKNOWN; 
	
	public Item(String s) {
		this(s, StarSystem.UNKNOWN);
	}
	
	public Item(String s, StarSystem ss) {
		name = s;
		homeland = ss;
	}
}

