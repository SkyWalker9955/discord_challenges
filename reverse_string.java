import java.util.*;

public class reverse_string {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Prompt and vars
		System.out.println("Enter a string: ");
		String original = input.nextLine();
		String reverse = "";
		
		//condition
		int len = original.length();
		
		for (int i = len -1; i >= 0; i--) {
			reverse = reverse + original.charAt(i);
		}
		
		//result
		System.out.println("The reverse string is " + reverse + ".");
		
		input.close();
	}
}