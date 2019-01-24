package ClassExample;

import Utility.InputCheckers;

public class WorkingWithFiles 
{
	WorkingWithFiles() throws Exception
	{
		InputCheckers inputChecker = new InputCheckers();
		People personToAdd = new People("","",0);
		Record record = new Record();
		boolean continueInput = true;
		while(continueInput)
		{
			record.intiliase(inputChecker.getInput(personToAdd));
			continueInput = inputChecker.continueInputting();
		}
		record.WriteData("test.txt",true);
		record.ReadData("test.txt");
	}
}
