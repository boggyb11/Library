
public class Book extends Item{

	//////////////////////////////////Attributes////////////////////////////////////
	
	LibraryContent library = new LibraryContent();
	private Genre genre;

	///////////////////////////////////////constructors//////////////////////////////////////

	public Book(String Title, int AccessLevelRequired) {
		super(Title, AccessLevelRequired);
		setType("Book");
		super.setID();

	}
	public Book(String Title, int AccessLevelRequired, Genre genre) {
		super(Title, AccessLevelRequired);
		setType("Book");

		this.genre= genre;
		//super.setID();

	}
	public Book(String Title,String ItemType) {
		super(Title, ItemType);
		super.setAccessLevelRequired(0);
		super.setID();
	}
	/////////////////////////////////////////Methods///////////////////////////////////////////

	public void setGenre(Genre genre) {
		this.genre = genre;
	}
	public Genre getGenre() {
		return genre;
	}
//	@Override
//	public String toString() {
//		return "Book [Genre=" + getGenre() + ", Title=" + getTitle() + ", ItemType=" + getItemType()
//				+ ", AccessLevelRequired=" + getAccessLevelRequired() + "ID: "+getID()+"]";
//	}
	
}
