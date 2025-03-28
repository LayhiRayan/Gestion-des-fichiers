package ProblemeA;

import java.io.*;
import java.util.*;

public class OpposedNumbers {
	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("files/in.txt"));
			PrintWriter writer = new PrintWriter(new FileWriter("files/out.txt"));

			int N = Integer.parseInt(reader.readLine());
			String[] tokens = reader.readLine().split(" ");
			Set<Integer> all = new HashSet<>();
			Set<Integer> result = new HashSet<>();

			for (int i = 0; i < N; i++) {
				int x = Integer.parseInt(tokens[i]);
				if (all.contains(-x)) {
					result.add(Math.abs(x));
				}
				all.add(x);
			}

			writer.println(result.size());
			reader.close();
			writer.close();
			System.out.println(" Résultat écrit dans files/out.txt");

		} catch (IOException e) {
			System.err.println(" Erreur : " + e.getMessage());
		}
	}
}
