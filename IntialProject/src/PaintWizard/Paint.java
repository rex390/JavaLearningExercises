package PaintWizard;

public class Paint 
{
	private String name;
	private double price;
	private int coveragePerLitre;
	private int litres;
	
	Paint(double pricePassedin, int coveragePerLitrePassedIn,int litresPassedIn,String namePassedIn)
	{
		price = pricePassedin;
		coveragePerLitre = coveragePerLitrePassedIn;
		litres = litresPassedIn;
		name = namePassedIn;
	}
	
	public double getPrice()
	{
		return price ;
	}
	public int getCoveragePerLitre()
	{
		return coveragePerLitre;
	}
	public int getLitre()
	{
		return litres;
	}
	public String getName()
	{
		return name;
	}
	
}
