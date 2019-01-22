package GarageExample;

import java.util.ArrayList;

public class Garage 
{
	
	private ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle>();
	
	
	
	public void addVehicleToList(Vehicle newVehicle)
	{
		vehicleList.add(newVehicle);
	}
	
	public void removeVehicleFromListById(int idRemovedCar)
	{
		for(int listPosition = 0; listPosition < vehicleList.size(); listPosition++)
		{
			if(vehicleList.get(listPosition).getID() == idRemovedCar)
			{
				vehicleList.remove(listPosition);
			}
		}
	}
	
	public void removeVehiclesFromListByType(VehicleType typeToRemove)
	{
		for(int listPosition = 0; listPosition < vehicleList.size(); listPosition++)
		{
			if(vehicleList.get(listPosition).getType() == typeToRemove)
			{
				vehicleList.remove(listPosition);
			}
		}
	}
	
	public void removeVehicleFromListByIdAndVehicleType(int idRemovedCar,VehicleType typeToRemove)
	{
		for(int listPosition = 0; listPosition < vehicleList.size(); listPosition++)
		{
			if((vehicleList.get(listPosition).getType() == typeToRemove) & (vehicleList.get(listPosition).getID() == idRemovedCar))
			{
				vehicleList.remove(listPosition);
			}
		}
	}
	public void emptyGarage()
	{
		vehicleList.clear();
	}
	public void fixVehicles()
	{
		for(Vehicle vehicle : vehicleList)
		{
			calculateBill(vehicle);
		}
	}
	private int calculateBill(Vehicle vehicleToCalculate)
	{
		int defaultCharge = 100;
		switch(vehicleToCalculate.getType())
		{
			case  car: System.out.println("the bill for the id: "+ vehicleToCalculate.getID() + " which is a car came to a total of : " + (vehicleToCalculate.getDamagedParts() * 100 + defaultCharge) + " since it had " + vehicleToCalculate.getDamagedParts() + " damaged parts with a  default charge of " + defaultCharge );
				break;
			case motorcycle:System.out.println("the bill for the id: "+ vehicleToCalculate.getID() + " which is a motorcycle came to a total of : "  + (vehicleToCalculate.getDamagedParts() * 50 + defaultCharge) + " since it had " + vehicleToCalculate.getDamagedParts() + " damaged parts with a  default charge of " + defaultCharge);
				break;
		}
		return 0;
	}
	
}
