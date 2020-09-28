package part3;

import static org.junit.Assert.*;

import org.junit.Test;

public class Part3Test {

	@Test
	public void testItem() {
		Item item = new Item("Test item", StarSystem.SOLAR);
		
		assertEquals(item.name, "Test item");
		assertEquals(item.homeland, StarSystem.SOLAR);
		
		Item item2 = new Item("item");
		
		assertEquals(item2.name, "item");
		assertEquals(item2.homeland, StarSystem.UNKNOWN);
	}
	
	@Test
	public void testContain() {
		Item item = new Item("Test item", StarSystem.SOLAR);
		
		Container box = new Container("Box");
		Hand hand = new Hand();
		
		box.setContained(item);
		hand.setContained(item);

		assertEquals(item, box.getContained());
		assertEquals(item, hand.getContained());
	}
	
	@Test
	public void testHuman() {
		
		Human human = new Human("Arthur", StarSystem.SOLAR);
		
		assertTrue("No ears!", human.ears != null);
		assertTrue("No eyes!", human.eyes != null);
		assertTrue("No hands!", human.leftHand != null && human.rightHand != null);
		assertNotEquals(human.leftHand, human.rightHand);
		
		Item item = new Item("test");
		
		human.eyes.focusedItem = item;
		
		assertNotNull(human.eyes.focusedItem.name);
	}
	
	

}
