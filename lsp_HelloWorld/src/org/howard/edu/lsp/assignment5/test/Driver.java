package org.howard.edu.lsp.assignment5.test;

import java.util.ArrayList;

import org.howard.edu.lsp.assignment5.implementation.IntegerSet;
import org.howard.edu.lsp.assignment5.implementation.IntegerSetException;
public class Driver {

	public static void main(String[] args) throws IntegerSetException{
		ArrayList<Integer> list= new ArrayList<>();
		ArrayList<Integer> listb= new ArrayList<>();
		
		IntegerSet set = new IntegerSet(list);
		  
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);
		set.add(6);
		set.add(7);
		System.out.println("Value of Set1 : "+set.toString());
		System.out.println("Largest element in set1 : "+set.largest());  
		System.out.println("Smallest element in set1 : "+set.smallest());
		
		IntegerSet intSetb= new IntegerSet(listb);
		  
		
		intSetb.add(6);
		intSetb.add(5);
		intSetb.add(8);
		
		System.out.println("Value of Set2 : "+intSetb.toString());
		System.out.println("Largest element in set2 : "+intSetb.largest()); 
		System.out.println("Smallest element in set2 : "+intSetb.smallest());
		  
		
		System.out.println("Are they equal : "+set.equals(intSetb));
		
		set.remove(3);
		System.out.println("Remove #3 from set1");
		System.out.println("Value of Set1 is now : "+set.getlist());
		
		intSetb.remove(4);
		System.out.println("Remove #4 from set2");
		System.out.println("Value of Set2 is now : "+intSetb.getlist());
		
		  
		System.out.println("Union of Set1 and Set2");
		System.out.println("Value of Set1 is:" + set.toString());
		System.out.println("Value of Set2 is:" + intSetb.toString());
		System.out.println("Result of Union of Set1 and Set2");
		System.out.println(set.union(intSetb) );
		
		System.out.println("Result of Intersection of Set1 and Set2");
		IntegerSet foo= set.intersect(intSetb);
		System.out.println(foo.getlist());
	
		
		System.out.println("The Difference between the two sets is : ");
		IntegerSet woo = set.diff(intSetb);
		System.out.println(woo.getlist());
		
		System.out.println("The set is empty: "+ set.isEmpty());
		
		set.clear();
		System.out.println("Next Test");
		  
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(4);

		System.out.println("Value of Set1 : "+set.toString());
		System.out.println("Largest element in set1 : "+set.largest());  
		System.out.println("Smallest element in set1 : "+set.smallest());
		  
		
		intSetb.add(5);
		intSetb.add(6);
		intSetb.add(7);
		intSetb.add(8);
		
		System.out.println("Value of Set2 : "+intSetb.toString());
		System.out.println("Largest element in set2 : "+intSetb.largest()); 
		System.out.println("Smallest element in set2 : "+intSetb.smallest());
		  
		
		System.out.println("Are they equal : "+set.equals(intSetb));
		
		set.remove(3);
		System.out.println("Remove #3 from set1");
		System.out.println("Value of Set1 is now : "+set.getlist());
		
		intSetb.remove(4);
		System.out.println("Remove #4 from set2");
		System.out.println("Value of Set2 is now : "+intSetb.getlist());
		
		  
		System.out.println("Union of Set1 and Set2");
		System.out.println("Value of Set1 is:" + set.toString());
		System.out.println("Value of Set2 is:" + intSetb.toString());
		System.out.println("Result of Union of Set1 and Set2");
		System.out.println(set.union(intSetb) );
		
		System.out.println("Result of Intersection of Set1 and Set2");
		//IntegerSet foo= set.intersect(intSetb);
		System.out.println(set.intersect(intSetb).getlist());
	
		
		System.out.println("The Difference between the two sets is : ");
		//IntegerSet woo = set.diff(intSetb);
		System.out.println(set.diff(intSetb).getlist());
		
		System.out.println("The set is empty: "+ set.isEmpty());
		
		
		set.clear();
		System.out.println("Next Test");
		

		System.out.println("Value of Set1 : "+set.toString());
		System.out.println("Largest element in set1 : "+set.largest());  
		System.out.println("Smallest element in set1 : "+set.smallest());
		  
		
		intSetb.add(5);
		intSetb.add(6);
		intSetb.add(7);
		intSetb.add(8);
		
		System.out.println("Value of Set2 : "+intSetb.toString());
		System.out.println("Largest element in set2 : "+intSetb.largest()); 
		System.out.println("Smallest element in set2 : "+intSetb.smallest());
		  
		
		System.out.println("Are they equal : "+set.equals(intSetb));
		
		set.remove(3);
		System.out.println("Remove #3 from set1");
		System.out.println("Value of Set1 is now : "+set.getlist());
		
		intSetb.remove(4);
		System.out.println("Remove #4 from set2");
		System.out.println("Value of Set2 is now : "+intSetb.getlist());
		
		  
		System.out.println("Union of Set1 and Set2");
		System.out.println("Value of Set1 is:" + set.toString());
		System.out.println("Value of Set2 is:" + intSetb.toString());
		System.out.println("Result of Union of Set1 and Set2");
		System.out.println(set.union(intSetb) );
		
		System.out.println("Result of Intersection of Set1 and Set2");
		//IntegerSet foo= set.intersect(intSetb);
		System.out.println(set.intersect(intSetb).getlist());
	
		
		System.out.println("The Difference between the two sets is : ");
		//IntegerSet woo = set.diff(intSetb);
		System.out.println(set.diff(intSetb).getlist());
		
		System.out.println("The set is empty: "+ set.isEmpty());

	}

}
