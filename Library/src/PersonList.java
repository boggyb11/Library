import java.util.ArrayList;

public class PersonList {
//////////////////////////////////Attributes////////////////////////////////////

	private static ArrayList<PersonImpl> PersonContent = new ArrayList<>();
	///////////////////////////////////////constructors//////////////////////////////////////

	/////////////////////////////////////////Methods///////////////////////////////////////////

	public ArrayList<PersonImpl> getPersonContent() {
		return PersonContent;
	}
	
	public void printContent() {
		for(PersonImpl person: PersonContent) {
			System.out.println(person);
		}
		if(PersonContent.isEmpty()) {
			System.out.println("No People In the list!!!!!");
		}
	}
	public void addPerson(PersonImpl person) {
		PersonContent.add(person);
	}
	public void DeletePerson(PersonImpl person) {
		PersonContent.remove(person);
	}
	public PersonImpl getPerson(String Name) {
		for(PersonImpl person : PersonContent) {
			if (person.getName() == Name) {
				return person;
			}
		}	
		return null;
	}
}
