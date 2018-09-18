
	//Create a Java class that will prompt you to enter your name and then output a message that displays "Good morning, (your name)!" on the command line.
//Use the program we created yesterday from Chapter 2 named IntegerDemo2 as reference. The variable that you will need to declare which will hold onto the value of the user input is a String data type (as opposed to the numeric types we used in IntegerDemo2). Remember: save your code, compile (if you have errors, re-code and compile again), then execute if you are error free.


import java.util.Scanner;
import java.awt.Color;
public class HelloName
{
	public static void main(String[] args) 
	{
		
		
		Scanner input = new Scanner(System.in);
		String Name;
		
		System.out.print("please enter your name >>");
		Name = input.nextLine();


		System.out.println("Good Morning " + Name);
	}
}