
public class People 
{
	String name;
	int age;
	String jobTitle;
	
	People(String namePassed,int agePassed,String jobTitlePassed)
	{
		name= namePassed;
		age = agePassed;
		jobTitle = jobTitlePassed;
	}
	
	public String toString()
	{
		return ("This person is called " + name + " and he is age " + age + " and his job title is " + jobTitle);
	}
	
}
