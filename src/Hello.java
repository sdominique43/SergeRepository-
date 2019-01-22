import java.util.*;

public class Hello {
	public static void main(String[] args)
	{
		System.out.println("Hello, who's am I speaking to?");
		
		//Take in the user input
		Scanner keyboard = new Scanner(System.in);
		
		String inputString = keyboard.nextLine();
		
		System.out.println(inputString);
	}
}
