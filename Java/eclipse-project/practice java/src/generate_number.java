import java.util.Scanner;
import java.util.Random;

class generate_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			    Scanner scan = new Scanner(System.in);
			    int n = scan.nextInt();
			    int m = scan.nextInt();
			    String serialNumber = generateSerial(n, m);
			    System.out.println(serialNumber);    
			    }
	public static String generateSerial(int n, int m) {
		
        String str = "";
        Random random = new Random();
        
        //Loop
        for (int i=0; i<n; i++){
            for (int j=0; j<m; j++){
            	
            	//generate random number using math random funct
            	int value = (int)(Math.random()* m);
            	
                //int value = random.nextInt();
                str += String.valueOf(value);
               
                
            }
            if (i==n){
                str += " ";
            } else { 
                str += "-";
            	}            
            }
        //remove last character
        return (str ==null) ? null : str.replaceAll(".$","");
    }
}
