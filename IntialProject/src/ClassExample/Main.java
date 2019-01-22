package ClassExample;

public class Main {

	public static void main(String[] args) throws Exception 
	{
		Record record = new Record();
		record.intiliase();
		record.WriteData("test.txt");
		record.ReadData("test.txt");
	}

}
