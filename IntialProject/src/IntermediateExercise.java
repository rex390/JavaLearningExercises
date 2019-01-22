
public class IntermediateExercise 
{

	public int blackJack(int firstNumber,int secondNumber)
	{
		if(firstNumber >21 & secondNumber >21)
		{
			return 0;
		}
		if(firstNumber > secondNumber)
		{
			return firstNumber;
		}
		else
		{
			return secondNumber;
		}
	}
	public int uniqueSum(int firstNumber,int secondNumber,int thirdNumber)
	{
		int total=0;
		if(firstNumber != secondNumber & firstNumber != thirdNumber)
		{	
			total += firstNumber;
		}
		if(secondNumber != thirdNumber & secondNumber!=firstNumber)
		{
			total += secondNumber;
		}
		if(thirdNumber != firstNumber )
		{
			total += thirdNumber;
		}
		return total;
	}
	public Boolean tooHot(int temperature,Boolean isSummer)
	{
		if(isSummer)
		{
			if(temperature>= 60 & temperature <=100)
			{
				return true;
			}
		}
		else
		{
			if(temperature>= 60 & temperature <=90)
			{
				return true;
			}
		}
		return false;
	}
	
	
}
