import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFromFile {
	BufferedReader br = null;
	String line;
	
	public void read() {
	

			try {
				br= new BufferedReader( new FileReader("LibFile.txt"));
				while((line = br.readLine()) != null) {
					System.out.println(line);
					String[] LibItems = line.split(",");
					switch(LibItems[3]) {
					case " ItemType=Book":{
						Item newItem= new Book(LibItems[1], LibItems[2]);
						LibraryContent.LibraryContent.add(newItem);

					}
					}
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		finally {
			if(br!=null)
				
				try {
					br.close();
				}
				catch (IOException e) {
					e.printStackTrace();
				}
		}
		
	}
}


//Item newItem= new Book(LibItems[1], LibItems[2], LibItems[3],LibItems[4]);
//LibraryContent.LibraryContent.add(newItem);
//System.out.println(newItem);