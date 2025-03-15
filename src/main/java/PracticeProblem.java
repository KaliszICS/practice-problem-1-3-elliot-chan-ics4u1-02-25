import java.io.*; //required to open files in java
import java.util.ArrayList;

public class PracticeProblem {

	public static void main(String args[]) {
		System.out.println(readFile("file2.txt"));
	}
	public static String readFile(String fileName) {
		BufferedReader inputStream = null;
		String text = "";
		try {
			inputStream = new BufferedReader(new FileReader(fileName));
			
			int character = 0;
			while((character = inputStream.read()) != -1) {
				text+=(char) character;
				
			}
		}catch(IOException e) {
			e.printStackTrace();			
		}
		finally {
			try {
				if(inputStream != null)
					inputStream.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
			
		}
		return text; 
	}
	public static String backwardsReadFile(String fileName) {
		BufferedReader inputStream = null;
		ArrayList<Character> array = new ArrayList<Character>();
		try {
			inputStream = new BufferedReader(new FileReader(fileName));
			
			int character = 0;
			while((character = inputStream.read()) != -1) {
				array.add((char) character);
				
			}
		}catch(IOException e) {
			e.printStackTrace();			
		}
		finally {
			try {
				if(inputStream != null)
					inputStream.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
			
		}
		String text = "";
		for(int i = array.size() - 1; i >= 0; i--)
			text+=array.get(i);
		return text; 
	}
	//Ask kalisz how to do this faster
	

}
