package part3;

public class Human {

	public Hand leftHand;
	public Hand rightHand;
	public Eyes eyes;
	public Ears ears;
	
	public StarSystem homeland;
	String name;
	
	public Human(String s) {
		this(s, StarSystem.UNKNOWN);
	}
	
	public Human(String s, StarSystem ss) {
		leftHand = new Hand();
		rightHand = new Hand();
		eyes = new Eyes();
		ears = new Ears();
		
		name = s;
		homeland = ss;
	}
}
