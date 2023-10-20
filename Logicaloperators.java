package test;
import java.util.Scanner;
public class Logicaloperators {

	public static void main(String[] args) {
		
		int temp =  10;
		
		if(temp > 30) {
			System.out.println("Hot");
		}
		else if(temp >= 20 && temp <= 30) {
			System.out.println("pleasant");
		}
		else {
			System.out.println("cold");
		}

		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Press Q or q to exit");
		String response = scanner.next();
	
		if(!response.equals("q") && !response.equals("Q")) {
			System.out.println("Not Quit");
		}
		else {
			System.out.println("Quit");
		}
		
		scanner.close();
	}

}
