package affandes;

import java.util.Arrays;
public class linearSearch {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] collection = {'A','B','C','D'};
		int search = 'D';
		int num = 0;
		
		//condition
		while (num < collection.length) {
			int book = collection[num];
			if(book == search) {
				System.out.println(num);
				return;

			}
			else 
			System.out.println("not found");

			num++;
		}
		
	}

}
