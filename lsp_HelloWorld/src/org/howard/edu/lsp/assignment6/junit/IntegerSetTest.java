package org.howard.edu.lsp.assignment6.junit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.howard.edu.lsp.assignment5.implementation.IntegerSet;
import org.howard.edu.lsp.assignment5.implementation.IntegerSetException;
import org.junit.jupiter.api.Test;

class IntegerSetTest {
	
	@Test
	public void testClear() {
		ArrayList<Integer> list= new ArrayList<>();
		ArrayList<Integer> listb= new ArrayList<>();
		IntegerSet set = new IntegerSet(list);
		IntegerSet intSetb= new IntegerSet(listb);
		
		set.add(1);
		set.add(2);
		set.add(3);
		
		set.clear();
		
		assertEquals("",set.toString());
		assertNotEquals("1,2,3",set.toString());
		
		intSetb.add(1);
		intSetb.add(2);
		intSetb.add(3);
		intSetb.add(4);
		intSetb.add(5);
		
		intSetb.clear();
		
		assertEquals("",intSetb.toString());
		assertNotEquals("1,2,3,4,5",intSetb.toString());
		
		
	}
	
	@Test
	public void testLength() {
		ArrayList<Integer> list= new ArrayList<>();
		ArrayList<Integer> listb= new ArrayList<>();
		IntegerSet set = new IntegerSet(list);
		IntegerSet intSetb= new IntegerSet(listb);
		
		assertEquals(0,set.length());
		assertEquals(0,intSetb.length());
		
		set.add(1);
		set.add(2);
		set.add(3);
		
		intSetb.add(1);
		intSetb.add(2);
		intSetb.add(3);
		intSetb.add(4);
		intSetb.add(5);
		
		assertEquals(3,set.length());
		assertEquals(5,intSetb.length());
		
	}

	@Test
	public void testEquals() {
		ArrayList<Integer> list= new ArrayList<>();
		ArrayList<Integer> listb= new ArrayList<>();
		IntegerSet set = new IntegerSet(list);
		IntegerSet intSetb= new IntegerSet(listb);
		
		assertTrue(set.equals(intSetb));
		
		set.add(1);
		set.add(2);
		set.add(3);
		
		assertFalse(set.equals(intSetb));
		
		intSetb.add(1);
		intSetb.add(2);
		intSetb.add(3);
		
		assertTrue(set.equals(intSetb));
		
		set.add(4);
		intSetb.add(5);
		
		assertFalse(set.equals(intSetb));
		
		set.add(5);
		intSetb.add(4);
		
		assertTrue(set.equals(intSetb));
	}
	
	@Test
	public void testContains() {
		ArrayList<Integer> list= new ArrayList<>();
		ArrayList<Integer> listb= new ArrayList<>();
		IntegerSet set = new IntegerSet(list);
		IntegerSet intSetb= new IntegerSet(listb);
		
		assertFalse(set.contains(3));
		
		set.add(1);
		set.add(2);
		set.add(3);
		
		assertTrue(set.contains(3));
		assertFalse(set.contains(9));
		
		assertFalse(intSetb.contains(1));
		
		intSetb.add(6);
		intSetb.add(5);
		intSetb.add(8);
		
		assertFalse(intSetb.contains(7));
		assertTrue(intSetb.contains(6));
	}
	
	@Test
	public void testLargest() throws IntegerSetException {
		ArrayList<Integer> list= new ArrayList<>();
		ArrayList<Integer> listb= new ArrayList<>();
		
		IntegerSet set = new IntegerSet(list);
		IntegerSet intSetb= new IntegerSet(listb);
		  
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		
		assertEquals(4,set.largest());
		
		set.add(6);
		
		assertEquals(6,set.largest());
		
		intSetb.add(5);
		intSetb.add(1);
		intSetb.add(3);
		
		assertEquals(5,intSetb.largest());
	}
	
	@Test
	public void testSmallest() throws IntegerSetException {
		ArrayList<Integer> list= new ArrayList<>();
		ArrayList<Integer> listb= new ArrayList<>();
		
		IntegerSet set = new IntegerSet(list);
		IntegerSet intSetb= new IntegerSet(listb);
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		
		assertEquals(1,set.smallest());
		
		intSetb.add(10);
		intSetb.add(21);
		intSetb.add(15);
		
		assertEquals(10,intSetb.smallest());
		}
	
