package PaintWizard;

import java.util.ArrayList;

public class PaintWizard
{
	ArrayList<Paint> paintArrayList = new ArrayList<Paint>();
	
	public void initialise()
	{
		Paint paint = new Paint(19.99, 10,20,"CheapoMax");
		paintArrayList.add(paint);
		paint = new Paint(17.99, 11,15,"AverageJoes");
		paintArrayList.add(paint);
		paint = new Paint(25.00, 20,10,"DuluxurousPaints");
		paintArrayList.add(paint);		
	}
	
	public String inputRoomSize(int size)
	{
		Paint cheapestPaint = null;
		Paint leastPaintWasted = null;
		for(Paint paintItem:paintArrayList)
		{
			int coverage = paintItem.getCoveragePerLitre() * paintItem.getLitre(); 
			if(calculateRoomPriceByCheapest(paintItem,size,cheapestPaint,coverage))
			{
				cheapestPaint = paintItem;
			}			
			if(calculateWhatWastesTheLeast(paintItem,size,leastPaintWasted,coverage))
			{		
				leastPaintWasted = paintItem;
			}
			
		}
		if(cheapestPaint != null & leastPaintWasted != null)
		{
			return ("the cheapest paint is " + cheapestPaint.getName() + " and the paint that wasted the least is " + leastPaintWasted.getName());
		}
		else
		{
			return "no item was found";
		}

	}
	private boolean calculateRoomPriceByCheapest(Paint paintPassedIn,int size,Paint CheapestPaint,int coveragePassedIn)
	{		
		if(coveragePassedIn >= size)
		{
			if(CheapestPaint == null || CheapestPaint.getPrice() > paintPassedIn.getPrice() )
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}
	}
	
	private boolean calculateWhatWastesTheLeast(Paint paintPassedIn,int size,Paint leastPaintWasted,int coveragePassedIn)
	{

			int paintNeededToCoverRoom = size - (paintPassedIn.getCoveragePerLitre() * paintPassedIn.getLitre()) ;
			System.out.println(paintPassedIn.getName() + paintNeededToCoverRoom);
		
		if(coveragePassedIn >= size)
		{
			if(leastPaintWasted == null || (size - (leastPaintWasted.getCoveragePerLitre() * leastPaintWasted.getLitre()) < (size - coveragePassedIn)) )
			{
				if(size>=0)
				{
					return true;
				}
				else
				{
					return false;
				}
			}
			else
			{
				return false;
			}
		}
		else
		{
			return false;
		}	
		
	}
}
