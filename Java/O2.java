import java.util.Scanner;

public class O2 {
	public static void main(String[] args) {
		Scanner deret = new Scanner(System.in);

		int n = deret.nextInt();
		int[] yey = new int[n];
		int gcd = 1;
		int fact = 1;
		int batas = 0;

		for (int i = 1; i <= n-1; i++){
			fact *= i;
		}
		for (int i = 0; i < n; i++){
			yey[i] = deret.nextInt();
		}
		for (int i = 0; i < n; i++){
			for (int j = 1; j < n; j++){
				int min, max;
        		min = yey[i];
        		if (min > yey[j]){
        		    min = yey[j];
        		    max = yey[i];
        		}else {
        			min = yey[i];
        			max = yey[j];
        		}
        		while (max > min){
        		    int r = max % min;
        		    if (r == 0){
       		        gcd = min;
                		break;
            		}
            		else{
            		    max = min;
            		    min = r;
            		}
        		}
        		if (batas < fact){
        			if (gcd == 1){
        				if(yey[i] != yey[j]){
							System.out.println(yey[i] + " " + yey[j]);
        				}
        			}
        		}
        		batas++;
			}
		}
	}
}