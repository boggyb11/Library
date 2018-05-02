import java.util.Date;

public class GovDoc extends Item{
//////////////////////////////////Attributes////////////////////////////////////

	private Date date;
	LibraryContent library = new LibraryContent();
	///////////////////////////////////////constructors//////////////////////////////////////

	public GovDoc(String Title, int AccessLevelRequired) {
		super(Title, AccessLevelRequired);
		super.setType("Government_Document");
		super.setID();
		
	}
	public GovDoc(String Title, int AccessLevelRequired, Date date) {
		super(Title, AccessLevelRequired);
		super.setType("Government_Document");
		this.date=date;
		//super.setID();
		
	}
	public GovDoc(String Title,String ItemType) {
		super(Title, ItemType);
		super.setAccessLevelRequired(4);
		super.setID();
	}
	/////////////////////////////////////////Methods///////////////////////////////////////////

	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
//	@Override
//	public String toString() {
//		return "GovDoc [Date=" + getDate() + ", Title=" + getTitle() + ", ItemType=" + getItemType()
//				+ ", AccessLevelRequired=" + getAccessLevelRequired() +  "ID: "+getID()+"]";
//	}
	
}
