package PaintWizard;

public class Main 
{
	public static void main(String[] args) 
	{		
		PaintWizard paintWizard = new PaintWizard();
		paintWizard.initialise();
		System.out.println(paintWizard.inputRoomSize(200));
	}

}
