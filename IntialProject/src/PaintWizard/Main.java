package PaintWizard;

import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{		
		PaintWizard paintWizard = new PaintWizard();
		paintWizard.initialise();
		System.out.println(paintWizard.inputRoomSize(getInput()));
	}
	
	
	public static int getInput()
	{
		Scanner inputScanner = new Scanner(System.in);
		int input = 0 ;//= inputScanner.nextInt();
		boolean badInput = true;
		do
		{
			System.out.println("Enter your size of room");
			try 
			{
				input = Integer.parseInt(inputScanner.nextLine());
				if(input>0)
				{
					badInput = false;
				}
				else
				{
					System.out.println("incorrect range must be greater than 0");
				}			
			}	
			catch (Exception ex) 
			{
				System.out.println("Please enter a valid number");
			} 

		} while (badInput);
		return input;
	}

}
