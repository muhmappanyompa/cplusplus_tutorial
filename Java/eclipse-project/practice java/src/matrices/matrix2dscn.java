package matrices;

import java.util.Scanner;

public class matrix2dscn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		int row = a.nextInt();
		int col = a.nextInt();
		
		System.out.println("Enter Matrix arr: ");
		int mat2d [][] = new int[row][col];
		
		for(int i=0; i<row ; i++ ) {
			for(int j=0; j<col ; j++) {
				mat2d[i][j] = a.nextInt();
			}
		}
		   System.out.print("\nData you entered : \n");
	       for (int i=0; i<row ; i++) {
	    	   for(int j=0; j<col ; j++) {
	    		   System.out.print(mat2d[i][j]+" ");
	    	   }
	    	   System.out.println();
	       }
		}
	}