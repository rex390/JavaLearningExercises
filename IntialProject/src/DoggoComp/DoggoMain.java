package DoggoComp;

import java.util.Scanner;

public class DoggoMain {

	public static void main(String[] args) 
	{
		int maxRange = 100;
		int position ;
		int input = 0 ;
		input = inputChecker(maxRange);
		
		for (position = 1; position <= maxRange; position++)
		{
			
			if (input == position)
			{
				continue;	
			}
			else 
			{				
				if((position > 10) && Integer.toString(position).charAt(Integer.toString(position).length()-1)=='1' & (position!=11 & position!=100) || position ==1)
				{
					System.out.println(position + "st");
				}
				else if((position > 10) && Integer.toString(position).charAt(Integer.toString(position).length()-1)=='2' & (position!=12)|| position ==2)
				{
					System.out.println(position + "nd");
				}
				else if((position > 10) && Integer.toString(position).charAt(Integer.toString(position).length()-1)=='3' & (position!=13) || position ==3)
				{
					System.out.println(position + "rd");
				} 
				else 
				{
					System.out.println(position + "th");

				}
			}
		}
	}

	public static int inputChecker(int maxRange) 
	{
		Scanner inputScanner = new Scanner(System.in);
		int input = 0 ;//= inputScanner.nextInt();
		boolean badInput = true;
		do
		{
			System.out.println("Enter your winning pup");
			try 
			{
				input = Integer.parseInt(inputScanner.nextLine());
				if(input>0 & input<=100)
				{
					badInput = false;
				}
				else
				{
					System.out.println("incorrect range must be between 1 and " + maxRange);
				}			
			}	
			catch (Exception ex) 
			{
				System.out.println("Please enter a valid pup");
			} 

		} while (badInput);
		return input;
	}
}
