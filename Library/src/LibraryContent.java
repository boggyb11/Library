import java.util.ArrayList;

public class LibraryContent {

	private static ArrayList<Item> LibraryContent = new ArrayList<>();
	
	public ArrayList<Item> getLibContent() {
		return LibraryContent;
	}
	public void printContent() {
		for(Item items: LibraryContent) {
			System.out.println("[Title: " + items.Title + "] ");
		}
		if(LibraryContent.isEmpty()) {
			System.out.println("No Items in the Library!!!!!");
		}
	}
	public Item searchByGenre(Genre genre) {
		System.out.println(genre+ ": ");
		for(Item book: LibraryContent) {
			if (book.genre== genre) {
					System.out.println(book.Title+"\n");
					return book;
			}
		}
		return null;
	}
}