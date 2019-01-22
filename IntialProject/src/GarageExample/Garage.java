package GarageExample;

import java.util.ArrayList;

public class Garage 
{
	private ArrayList<Vehicle> vehicleList = new ArrayList();
	
	
	
	public void addVehicleToList(Vehicle newVehicle)
	{
		vehicleList.add(newVehicle);
	}
	public void removeVehicleFromList(Vehicle vehicleToRemove)
	{
		vehicleList.add(vehicleToRemove);
	}
	public void emptyGarage()
	{
		vehicleList.clear();
	}
	public int calculateBill(Vehicle vehicleToCalculate)
	{
		//vehicleToCalculate.
		return 0;
	}
}
