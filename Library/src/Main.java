
public class Main {

	public static void main(String[] args) {
		
		PersonImpl P1 = new PersonImpl("Jeff", "CIA", 3);
		
		// add a person
		PersonList personList = new PersonList();
		personList.addPerson(P1);
		personList.printContent();
		
		//personList.DeletePerson(P1);
		//personList.printContent();
		
		LibraryContent Library = new LibraryContent();
		
		//adding a book to library
		Book B1 = new Book("How To Java", Genre.Non_Fiction);
		B1.AddItem(B1);
		
		Library.printContent();
		//B1.RemoveItem(B1);
		//Library.printContent();
		
		
		//personList.getPerson("Jeff").addItemsHeld( personList.getPerson("Jeff"), B1);
		//personList.getPerson("Jeff").getItemsHeld(personList.getPerson("Jeff"));
		
		//personList.getPerson("Jeff").returnItem(personList.getPerson("Jeff"), B1);
		//personList.getPerson("Jeff").getItemsHeld(personList.getPerson("Jeff"));
		
		
		Library.searchByGenre(Genre.Non_Fiction);
	}

}


/* 
 *need to be able to update items and people
 *implement ID system 
 *implement access level 
 *IO system for library contents
 * 
 */