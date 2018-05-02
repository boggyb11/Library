import java.util.ArrayList;
import java.util.LinkedList;

public class LibraryContent {
//////////////////////////////////Attributes////////////////////////////////////
	static LinkedList<Item> LibraryContent = new LinkedList<>();
	
	
	///////////////////////////////////////constructors//////////////////////////////////////
	
	
	/////////////////////////////////////////Methods///////////////////////////////////////////
	public LinkedList<Item> getLibContent() {
		return LibraryContent;
	}
	
	public void printContent() {
		for(Item items: LibraryContent) {
			System.out.println(items.toString());
		}
		if(LibraryContent.isEmpty()) {
			System.out.println("No Items in the Library!!!!!");
		}
	}
	public Item searchByGenre(Genre genre) {
		System.out.println(genre+ ": ");
		for(Item book: LibraryContent) {
			if (book.getItemType()== "Book") {
				ArrayList<Book>books = new ArrayList<>(); 
				for(Book b: books)
				{
					if(b.getGenre()==genre) {
						System.out.println(book.getTitle()+"\n");
						return book;
					}
				}
					
			}
		}
		return null;
	}
}