
public class Main {

	public static void main(String[] args) 
	{
		int firstNumber = 10;
		int secondNumber = 15;
		Boolean condition = true;
		Calculator calc = new Calculator();
		People person = new People("bob",20,"nothing");
		ForLoops forLoops = new ForLoops();
		IntermediateExercise intermediate = new IntermediateExercise();
		//Additive
		int total = Calculator.add(firstNumber,secondNumber);
		String outputMesage = "The sum of " + firstNumber + " & " + secondNumber + " is: " + total;
		printMesaage(outputMesage);
		
		//Subtract	
		total = calc.substract(firstNumber,secondNumber);
		outputMesage = "The substraction of " + firstNumber + " & " + secondNumber + " is: " + total;		
		printMesaage(outputMesage);
		
		//Conditionals
		total = calc.conditionals(firstNumber, secondNumber, condition);
		outputMesage = "the values passed in were " + firstNumber + " & " + secondNumber + " and the boolean was " + condition + " so the total is: " + total;
		printMesaage(outputMesage);
		printMesaage("");
		
		//conditionals and for loops
		forLoops.conditional();
		
		//array and for loops
		forLoops.forLoopAndArray();
		printMesaage("");
		
		//blackjack below
		printMesaage("black jack below");
		printMesaage(Integer.toString(intermediate.blackJack(firstNumber, secondNumber)));		
		printMesaage("");
		
		//unique sum
		printMesaage("unique sum below");
		printMesaage(Integer.toString(intermediate.uniqueSum(3,3, 3)));		
		printMesaage("");
		
		//Too Hot example
		printMesaage("Too Hot example below");
		printMesaage("the temperature is hot: " + intermediate.tooHot(110, true));		
		printMesaage("");
		
		//People Example
		printMesaage("People example below");
		printMesaage(person.toString());
		printMesaage("");
		
		//People Example array
		printMesaage("People array example below");
		People[] peopleArray = new People[5];
		for(int iter = 0; iter < peopleArray.length;iter++)
		{
			peopleArray[iter] = new People("bob" + iter,10*iter,"jobTitle" + iter);
			printMesaage(peopleArray[iter].toString());
		}
		printMesaage("");
		
		//People search example
		printMesaage("People search example below");
		String nameToSearch = "bob4";
		for(int iter = 0; iter < peopleArray.length;iter++)
		{
			if(searchName(peopleArray[iter],nameToSearch)==true)
			{
				printMesaage(" he was found and this is the info " + peopleArray[iter].toString());
			}
			else
			{
				printMesaage(" failed to find " + nameToSearch );
			}
		}	
		printMesaage("");
		
	}
	
	
	public static void printMesaage(String message)
	{
		System.out.println(message);		
	}
	
	public static Boolean searchName(People personPassedIn,String nameToSearch)
	{
		if(personPassedIn.name.equals(nameToSearch))
		{
			return true;
		}
		return false;
	}
}
