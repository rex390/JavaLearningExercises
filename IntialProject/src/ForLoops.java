
public class ForLoops 
{
	int[] intArray = {1,2,3,4,5,6,7,8,9,10};
	public void conditional()
	{
		int total;
		String outputMessage;
		Boolean condition = true;
		
		Calculator calc = new Calculator();
		//for loops
		printMesaage("for loop using array is below");
		for(int iter =0;iter<10;iter++)
		{
			total = calc.conditionals(iter, intArray[iter], condition);
			outputMessage = "the values passed in were " + iter + " & " + intArray[iter] + " and the boolean was " + condition + " so the total is: " + total;
			printMesaage(outputMessage);
		}
	}
	
	public void forLoopAndArray()
	{
		//populate array values with a for loop
		printMesaage("");
		printMesaage("using for loop to populate array");
		int[] intPopulateArray = new int[5];
		for(int iter=1;iter<intPopulateArray.length;iter++)
		{
			intPopulateArray[iter]=iter;
			printMesaage("the iterator was " + iter + " value is " + Integer.toString(intPopulateArray[iter]));		
		}
		//multiple each array value by 10
		printMesaage("");
		printMesaage("multiple each array value by 10 below");
		for(int iter=1;iter<intPopulateArray.length;iter++)
		{
			intPopulateArray[iter] = intPopulateArray[iter] * 10;
			printMesaage("the iterator was " + iter + " and the value was multiplied by 10 to become " + Integer.toString(intPopulateArray[iter]));		
		}
	}
	
	public void printMesaage(String message)
	{
		System.out.println(message);		
	}
}
