package simple_math;

import java.util.Scanner;

class Nomor1{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] elemen = new int[n];
		

		for(int i=0; i<n; i++){
			elemen[i] = scan.nextInt();
		}
		
		for(int i=0; i<n; i++){
			for (int j=i+1; j<n; j++){
			    //int x = 0;
				boolean x= false;
			    for (int k = 2; k<=(elemen[j]>elemen[i] ? elemen[i]:elemen[j]); k++){
			        if (elemen[j]%k==0&&elemen[i]%k==0)
			            x=true;
			    }
			    if(!x)
			    	System.out.printf("%d %d \n",elemen[i],elemen[j]); 
			}
		}
	}
}