import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;


public class testLibrary{
	
	LibraryContent Library = new LibraryContent();
	
		Item B1 = new Book("Tales of Symphonia",0, Genre.Fiction);
	@Test	
	public void testAddItem() {
		Item B1 = new Book("Tales of Symphonia",0, Genre.Fiction);
		Library.getLibContent().add(B1);
		Assert.assertEquals(true, Library.getLibContent().contains(B1));
	}
	@Test
	public void testRemoveItem() {
		
		B1.RemoveItem(B1);
		Assert.assertEquals(false, Library.getLibContent().contains(B1));
	}
	@Test
	public void testCheckOutItem() {
		PersonImpl P1 = new PersonImpl("James", "Student", 3);
		Dissertations D1 = new Dissertations("Java Fundamentals", 1);
		Library.getLibContent().add(D1);
		P1.addItemsHeld(P1, D1);
		Assert.assertEquals(true, P1.personsList.contains(D1));
	}
	@Test
	public void testCheckInItem() {
		PersonImpl P2 = new PersonImpl("John", "Student", 3);
		Dissertations D2 = new Dissertations("Java Advanced", 2);
		P2.addItemsHeld(P2, D2);
		P2.returnItem(P2, D2);
		Assert.assertEquals(true, P2.personsList.isEmpty() );
		Assert.assertEquals(true, Library.getLibContent().contains(D2));
	}
	
	@Test
	public void testUpdateItem() {
		Dissertations D3 = new Dissertations("C# beginners guide", 1);
		
		D3.setTitle("C# Advanced guide");
		Assert.assertEquals(D3.getTitle(), "C# Advanced guide");
	}
	@Test
	public void testRegisterPerson() {
		ArrayList<PersonImpl> PersonContent = new ArrayList<>();
	PersonImpl P3 = new PersonImpl("Benny", "Teacher", 3);
	PersonContent.add(P3);
	Assert.assertEquals(P3, PersonContent.get(0));
		
	}
	@Test
	public void testDeletePerson() {
		ArrayList<PersonImpl> PersonContent = new ArrayList<>();
		PersonImpl P4 = new PersonImpl("Rhys", "Jogger", 1);
		PersonContent.add(P4);
		PersonContent.remove(P4);
		Assert.assertEquals(true, PersonContent.isEmpty());
	}
	@Test
	public void testUpdatePerson() {
		ArrayList<PersonImpl> PersonContent = new ArrayList<>();
		PersonImpl P4 = new PersonImpl("Rhys", "Jogger", 1);
		PersonContent.add(P4);
		P4.setName("Jonny");
		Assert.assertEquals("Jonny", P4.getName());
	}

}
