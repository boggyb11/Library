
public class GovDoc extends Item{

	LibraryContent library = new LibraryContent();

	public GovDoc(String Title) {
		setType("Government_Document");
		setTitle(Title);
	}
	@Override
	public void setType(String itemType) {
		super.itemType = itemType;
	}
	@Override
	public void setTitle(String Title) {
		super.Title = Title;			
	}
	@Override
	public void checkIn(Item item, PersonImpl person) {
		library.getLibContent().add(item);		
	}
	@Override
	public void checkOut(Item item, PersonImpl person) {
		if(person.AccessLevel>=5) {
			library.getLibContent().remove(item);
		}
		else System.out.println(" ACCESS DENIED ");
	}
	@Override
	public void RemoveItem(Item item) {
		library.getLibContent().remove(item);		
	}
	@Override
	public void AddItem(Item item) {
		library.getLibContent().add(item);		
	}
}