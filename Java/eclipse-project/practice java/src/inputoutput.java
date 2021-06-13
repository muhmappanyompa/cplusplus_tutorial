import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class inputoutput {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scan = new Scanner(System.in);
		FileWriter fileWrite = null;
		PrintWriter printWrite = null;
		FileReader fileRead = null;
		BufferedReader buffRead = null;
		
		try {//create file
			String firstFile = scan.next();
			String secondFile = scan.next();
			scan.close();
			fileRead = new FileReader (String.format("%S.txt", firstFile));
			buffRead = new BufferedReader (fileRead);
			fileWrite = new FileWriter(String.format("%S.text", secondFile));
			printWrite = new PrintWriter(fileWrite);
			
			String test;
			int max = 0;
			while((test = buffRead.readLine()) !=null) {
				max = test.length() > max? test.length(): max;
			}
			
			fileRead = new FileReader(String.format("%s.txt", firstFile));
			buffRead = new BufferedReader(fileRead);
			
			String test1;
			
			while((test1 = buffRead.readLine())!=null) {
				printWrite.write(String.format("%"+ max + "s\n", test1));
			}
		} catch(IOException ioe) {
			System.out.println("gagal");
		}finally {
			try {
				if(fileWrite != null) {
					System.out.println("Berhasil");
					fileWrite.close();
				}
			
			if (fileRead != null ) {
				fileRead.close();
			}
		} catch(IOException ioe) {
			System.out.println(ioe.getMessage());
		}
    }
  }
}