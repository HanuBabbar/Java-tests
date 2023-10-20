package test;

public class If {

	public static void main(String[] args) {
		
		String age = new String();
		age = "eighteen";
		String age2 = new String("eighteen");
	
		if(age==age2) {
			System.out.println("You are an adult");
		}
		else{
			System.out.println("You are a kid");
		}
	}

}

