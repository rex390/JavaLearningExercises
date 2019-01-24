package LibraryExample;

public interface LibraryProcesses 
{
	void checkOut(RentableItem item);
	void checkIn(RentableItem item);
	void delete(RentableItem item);
	void update(RentableItem item);
	void addItem();
}
