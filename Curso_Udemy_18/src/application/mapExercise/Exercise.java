package application.mapExercise;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Exercise {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insert full file path: ");
		
		String path = sc.next();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			
			Map<String, Integer> votes = new LinkedHashMap<>();
			
			String line = br.readLine();
			
			while(line != null) {
				String[] fields = line.split(",");
				String name = fields[0];
				Integer numberVotes = Integer.parseInt(fields[1]);
				if (votes.containsKey(name)) {
					int currentVotes = votes.get(name);
					numberVotes += currentVotes;
					votes.put(name, numberVotes);
				} else {
					votes.put(name, numberVotes);
				}
				line = br.readLine();
			}
			
			for (String key : votes.keySet()) {
				System.out.println(key + ": " + votes.get(key));
			}
			
			}catch (IOException e) {
				System.out.println("Error: " + e.getMessage());
		}
		
		sc.close();

	}

}
