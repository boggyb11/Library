import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class StoreToFile {

	public void storeAll() {

		BufferedWriter bw=null;
		
	try {
		File file = new File("LibFile.txt");
		FileWriter fw = new FileWriter(file);	
		bw= new BufferedWriter(fw);
	
		for(Item item : LibraryContent.LibraryContent) { //loop through array list 
			bw.write(item.toString()+"\n"); // convert array list to string then write to file
		}
	
	}
	catch(IOException ioe) {
			ioe.printStackTrace();
		}
	finally{
		
		try{
			if (bw!=null) {
				bw.close();
			}
		}
			catch(Exception ex) { //catch exceptions for this
				System.out.println("Error with Buffered Writer");
			}
			
	}
	}
}
