package LibraryExample;

import java.util.ArrayList;
import java.util.List;

import Utility.InputCheckers;

public class LibrarySystem implements LibraryProcesses
{
	enum type {Book,Magazine,Journal};
	List<RentableItem> itemList;
	InputCheckers inputCheckers ;
	LibrarySystem()
	{
		itemList = new ArrayList<RentableItem>();
		inputCheckers = new InputCheckers();
		addItem();	
	}	
	@Override
	public void checkOut(RentableItem item) 
	{
		
		
	}

	@Override
	public void checkIn(RentableItem item) 
	{
		
		
	}
	@Override
	public void delete(RentableItem item) 
	{

		
	}

	@Override
	public void update(RentableItem item) 
	{
		
		
	}

	@Override
	public void addItem() 
	{
		boolean loopProcess = true;
		
		while(loopProcess)
		{
			inputCheckers.GetStringInput("name");
			loopProcess = inputCheckers.continueInputting();
			//setup(inputCheckers.getIntInputIntFormat("", (-1), 3));
		}
	}
	
	private void setup(int value)
	{
		switch(value)
		{
		case 0:
			//book
		break;

		}
	}
	
	public List<RentableItem> getList()
	{		
		return itemList;
	}

}
