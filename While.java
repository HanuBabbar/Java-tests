package test;
import java.util.Scanner;
public class While {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String name = new String();
		
		while(name.isBlank()) {
			System.out.print("enter your name");
			name = scanner.nextLine();
		}
		 
		System.out.println("Hello "+name);

	}

}
