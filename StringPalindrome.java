import java.util.*;

public class stringPalindrome {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		//Prompt
		System.out.println("Enter the word to check if it's a palindrome: ");
		String word = input.nextLine();	
		
		palindrome(word);
	}
	
	public static void palindrome(String w) { 
		
		String b = "";
		int i = w.length();
		for (int k = i - 1; k >= 0; k--) { 
			b = b+w.charAt(k);
		}
		
	if (w.equalsIgnoreCase(b))
		System.out.println("The word is a palindrome!");
				
	else 
		System.out.println("Not a palindrome!"); 
	}
}
