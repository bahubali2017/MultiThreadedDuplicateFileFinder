package duplicatefinder;

import java.io.IOException;
import java.util.Scanner;

public class DuplicateFinder {
	public static void main(String args[]) {
		
		try {
			System.out.println("Please enter the searchPath ");
			Scanner in = new Scanner(System.in);
			String searchPath = in.nextLine();
			System.out.println("Please enter the outputPath ");
			String outputPath = in.nextLine();
			System.out.println("Please enter the threadPoolSize ");
			Integer threadPoolSize = in.nextInt();
			
			SearchDuplicate findDuplicateFile= new SearchDuplicate(searchPath, outputPath, threadPoolSize);
			//findDuplicateFile.findDuplicates(dir);
		} catch (SearchException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
