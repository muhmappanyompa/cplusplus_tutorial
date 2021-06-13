package simple_math;
import java.util.Scanner;
public class vel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Input Time : ");
		int t = input.nextInt();
		t=t+14;
		System.out.print("velocity : ");
		int s = input.nextInt();
		
		//velocity
		// velocity = Distance/Time;
		double v = (s/t);
		System.out.print("Fuel used : ");
		System.out.print(String.format("%.3f", v)+"L");
	}

}
