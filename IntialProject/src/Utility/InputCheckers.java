package Utility;

import java.util.Scanner;

import ClassExample.People;

public class InputCheckers 
{
	Scanner inputScanner;
	public InputCheckers()
	{
		inputScanner = new Scanner(System.in);
	}
	public Boolean continueInputting()
	{
		int input = 0;
		boolean badInput = true;
		do
		{
			System.out.println("Do you want to continue adding more data:");
			System.out.println("1 = Yes, 2 = No ");		
			try 
			{
				input = Integer.parseInt(inputScanner.nextLine());
				if(input>0 & input<=2)
				{
					badInput = false;
				}
				else
				{
					System.out.println("incorrect range must be between 1 and 2");
				}			
			}	
			catch (Exception ex) 
			{
				System.out.println("Please enter a number");
			} 

		} while (badInput);
		return (input ==1? true: false);
	}
	public  People getInput(People personToAdd)
	{
		String input = "" ;
		personToAdd = new People("","",0);
		boolean badInput = true;
		do
		{
			//get input from user
			System.out.println("Enter  the name.");
			input = inputScanner.nextLine(); 
			if((TestInputString(input))) //get the first information (name) and test it if not a blank info
			{
				//get input from user
				personToAdd.setName(input); 
				System.out.println("Enter the occupation.");
				input = inputScanner.nextLine();
				if(TestInputString(input)) //repeat the process with the occupation
				{
					//get input from user
					personToAdd.setOccupation(input);
					System.out.println("Enter the age.");
					input = inputScanner.nextLine();
					if(TestInputInteger(input,0))//get the last input and test it is a integer and its greater than 0
					{
						personToAdd.setAge(Integer.parseInt(input));
						System.out.println(personToAdd.getPersonAge());
						badInput = false;
					}
				}
			}
		} while (badInput);
		return personToAdd;
	}
	
	public String GetStringInput(String requiredData)
	{
		String input = "" ;
		boolean badInput = true;
		do
		{
			//get input from user
			System.out.println(requiredData);
			input = inputScanner.nextLine(); 
			if((TestInputString(input))) //get the first information (name) and test it if not a blank info
			{
				badInput = false;
			}
		} while (badInput);
		return input;
	}
	
	
	public String GetIntInput(String requiredData,int minRange)
	{
		String input = "" ;
		boolean badInput = true;
		do
		{
			//get input from user
			System.out.println(requiredData);
			input = inputScanner.nextLine(); 
			if(TestInputInteger(input,minRange))//get the last input and test it is a integer and its greater than 0
			{
				badInput = false;
			}
		} while (badInput);
		return input;
	}
	public String GetIntInput(String requiredData,int minRange,int maxRange)
	{
		String input = "" ;
		boolean badInput = true;
		do
		{
			//get input from user
			System.out.println(requiredData);
			input = inputScanner.nextLine(); 
			if(TestInputInteger(input,minRange,maxRange))//get the last input and test it is a integer and its greater than 0
			{
				badInput = false;
			}
		} while (badInput);
		return input;
	}
	
	public int getIntInputIntFormat(String requiredData,int minRange,int maxRange)
	{
		return Integer.parseInt(GetIntInput(requiredData, minRange, maxRange));
	}
	
	public  boolean TestInputString(String testing)
	{
		if(!testing.equals(""))
		{
			return true;
		}
		else
		{
			System.out.println("please enter in information");
			return false;
		}
	}
	
	public  boolean TestInputInteger(String testing, int minRange)
	{
		try 
		{
			int i = Integer.parseUnsignedInt(testing); //parse the string as a unsigned int so we don't get negative numbers
			return i > minRange? true: false;	 //terminally condition to make sure the value 	is greater than 0
		}
		catch (Exception ex) 
		{
			System.out.println("invalid value");
			return false;
		} 
	}
	
	public  boolean TestInputInteger(String testing, int minRange, int maxRange)
	{
		try 
		{
			int i = Integer.parseUnsignedInt(testing); //parse the string as a unsigned int so we don't get negative numbers
			return ((i > minRange) & (i < maxRange)) ? true: false;	 //terminally condition to make sure the value 	is greater than 0
		}
		catch (Exception ex) 
		{
			System.out.println("invalid value");
			return false;
		} 
	}
	public void closeScanner()
	{
		inputScanner.close();
	}
}
