package matrices;
import java.util.Scanner;

public class factorial_mult {
	 public static void main(String[] args) {

		 	Scanner fact = new Scanner(System.in);
	        int num = fact.nextInt();
	        long factorial = 1;
	        for(int i = 1; i <= num; i++)
	        {
	            // factorial = factorial * i;
	            factorial *= i;
	        }
	        int num1 = fact.nextInt();
	        long factorial1 = 1;
	        for(int i = 1; i <= num1; i++)
	        {
	            // factorial = factorial * i;
	            factorial1 *= i;
	        }
	        int num2 = fact.nextInt();
	        long factorial2 = 1;
	        for (int i=1; i <= num2; i++) {
	            // factorial = factorial * i;
	            factorial2 *= i;
	        }
	        int mult = (int) (factorial*(factorial1/factorial2));
	        System.out.println(mult);   
	     }
	 
	}

