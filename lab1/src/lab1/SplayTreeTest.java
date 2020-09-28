package lab1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class SplayTreeTest {

	static SplayTree spt;
	
	@BeforeClass
	public static void init() {
		spt = new SplayTree();
	}
	
	@After
	public void clearTree() {
		spt.clear();
	}
	
	@Before
	public void insertData() {
		spt.insert(100);
		spt.insert(150);
		spt.insert(75);
		spt.insert(300);
		spt.insert(80);
	}
	
	@Test
	public void testPrint() {
		SplayTree testTree = new SplayTree();
		assertEquals("{}", testTree.print());
		SplayNode root = new SplayNode(150);
		testTree.root = root;
		SplayNode left = new SplayNode(100);
		root.left = left;
		testTree.count = 2;
		assertEquals("{ l{100 l} 150 }", testTree.print());
	}
	
	@Test
	public void testInsert() {
		spt.clear();
		
		spt.insert(100);
		assertEquals("{100 }",spt.print());
		spt.insert(150);
		assertEquals("{ l{100 l} 150 }",spt.print());
		spt.insert(75);
		assertEquals("{75  r{100  r{150 r} r} }",spt.print());
		spt.insert(300);
		spt.insert(80);
		assertEquals("{ l{75 l} 80  r{ l{100  r{150 r} l} 300 r} }",spt.print());
	}
	
	@Test
	public void testFind() {
		spt.find(80);
		assertEquals("{ l{75 l} 80  r{ l{100  r{150 r} l} 300 r} }",spt.print());
		spt.find(300);
		assertEquals("{ l{ l{75 l} 80  r{100  r{150 r} r} l} 300 }",spt.print());
		spt.find(150);
		assertEquals("{ l{ l{ l{75 l} 80 l} 100 l} 150  r{300 r} }",spt.print());
	}
	
	@Test
	public void testRemove() {
		spt.remove(80);
		assertEquals("{75  r{ l{100  r{150 r} l} 300 r} }",spt.print());
		spt.remove(100);
		assertEquals("{75  r{ l{150 l} 300 r} }",spt.print());
		spt.remove(150);
		assertEquals("{75  r{300 r} }",spt.print());
	}
}	

