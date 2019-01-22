package ClassExample;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import PaintWizard.Paint;

public class Record 
{
	ArrayList<People> fileRecordToWrite = new ArrayList<People>();
	ArrayList<People> fileRecordToRead = new ArrayList<People>();
	
	public void intiliase()
	{
		People people =  new People("Bob","SpaceBoy",10);
		fileRecordToWrite.add(people);
		people = new People("Rob","Spaceman",20);
		fileRecordToWrite.add(people);
		people = new People("Jim","something",30);
		fileRecordToWrite.add(people);	
		people = new People("Tom","something 2",40);
		fileRecordToWrite.add(people);	
		people = new People("Tim","something 3",50);
		fileRecordToWrite.add(people);	
	}
	
	
	public void WriteData(String filename)
	{
		
		//character stream class to handle the character data
		BufferedWriter bufferWriter = null;
		FileWriter fileWriter = null;
		try
		{
			fileWriter = new FileWriter(filename);
			bufferWriter = new BufferedWriter(fileWriter);
			for(People peopleItem: fileRecordToWrite)
			{
				bufferWriter.write(peopleItem.getPersonName());
				bufferWriter.newLine();
				bufferWriter.write(peopleItem.getPersonOccupation());
				bufferWriter.newLine();
				bufferWriter.write(Integer.toString(peopleItem.getPersonAge()));
				bufferWriter.newLine();			
			}
			bufferWriter.write("end");
		}
		catch(IOException e) //if error is caught by the try method print the stack processes
		{
			e.printStackTrace();
			System.out.println("exception found ( could be no file)");
		}
		finally
		{
			try 
			{
				if(bufferWriter!=null)
				{
					bufferWriter.close();
				}
				if(fileWriter!=null)
				{
					fileWriter.close();
				}
			}
			catch(IOException e)
			{
				e.printStackTrace();
				System.out.println("exception found ( failed to close the filewriter and bufferwriter)");
			}
		}
	
	}
	
	public void ReadData(String filename) throws Exception
	{
		FileReader fileReader = new FileReader(filename);
		BufferedReader bufferReader = new BufferedReader(fileReader);
		//string()
		String container = "";
		People person = new People("","",0);
		int i = 1;
		while(fileRecordToRead.size() ==5)
		{
			container = bufferReader.readLine();	
			
			switch(i)
			{
			case 1: person.setName(container);
				break;
			case 2: person.setOccupation(container);
				break;
			case 3: 
				System.out.println(container);
				person.setAge(Integer.parseInt("10"));
				i =0;
				fileRecordToRead.add(person);
				person = new People("","",0); 
				break;
			}
			i++;
		}
		for(People personItem:fileRecordToRead)
		{
			System.out.println(personItem.getPersonName() + personItem.getPersonOccupation() + personItem.getPersonAge());
		}
	}
	


}
