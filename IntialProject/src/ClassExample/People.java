package ClassExample;

public class People 
{
	private String name;
	private String occupation;
	private int age;
	
	People(String namePassedIn,String occupationPassedIn,int agePassedIn)
	{
		name = namePassedIn;
		occupation = occupationPassedIn;
		age = agePassedIn;
	}
	public String getPersonName()
	{
		return name;
	}
	public String getPersonOccupation()
	{
		return occupation;
	}
	public int getPersonAge()
	{
		return age;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setOccupation(String occupation)
	{
		this.occupation = occupation;
	}
	public void setAge(int age)
	{
		this.age = age;
	}

	
}
