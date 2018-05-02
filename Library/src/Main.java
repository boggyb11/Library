
public class Main {

	public static void main(String[] args) {
		Item B1 = new Book("Programming", 0);
		Book B2 = new Book("How To Java",0, Genre.Non_Fiction);
		Book B3 = new Book("How To C#",0, Genre.Non_Fiction);
		Book B4 = new Book("How To Python",0, Genre.Non_Fiction);
		LibraryContent.LibraryContent.add(B1);
		LibraryContent.LibraryContent.add(B2);
		LibraryContent.LibraryContent.add(B3);
		LibraryContent.LibraryContent.add(B4);
		StoreToFile stf = new StoreToFile();
		stf.storeAll();
		
		ReadingFromFile reading = new ReadingFromFile();
		reading.read();
		
		LibraryContent Library = new LibraryContent();
		Library.printContent();
		
	}

}

