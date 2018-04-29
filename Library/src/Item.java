
abstract public class Item {

	String Title;
	String itemType;
	public Genre genre;
	
	public abstract void setType(String itemType);
	public abstract void setTitle (String Title);
	abstract public void checkIn(Item item,  PersonImpl person);
	abstract public void checkOut(Item item,  PersonImpl person);
	abstract public void RemoveItem(Item item);
	public abstract void AddItem(Item item);
	
	
	
}
