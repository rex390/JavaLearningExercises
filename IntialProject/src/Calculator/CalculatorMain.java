package Calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class CalculatorMain 
{
	public static void main(String[] args) 
	{
		Calculator calc = new Calculator();	
		ArrayList<Float> floatList = attempt();
		calc.checkRelation(floatList);
	}	

	public static ArrayList attempt()
	{
		Scanner inputScanner = new Scanner(System.in);
		boolean badInput = false;
		ArrayList<Float> floatList = new ArrayList<Float>();
		do
		{
			System.out.println("input your numbers");			

			String s = inputScanner.nextLine();
			String[] chars = s.split(" ");
			try 
			{
				for(String character:chars)
				{
					float i = Float.parseFloat(character);
					floatList.add(i);	
					badInput = false;
				}		
			}	
			catch (Exception ex) 
			{
				badInput = true;
			} 

		} while (badInput);
		
		return floatList;
	}
}
