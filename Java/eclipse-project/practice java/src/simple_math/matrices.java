package simple_math;

//for user input in java
import java.util.Scanner;

public class matrices {

	public static void  main(String[]args) {
		
		int n; // for input the value
		Scanner input = new Scanner(System.in);
		System.out.println("Input matrix element: ");
		n= input.nextInt(); // read value of n
		
		//create array
		int a [][] = new int [n][n];
		int b [][] = new int [n][n];
		int c [][] = new int [n][n];
		
		
		//Enter first matrix
		System.out.println("Enter matrix based on row: \n");
		for (int i=0; i<n; i++) {
			for (int j=0; j<n ; j++) {
				a[i][j] = input.nextInt(); // print matrix of a
			}
		}
		
		//Enter second matrix
		System.out.println("Enter 2nd Matrix: \n");
		for (int i=0 ; i<n ; i++ ) {
			for (int j=0 ; j<n ;j++) {
				b[i][j] = input.nextInt();
			}
		}
		
		//multiply the matrix
		System.out.println("Multiplication matrix is: \n");
		for(int i=0; i<n; i++) {
			for(int j=0 ; j<n ; j++) {
				for(int k =0; k<n; k++) {
					c[i][j] = c[i][j]+ a[i][k]*b[k][j];
				}
			}
		}
		//Matrices results
		for(int i=0; i<n ; i++ ) {
			for(int j=0 ; j<n ; j++) {
			
				System.out.print(c[i][j]+ " ");
			}
			System.out.println();
		}
	}
}
