
public class quiz_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a = {4,1,3,5,8};
		int b = a[3];
		
		for (int i=4 ; i>1; i--) {
			b-=i; // 5 - (2+3+4) = -4
		}
		System.out.print(b);
	}

}
