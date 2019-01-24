import java.util.*;

public class Hello
{
	public static void main (String args[])
	{	
		//Use a scanner and append data to Hello world file
		Scanner keyboard = new Scanner(System.in);
		
		// Ask the user for name and then save the input to a variable
		System.out.println("Who is currently ruinning the program? ");
		String name = keyboard.nextLine();
		
		System.out.println(name);
		
	}
}