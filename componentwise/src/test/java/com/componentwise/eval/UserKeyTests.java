package com.componentwise.eval;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.Hashtable;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserKeyTests {

	private UserKey b1 = null;
	private UserKey b2 = null;
	private UserKey b3 = null;
	private UserKey b4 = null;
	
	@Before
	public void before() {
		
		b1 = new UserKey("Bill Smith", "BSMITH");
		b2 = new UserKey("Bill Smith", "BSMITH");
		b3 = new UserKey("Susan Smith", "SSMITH");
		b4 = new UserKey(null, null);
		
	}
	
	@Test
	public void test() {
		
		System.out.println( b1.equals(b1) );  // prints true
		System.out.println( b1.equals(b2) );  // prints true
		System.out.println( b1.equals(b3) );  // prints false
		System.out.println( b1.equals(null) ); // prints false
		System.out.println( b1.equals("Some String") ); // prints false
		System.out.println( b4.equals(b1) ); // prints false

		Hashtable<UserKey, String> ht = new Hashtable<>();

		ht.put(b1,"Some Data");

		String s = (String) ht.get(b2);

		System.out.println( s.equals("Some Data") );  // prints true
	}
	
	@Test
	public void testEqualsToItself() {
		assertEquals(b1, b1);
	}

	@Test
	public void testEqualsToAnother() {
		assertEquals(b1, b2);
	}

	@Test
	public void testNotEqualsToAnother() {
		assertNotEquals(b1, b3);
	}

	@Test
	public void testNotEqualsToNull() {
		assertNotEquals(b1, null);
	}

	@Test
	public void testNotEqualsToBadObject() {
		assertNotEquals(b1, "Some String");
	}

	@Test
	public void testEqualsToHashTableGet() {
		
		Hashtable<UserKey, String> ht = new Hashtable<>();
		ht.put(b1, "Some Data");

		String s = (String)ht.get(b2);
		assertEquals(s, "Some Data");
	}

}
