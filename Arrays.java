package test;

public class Arrays {

	public static void main(String[] args) {
		
		String[] cars = {"Camaro","Corvette","Tesla"};
		
		cars[0] = "Mustang";
		
		System.out.println(cars[0]);
		
		//next way to create array
		
		String[] cars2 = new String[3];
		cars2[1] = "Tesla";
		
		System.out.println(cars2[0]);
		
		for(int i = 0; i < cars.length;i++) {
			System.out.println(cars[i]);
		}

	}

}