	@Test
	public void testAdd() {
		ArrayList<Integer> list= new ArrayList<>();
		ArrayList<Integer> listb= new ArrayList<>();
		
		IntegerSet set = new IntegerSet(list);
		IntegerSet intSetb= new IntegerSet(listb);
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		
		assertEquals("1,2,3,4",set.toString());
		assertNotEquals("5,6,7,8",set.toString());
		
		
		intSetb.add(10);
		intSetb.add(21);
		intSetb.add(15);
		
		assertEquals("15,10,21",intSetb.toString());
		assertNotEquals("5,6,7,8",intSetb.toString());	
	}
	
	@Test
	public void testRemove() {
		ArrayList<Integer> list= new ArrayList<>();
		ArrayList<Integer> listb= new ArrayList<>();
		
		IntegerSet set = new IntegerSet(list);
		IntegerSet intSetb= new IntegerSet(listb);
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.remove(4);
		
		
		assertEquals("1,2,3",set.toString());
		assertNotEquals("1,2,3,4",set.toString());
		
		intSetb.add(10);
		intSetb.add(21);
		intSetb.add(15);
		intSetb.remove(21);
		intSetb.remove(10);
		
		
		assertEquals("15",intSetb.toString());
		assertNotEquals("5,6,7,8",intSetb.toString());
		
		set.remove(1);
		set.remove(2);
		set.remove(3);
		
		assertEquals("",set.toString());
	}
	
	@Test
	public void testUnion() {
		ArrayList<Integer> list= new ArrayList<>();
		ArrayList<Integer> listb= new ArrayList<>();
		
		IntegerSet set = new IntegerSet(list);
		IntegerSet intSetb= new IntegerSet(listb);
		
		set.union(intSetb);
		assertEquals("",set.toString());
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		
		intSetb.add(5);
		intSetb.add(6);
		intSetb.add(7);
		
		System.out.println("The union of set and intSetb is "+set.union(intSetb));
		
		set = set.union(intSetb);
		
		assertEquals("1,2,3,4,5,6,7", set.toString());
		assertNotEquals("9,8,7,6,5,4,3,2,1", set.toString());
	}
	
	@Test
	public void testIntersect() {
		ArrayList<Integer> list= new ArrayList<>();
		ArrayList<Integer> listb= new ArrayList<>();
		
		IntegerSet set = new IntegerSet(list);
		IntegerSet intSetb= new IntegerSet(listb);
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		
		intSetb.add(4);
		intSetb.add(5);
		intSetb.add(6);
		intSetb.add(7);
		
		set.intersect(intSetb);
		assertEquals("4",set.toString());
		assertNotEquals("1,2,3,4,5,6,7",set.toString());
		
		set.remove(4);
		
		set.intersect(intSetb);
		assertEquals("",set.toString());
		assertNotEquals("1,2,3,5,6,7",set.toString());
	}
	
	@Test
	public void testDiff() {
		ArrayList<Integer> list= new ArrayList<>();
		ArrayList<Integer> listb= new ArrayList<>();
		
		IntegerSet set = new IntegerSet(list);
		IntegerSet intSetb= new IntegerSet(listb);
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		
		intSetb.add(3);
		intSetb.add(4);
		intSetb.add(5);
		intSetb.add(6);
		
		set.diff(intSetb);
		assertEquals("1,2",set.toString());
		assertNotEquals("5,6",set.toString());
	}
	
	@Test
	public void testIsEmpty() {
		ArrayList<Integer> list= new ArrayList<>();
		ArrayList<Integer> listb= new ArrayList<>();
		
		IntegerSet set = new IntegerSet(list);
		IntegerSet intSetb= new IntegerSet(listb);
		
		assertTrue(set.isEmpty());
		assertTrue(intSetb.isEmpty());
		
		set.add(1);
		set.add(2);
		
		intSetb.add(3);
		intSetb.add(4);
		
		assertFalse(set.isEmpty());
		assertFalse(intSetb.isEmpty());
	}
	
	@Test
	public void testToString() {
		ArrayList<Integer> list= new ArrayList<>();
		ArrayList<Integer> listb= new ArrayList<>();
		
		IntegerSet set = new IntegerSet(list);
		IntegerSet intSetb= new IntegerSet(listb);
		
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		
		intSetb.add(3);
		intSetb.add(4);
		intSetb.add(5);
		intSetb.add(6);
		
		assertEquals("1,2,3,4", set.toString());
		assertNotEquals("3,4,5,6", set.toString());
		
		assertEquals("3,4,5,6",intSetb.toString());
		assertNotEquals("1,2,3,4", intSetb.toString());
	}

}
