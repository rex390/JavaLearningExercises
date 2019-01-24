package Utility;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import ClassExample.People;

public class ReadWrite {

	public static void WriteToFile(String messageToWrite,String pathway,Boolean addToFile)
	{
		//character stream class to handle the character data
		BufferedWriter bufferWriter = null;
		FileWriter fileWriter = null;
		try
		{			
			fileWriter = new FileWriter(pathway,addToFile);
			bufferWriter = new BufferedWriter(fileWriter);
			bufferWriter.write(messageToWrite);	
			bufferWriter.newLine();
			
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
	
	public static ArrayList<String> ReadDataAndReturnArrayList(String filename) throws Exception 
	{
		ArrayList<String> info = new ArrayList<String>();
		if(CheckFileExists(filename))
		{
			System.out.println("File found");
			FileReader fileReader = new FileReader(filename);
			BufferedReader bufferReader = new BufferedReader(fileReader);
			String container = bufferReader.readLine();
			System.out.println("Reading begin");
			while(container!=null)
			{				
				System.out.println(container);
				info.add(container);
				container = bufferReader.readLine();
			}
			System.out.println("Reading finished");
		}
		else
		{
			System.out.println("file not found");
		}
		return info;
	}
	
	public static void ReadData(String filename) throws Exception 
	{
		if(CheckFileExists(filename))
		{
			System.out.println("File found");
			FileReader fileReader = new FileReader(filename);
			BufferedReader bufferReader = new BufferedReader(fileReader);
			String container = bufferReader.readLine();
			System.out.println("Reading begin");
			while(container!=null)
			{
				System.out.println(container );
				container = bufferReader.readLine();
				
			}
			System.out.println("Reading finished");
		}
		else
		{
			System.out.println("file not found");
		}
	}
	public static boolean CheckFileExists(String filename)
	{
		File file = new File(filename);
		return file.exists()?true:false;
	}
}
