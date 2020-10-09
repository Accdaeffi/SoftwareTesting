package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.Main;

class TestMain {

	@Test
	void test() {
		assertEquals(Main.finalFunction(-13), 8.32342931334835526139986804652012677689196177648113288829218, 0.00001);
		assertEquals(Main.finalFunction(0), Double.NaN);
		assertEquals(Main.finalFunction(1), Double.NaN);
		assertEquals(Main.finalFunction(10), 56123.6, 0.1);
		
		//fail("Not yet implemented");
	}

}
