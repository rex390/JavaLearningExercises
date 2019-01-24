package LibraryExample;

public abstract class RentableItem 
{
	private String name;
	private boolean rentedOut = false;
	private int rentPeriod;
	private static int counter =0;
	public RentableItem(String name, boolean rentedOut, int rentPeriod) 
	{
		super();
		this.name = name;
		this.rentedOut = false;
		this.rentPeriod = rentPeriod;
		counter++;
	}
	public static int getCounter() 
	{
		return counter;
	}
	public static void setCounter(int counter) 
	{
		RentableItem.counter = counter;
	}
	public String getName() 
	{
		return name;
	}
	public boolean isRentedOut() 
	{
		return rentedOut;
	}
	public void setRentedOut(boolean rentedOut) 
	{
		this.rentedOut = rentedOut;
	}
	public int getRentPeriod() 
	{
		return rentPeriod;
	}

	
}
