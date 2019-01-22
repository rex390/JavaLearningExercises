package GarageExample;


enum VehicleType{car,motorcycle}
public class Vehicle 
{
	
	private int wheels;
	private int damagedParts;
	private int id;
	private VehicleType type;
	Vehicle(int wheelsPassedIn,VehicleType typesPassedIn,int idPassed, int damagedPartsPassedIn)
	{
		wheels = wheelsPassedIn;
		type = typesPassedIn;
		id = idPassed;
		damagedParts = damagedPartsPassedIn;
	}
	public VehicleType getType()
	{
		return type;
	}
	public int getWheels()
	{
		return wheels;
	}
	public int getID()
	{
		return id;
	}
	public int getDamagedParts()
	{
		return damagedParts;
	}
	
	public void SetVehicle(int wheelsPassedIn,VehicleType typesPassedIn,int idPassed, int damagedPartsPassedIn)
	{
		wheels = wheelsPassedIn;
		type = typesPassedIn;
		id = idPassed;
		damagedParts = damagedPartsPassedIn;
	}
	
}
