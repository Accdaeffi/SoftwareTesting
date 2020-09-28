package part3;

public class Fish extends Item {
	
	Action doing;

	public Fish(String s) {
		super(s);
		doing = Action.IDLE;
	}
	
	public void swim() {
		doing = Action.SWIMING;
	}

}
