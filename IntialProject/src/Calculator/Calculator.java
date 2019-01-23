package Calculator;
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
	
	public void checkRelation(float... numberPassed)
	{
		for(int numberPicked1 = 0 ; numberPicked1 < numberPassed.length ; numberPicked1++)
		{
			for(int numberPicked2 = 0 ; numberPicked2 < numberPassed.length ; numberPicked2++)
			{				
				if(numberPicked1 != numberPicked2)
				{
					float sumAdd = add(numberPassed[numberPicked1],numberPassed[numberPicked2]);
 					float sumSub = subtract(numberPassed[numberPicked1],numberPassed[numberPicked2]);
 					float sumDiv = divide(numberPassed[numberPicked1],numberPassed[numberPicked2]);
 					float sumMul = multiply(numberPassed[numberPicked1],numberPassed[numberPicked2]);
					for(int findLast = 0 ; findLast <numberPassed.length;findLast++)
					{
						if(findLast != numberPicked1 & findLast != numberPicked2)
						{
							if(sumAdd == numberPassed[findLast])
							{
								System.out.println(numberPassed[numberPicked1] + " + " + numberPassed[numberPicked2] 
										+  " = " + numberPassed[findLast]);
							}
							if(sumSub == numberPassed[findLast])
							{
								System.out.println(numberPassed[numberPicked1] + " - " + numberPassed[numberPicked2] 
										+  " = " + numberPassed[findLast]);
							}
							if(sumDiv == numberPassed[findLast])
							{
								System.out.println(numberPassed[numberPicked1] + " / " + numberPassed[numberPicked2] 
										+  " = " + numberPassed[findLast]);
							}
							if(sumMul == numberPassed[findLast])
							{
								System.out.println(numberPassed[numberPicked1] + " * " + numberPassed[numberPicked2] 
										+  " = " + numberPassed[findLast]);
							}
						}
					}
				}
			}
		}		
	}	
}