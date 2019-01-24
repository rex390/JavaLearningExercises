package ClassExample;

import java.util.ArrayList;
import Utility.ReadWrite;
public class Record 
{
	
	ArrayList<People> fileRecordToWrite = new ArrayList<People>();
	ArrayList<People> fileRecordToRead = new ArrayList<People>();
	
	public void intiliase(People personToAdd)
	{
		fileRecordToWrite.add(personToAdd);
	}
	
	
	public void WriteData(String filename,boolean addToFile)
	{	
		for(int count = 0 ; count < fileRecordToWrite.size();count++)
		{
			ReadWrite.WriteToFile(fileRecordToWrite.get(count).getPersonName(), filename, addToFile);
			addToFile = true;
			ReadWrite.WriteToFile(fileRecordToWrite.get(count).getPersonOccupation(), filename, addToFile);
			ReadWrite.WriteToFile(Integer.toString(fileRecordToWrite.get(count).getPersonAge()), filename, addToFile);
		}
	}
	
	public void ReadData(String filename) throws Exception
	{
		ArrayList<String> storedInformation =  ReadWrite.ReadDataAndReturnArrayList(filename);		
		WriteToArrayList(storedInformation);
		DisplayPeopleInfo();
	}
	public void WriteToArrayList(ArrayList<String> storedInformation)
	{
		int counter = 1;
		if(storedInformation.size()!=0)
		{
			System.out.println("Writing to data list started");
			People person = new People("", "", 0);
			for(String item: storedInformation)
			{		
				if(counter%3==0)
				{
					fileRecordToWrite.add(person);
					person = new People("", "", 0);				
				}
				person = addInfo(item,person,counter);
				counter++;
			}
			System.out.println("Writing to data list finished successfully");
			
		}
	}
	public People addInfo(String messageToAddToRecord, People personToEdit,int counter)
	{
		switch(counter%3)
		{
			case 1: personToEdit.setName(messageToAddToRecord);
			break;
			case 2: personToEdit.setOccupation(messageToAddToRecord);
			break;
			case 0: personToEdit.setAge(Integer.parseInt(messageToAddToRecord));
			break;
		}
		return personToEdit;
	}
	public void DisplayPeopleInfo()
	{
		if(fileRecordToWrite.size()>0)
		{
			for(People person:fileRecordToWrite)
			{
				System.out.println(person.toString());
			}
		}
	}
}
