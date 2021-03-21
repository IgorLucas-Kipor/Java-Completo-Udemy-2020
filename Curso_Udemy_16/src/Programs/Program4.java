package Programs;
import java.io.File;
import java.util.Scanner;

public class Program4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter folder path: ");
		
		String folderPath = sc.nextLine();
		
		File path = new File(folderPath);
		
		File[] folders = path.listFiles(File::isDirectory);
		
		System.out.println("Folders:");
		
		for (File folder : folders) {
			System.out.println(folder);
		}
		
		File[] files = path.listFiles(File::isFile);
		
		System.out.println("Files:");
		
		for (File file : files) {
			System.out.println(file);
		}
		
		boolean success = new File(folderPath + "\\Pasta Criada").mkdir();
		
		System.out.println("Directory created with success? "+success);
		
		sc.close();

	}

}
