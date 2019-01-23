package Calculator;

import java.util.ArrayList;

public class Calculator 
{
	
	public float add(float intArg,float intArg2)
	{	
		return (intArg + intArg2);
	}
	public float multiply(float intArg,float intArg2)
	{	
		return (intArg * intArg2);
	}
	public float divide(float intArg,float intArg2)
	{	
		return (intArg / intArg2);
	}
	public float subtract(float intArg,float intArg2)
	{	
		return (intArg - intArg2);
	}
	
	public void checkRelation(ArrayList<Float> numberPassed)
	{
		for(int numberPicked1 = 0 ; numberPicked1 < numberPassed.size() ; numberPicked1++)
		{
			for(int numberPicked2 = 0 ; numberPicked2 < numberPassed.size() ; numberPicked2++)
			{				
				if(numberPicked1 != numberPicked2)
				{
					float sumAdd = add(numberPassed.get(numberPicked1),numberPassed.get(numberPicked2));
 					float sumSub = subtract(numberPassed.get(numberPicked1),numberPassed.get(numberPicked2));
 					float sumDiv = divide(numberPassed.get(numberPicked1),numberPassed.get(numberPicked2));
 					float sumMul = multiply(numberPassed.get(numberPicked1),numberPassed.get(numberPicked2));
					for(int findLast = 0 ; findLast <numberPassed.size();findLast++)
					{
						if(findLast != numberPicked1 & findLast != numberPicked2)
						{
							if(sumAdd == numberPassed.get(findLast))
							{
								System.out.println(numberPassed.get(numberPicked1) + " + " + numberPassed.get(numberPicked2) 
										+  " = " + numberPassed.get(findLast));
							}
							if(sumSub == numberPassed.get(findLast))
							{
								System.out.println(numberPassed.get(numberPicked1) + " - " + numberPassed.get(numberPicked2) 
								+  " = " + numberPassed.get(findLast));
							}
							if(sumDiv == numberPassed.get(findLast))
							{
								System.out.println(numberPassed.get(numberPicked1) + " / " + numberPassed.get(numberPicked2) 
								+  " = " + numberPassed.get(findLast));
							}
							if(sumMul == numberPassed.get(findLast))
							{
								System.out.println(numberPassed.get(numberPicked1) + " * " + numberPassed.get(numberPicked2) 
								+  " = " + numberPassed.get(findLast));
							}
						}
					}
				}
			}
		}		
	}	
}