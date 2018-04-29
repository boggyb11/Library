
public class Book extends Item{

	
	public Book(String Title, Genre genre) {
		setTitle(Title);
		setGenre(genre);
		setType("Book");
	}
	
	LibraryContent library = new LibraryContent();

	@Override
	public void checkIn(Item item,  PersonImpl person) {
		library.getLibContent().add(item);
	}
	@Override
	public void checkOut(Item item, PersonImpl person) {
		library.getLibContent().remove(item);
	}
	@Override
	public void AddItem(Item item) {
		library.getLibContent().add(item);
	}
	@Override
	public void RemoveItem(Item item) {
		library.getLibContent().remove(item);
	}
	@Override
	public void setTitle(String Title) {
		super.Title = Title;		
	}
	public void setGenre(Genre genre) {
		super.genre = genre;
	}
	public Genre getGenre() {
		return genre;
	}
	@Override
	public void setType(String itemType) {
		super.itemType = itemType;		
	}
}
