package GarageExample;

public class Main 
{

	public static void main(String[] args) 
	{		
		startDay();
	}

	public static void startDay()
	{
		Garage garage = new Garage();
		VehicleType type = VehicleType.car;
		Vehicle defaultVehicle ;
		for(int count = 0; count < 5; count++)
		{
			defaultVehicle = new Vehicle(count+1, type, count, count*2);
			garage.addVehicleToList(defaultVehicle);
			if(count%2 == 1)
			{
				type = VehicleType.car;
			}
			else
			{
				type = VehicleType.motorcycle;
			}
		}
		garage.removeVehicleFromListById(4);
		garage.fixVehicles();
	}
}
