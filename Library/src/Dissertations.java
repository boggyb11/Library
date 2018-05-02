
public class Dissertations extends Item{
//////////////////////////////////Attributes////////////////////////////////////

	private String Author;
	
	LibraryContent library = new LibraryContent();
	///////////////////////////////////////constructors//////////////////////////////////////

	public Dissertations(String Title, int AccessLevelRequired) {
		super(Title, AccessLevelRequired);
		setType("Dissertation");
		super.setID();

	
	}
	public Dissertations(String Title, int AccessLevelRequired, String Author) {
		super(Title, AccessLevelRequired);
		setType("Dissertation");
		this.Author=Author;
		//super.setID();

	}
	public Dissertations(String Title,String ItemType) {
		super(Title, ItemType);
		super.setAccessLevelRequired(2);
		super.setID();
	}

	/////////////////////////////////////////Methods///////////////////////////////////////////
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
//	@Override
//	public String toString() {
//		return "Dissertations [Autho)=" + getAuthor() + ", Titl)=" + getTitle() + ", ItemType="
//				+ getItemType() + ", AccessLevelRequire)=" + getAccessLevelRequired() + "ID: "+getID()+ "]";
//	}
	

}
