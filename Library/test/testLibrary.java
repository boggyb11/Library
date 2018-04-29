import org.junit.Assert;
import org.junit.Test;


public class testLibrary{

	@Test
	public void testCheckOutItem() {
		PersonImpl P1 = new PersonImpl("James", "Student", 3);
		Dissertations D1 = new Dissertations("Java Fundamentals");
		Book B1 = new Book("Tales of Symphonia", Genre.Fiction);
		GovDoc Doc1 = new GovDoc("Trumps Wall");
		
		LibraryContent Library = new LibraryContent();
		Library.getLibContent().add(D1);
		Library.getLibContent().add(B1);
		Library.getLibContent().add(Doc1);
		
		P1.addItemsHeld(P1, D1);
	
		Assert.assertEquals(P1.personsList.get(0), D1);
		
	}
	@Test
	public void testCheckInItem() {
		
	}
	@Test
	public void testAddItem() {
		
	}
	@Test
	public void testRemoveItem() {
		
	}
	@Test
	public void testUpdateItem() {
		
	}
	@Test
	public void testRegisterPerson() {
		
	}
	@Test
	public void testDeletePerson() {
		
	}
	@Test
	public void testUpdatePerson() {
		
	}
}
