package test;
import java.util.Scanner;
public class Nestedloops {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int rows;
		int columns;
		String symbol = "";
		
		System.out.println("Enter rows:");
		rows = scanner.nextInt();
		
		System.out.println("Enter columns:");
		columns = scanner.nextInt();
		
		System.out.println("Enter symbol to use:");
		symbol = scanner.next();
		
		for(int i = 1;i <= rows; i++) {
			
			for(int j = 1; j <= columns; j++) {
				System.out.print(symbol);
				
			}
			System.out.println();
		}
	}

}
