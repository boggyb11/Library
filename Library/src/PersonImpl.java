import java.util.ArrayList;

public class PersonImpl implements Person {

	String Name;
	String Occupation;
	int ItemsHeld;
	int AccessLevel;
	ArrayList<Item> personsList;
	
	PersonList personList = new PersonList();
	
	PersonImpl(String Name, String Occupation, int AccessLevel){
		this.Name= Name;
		this.Occupation = Occupation;
		this.AccessLevel = AccessLevel;
		personsList = new ArrayList<>();
	}
	@Override
	public void setName(String Name) {
		this.Name =Name;		
	}
	@Override
	public String getName() {
		return Name;
	}
	@Override
	public void setOccupation(String Occupation) {
		this.Occupation = Occupation;
	}
	@Override
	public String getOccupation() {
		return Occupation;
	}
	@Override
	public void addItemsHeld(PersonImpl person, Item item ) {
		item.checkOut(item, person);
		person.personsList.add(item);
	}
	@Override
	public void returnItem(PersonImpl person, Item item) {
		item.checkIn(item, person);
		person.personsList.add(item);
	}
	@Override
	public ArrayList<Item> getItemsHeld(PersonImpl person) {
		for(Item item: person.personsList) {
			System.out.println(person.Name+" Has these Items : "+"[Title: " + item.Title + "] ");
		}
		if(person.personsList.isEmpty()) {
			System.out.println(person.Name + " Has no items");
		}
		return person.personsList;
	}
	@Override
	public void setAccessLevel(int AccessLevel) {
		this.AccessLevel = AccessLevel;		
	}
	@Override
	public int getAccessLevel() {
		return AccessLevel;
	}
	@Override
	public String toString() {
		return "PersonImpl [Name=" + Name + ", Occupation=" + Occupation + ", ItemsHeld=" + ItemsHeld + ", AccessLevel="
				+ AccessLevel + "]";
	}
}
