package simple_math;
import java.util.Scanner;

public class percent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Total Kehadiran: "); //K
		double a = input.nextDouble();
		
		
		System.out.println("Total Pertemuan: "); //N
		double b = input.nextDouble();
		
		double c = (a/b)*100;
		System.out.println("Persentase kehadiran: ");
		System.out.print(String.format("%.2f",c) +"%");

	}

}
