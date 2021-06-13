package Fundamentals;

import java.util.Arrays; // Import an array package of a Java Library

public class BinarySearch {
	public static int rank (int key, int[]a ) { // int: return type (parameter type), key & a : parameter variables
		int lo = 0; //initializing declaration statement
		int hi = a.length-1;
		
		
		//loop statement
		while (lo<= hi) {
			int mid = lo + ((hi-lo)/2);
			if (key<a[mid]) 
				hi = mid-1;
			else if (key> a[mid]) 
				lo = mid+1;
			else return mid;
		}
		return -1; // return statement
	}
	
	
	//need text file
	public static void main(String[]args) { //main: System calls main(), void: no retirn value, just side effects
		int [] whitelist = In.readInts(args[0]);
		
		Arrays.sort(whitelist);
		
		while(!StdIn.isEmpty()) {
			if(rank(key,whitelist)==-1)
				StdOut.println(key);
		}
	}

}
