package org.howard.edu.lsp.assignment5.implementation;

import java.util.*;
import java.util.stream.Collectors;
import java.util.HashSet;


public class IntegerSet{
	
	//private List<Integer> set = new ArrayList<Integer>();
	private ArrayList<Integer> list = new ArrayList<>();
	
	public ArrayList<Integer> getlist(){
	      return list;
	   }
	
	/**
	 * public IntegerSet(ArrayList<Integer> list)
	 * this class assigns the parameter list to the variable list
	 * @param list 
	 * @return 
	 */
	
	public IntegerSet(ArrayList<Integer> list){
		this.list = list;
		return;
	}
	
	/**
	 * public void clear()
	 * this class clears/removes all the elements from set
	 */
	
	public void clear() {
		list.clear();
	}
	
	/**
	 * public int length()
	 * This class returns the length of the array set
	 * @return  used to return from method
	 */
	
	public int length() {
		return list.size();
	}
	
	/**
	 * public boolean equals(IntegerSet intSetb)
	 * This class create a new arrary list listb
	 * then it compares the size of list and list b to see if the are the same size, if not it returns false
	 * if the size is the same then two temp list are created for the two main list so they arent altered
	 * then collections.sort sorts the two list so they can be compared against each other
	 * finally the for loop, loops through the elements of sorted temp lists and compares them to each other
	 * if one of the index dont match it returns false, otherwise it returns true
	 * @param b
	 * @return
	 */
	
	public boolean equals(IntegerSet intSetb) {
		ArrayList<Integer> listb = intSetb.list;
		
        if (list.size()!= listb.size()) {
        	return false;
        }
        
        ArrayList<Integer> tempa=list;
        ArrayList<Integer> tempb=listb;
        
        Collections.sort(tempa);
        Collections.sort(tempb);
 
      
        for (int i = 0; i < tempa.size(); i++) {
        	if (tempa.get(i) != tempb.get(i)) {
        		return false;
        		}
        	}
        
        return true;
	}
	
	/**
	 * public boolean contains(int value)
	 * this class uses set.contain to check whether the arraylist contains the given value 
	 * if not it returns false
	 * if it contains the value it returns true
	 * @param value
	 * @return
	 */
	public boolean contains(int value) {
		return list.contains(value);
	}
	
	/**
	 * public int largest() throws IntegerSetException
	 * This class first checks to see if the arraylist is equal to zero
	 * if it is it throws the exception IntegerSetException
	 * if not it moves to the for loop
	 * the for loop, loops through the elements in the arraylist until it reaches the end
	 * it checks if the number stored in maxnum is bigger than the next number
	 * if not the next number stores in maxnum, this repeats until the the last element
	 * @return
	 * @throws IntegerSetException
	 */
	
	public int largest() throws IntegerSetException{
		if (list.size() == 0) {
			IntegerSetException e = new IntegerSetException();
			throw e;
		}
		
		int maxnum = 0;
		int i;
		for (i = 0; i<list.size(); i++) {
			if(list.get(i) > maxnum) {
				maxnum = list.get(i);
			}
		}
		return maxnum;
	}
	
	/**
	 * public int smallest() throws IntegerSetException
	 * This class first checks to see if the arraylist is equal to zero
	 * if it is it throws the exception IntegerSetException
	 * if not it moves to the for loop
	 * the for loop, loops through the elements in the arraylist until it reaches the end
	 * it checks if the number stored in minnum is smaller than the next number
	 * if not the next number stores in minnum, this repeats until the the last element
	 * @return
	 * @throws IntegerSetException
	 */
	public int smallest() throws IntegerSetException{
		if (list.size() == 0) {
			IntegerSetException e = new IntegerSetException();
			throw e;
		}
		
		int minnum = Integer.MAX_VALUE;
		int i;
		for (i = 0; i<list.size(); i++) {
			if(list.get(i) < minnum) {
				minnum = list.get(i);
			}
		}
		return minnum;	
	}
	
	/**
	 * public void add(int item)
	 * This class first sets the boolean contains equal to false
	 * then it loops through the arraylist until it gets to the end
	 * if one of the elements is the same as the item it ends
	 * if the item is not in the arraylist it add the item to the list
	 * @param item
	 */
	public void add(int item) {
		boolean contains = false;
		
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i) == item) {
				contains = true;
				}
			}
	      
	       if(contains == false) {
	           list.add(item);
	       }
	}
	
	/**
	 * public void remove(int item)
	 * loops through the list
	 * if the item is not at one index it moves to next one and checks
	 * once it finds the item in the list it removes it, if it finds it
	 * @param item
	 */
	public void remove(int item) {
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i) == item) {
				list.remove(i);
				}
			}
	}
	
	/**
	 * public IntegerSet union(IntegerSet intSetb)
	 * I create a new arraylist tempc that holds intsetb
	 * then create a mathematical set called set
	 * .addAll adds all the elements of each list to set
	 * converts the set to an arraylist
	 * then converts that list to an integer set
	 * @param intSetb
	 */
	
	public IntegerSet union(IntegerSet intSetb) {
		 ArrayList<Integer> tempc=intSetb.getlist();
	      
	       Set<Integer> bob = new HashSet<>();
	       bob.addAll(list);
	       bob.addAll(tempc);
	      
	       ArrayList<Integer> list2= new ArrayList<>(bob);
	      
	       IntegerSet list3= new IntegerSet(list2);
	      
	       return list3;

	}
	
	/**
	 * public IntegerSet intersect(IntegerSet intSetb)
	 * creates new tempd list from intsetb and list
	 * removes elements from list that are not in tempd
	 * @param intSetb
	 */
	
	public IntegerSet intersect(IntegerSet intSetb) {
		ArrayList<Integer> tempd=intSetb.getlist();
		ArrayList<Integer> tempg = list;
		
		tempg.retainAll(tempd);
		
		IntegerSet list3= new IntegerSet(tempg);
		
		return list3;
		}
		
	
	/**
	 * public IntegerSet diff(IntegerSet intSetb)
	 * creates temp variables for intsetb and set
	 * .removeall then removes all elements from set that are in intSetb
	 * sets the integerset list5 to temps
	 * then returns list5
	 * @param intSetb
	 * @return
	 */
	
	public IntegerSet diff(IntegerSet intSetb) {
		ArrayList<Integer> tempe=intSetb.getlist();
		ArrayList<Integer> temps = list;
		
		temps.removeAll(tempe);
		
		IntegerSet list5= new IntegerSet(temps);
		
		return list5;
		
	}
	
	/**
	 * boolean is Empty
	 * checks if list size is equal to 0
	 * if it is it returns 0 otherwise it returns false.
	 * @return
	 */
	
	public boolean isEmpty() {
		if (list.size() == 0) {
			return true;
		}
		else;
		return false;
		
	} 
	
	/**
	 * public String toString
	 * converts list to a string set
	 * joins each element to string with "," in between
	 * returns string joined
	 */
	
	public String toString() {
		Set<String> listString = list.stream().map(String::valueOf).collect(Collectors.toSet());
		String joined = String.join(",", listString);
		return joined;
        }

	
	}