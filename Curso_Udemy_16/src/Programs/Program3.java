package Programs;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Program3 {

	public static void main(String[] args) {
		
		String lines[] = new String[] {"Good morning", "Good afternoon", "Good night"};
		
		String path = "E:\\Arquivos do Igor\\Cursos Udemy\\Java Completo\\Se��o 17 - Trabalhando com Arquivos\\write.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
