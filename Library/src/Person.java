import java.util.ArrayList;

public interface Person {
	
	public void setName(String Name);
	public String getName();
	
	public void setOccupation(String Occupation);
	public String getOccupation();
	
	public void returnItem(PersonImpl person, Item item);
	public void addItemsHeld(PersonImpl person, Item item);
	public ArrayList<Item> getItemsHeld(PersonImpl person);
	
	public void setAccessLevel(int AccessLevel);
	public int getAccessLevel();
	
}
