
abstract public class Item {
//////////////////////////////////Attributes////////////////////////////////////
	static int IDCOUNT=0;
	private int ID = 0;
	private String Title;
	private String itemType;
	private int AccessLevelRequired;
	LibraryContent library = new LibraryContent();

	///////////////////////////////////////constructors//////////////////////////////////////
	public Item(String Title, int AccessLevelRequired) {
		this.Title=Title;
		this.AccessLevelRequired= AccessLevelRequired;
		setID();
	}
	
	public Item(String Title,String ItemType) {
		this.Title=Title;
		//this.AccessLevelRequired=AccessLevelRequired;
		this.itemType = ItemType;
		//this.ID = ID;
	}
	
	/////////////////////////////////////////Methods///////////////////////////////////////////
	public void setID() {
		this.ID = IDCOUNT;
		IDCOUNT++;
	}
	public int getID() {
		return ID;
	}
	
	public void setType(String itemType) {
		this.itemType = itemType;
	}
	
	public void setTitle(String Title) {
		this.Title = Title;			
	}
	
	public void checkIn(Item item, PersonImpl person) {
		library.getLibContent().add(item);		
	}
	
	public void checkOut(Item item, PersonImpl person) {
			RemoveItem(item);
	}
	
	public void RemoveItem(Item item) {
		for(Item items: library.getLibContent()) {
			if(items.Title==(item.Title))
				library.getLibContent().remove(items);
		}
	}
	public void AddItem(Item item) {
		library.getLibContent().add(item);		
	}
	
	public String getTitle() {
		return Title;
	}

	public String getItemType() {
		return itemType;
	}

	public void setItemType(String itemType) {
		this.itemType = itemType;
	}

	public int getAccessLevelRequired() {
		return AccessLevelRequired;
	}

	public void setAccessLevelRequired(int accessLevelRequired) {
		AccessLevelRequired = accessLevelRequired;
	}

	@Override
	public String toString() {
		return "Item, [Title=" + getTitle() + ", ItemType=" + getItemType() + ", AccessLevelRequired:"
				+ getAccessLevelRequired() + ", ID :"+ getID()+"]";
	}


}

	

