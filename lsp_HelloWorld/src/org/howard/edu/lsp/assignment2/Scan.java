package org.howard.edu.lsp.assignment2;
import java.util.Scanner;
//import java.util.Arrays;


public class Scan {
	
	public static void read() {
		Scanner myobj = new Scanner(System.in);
		//System.out.println("String?");
		while (true) {
			System.out.println("String?");
			String kim;
			kim = myobj.nextLine();
			if (kim.equals("Goodbye"))
				break;
			else
				getNums(kim);
			//myobj.close();
		}
	}
	
	public static void getNums(String kim) {
		int i;
		int sum = 0;
		int prod = 1;
		String[] arr = kim.split(" ");
		int n = arr.length;
		int[] tokens = new int[n];
		for(i = 0; i < n; i++) {
			tokens[i] = Integer.parseInt(arr[i]);
		}
		System.out.println("Tokens: ");
		for(i = 0; i < tokens.length; i++) {
			System.out.println(tokens[i]);
			sum +=tokens[i];
			prod = prod * tokens[i];
		}
		System.out.println("Sum: " + sum);
		System.out.println("Prodcut: " + prod);
			
	}

	public static void main(String[] args) {
		read();
		
			
	}}
	
