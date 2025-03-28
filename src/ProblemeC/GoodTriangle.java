package ProblemeC;

import java.io.*;

public class GoodTriangle {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("files/good.in.txt"));
            PrintWriter writer = new PrintWriter(new FileWriter("files/good.out.txt"));

            String firstLine = reader.readLine();
            if (firstLine == null) {
                System.out.println("Fichier d'entrée vide !");
                return;
            }

            int datasetCount = Integer.parseInt(firstLine.trim());

            for (int i = 1; i <= datasetCount; i++) {
                String line = reader.readLine();
                if (line == null) break;
                int n = Integer.parseInt(line.trim());

                long sum = 0;
                for (int k = 1; k <= n; k++) {
                    long Tk1 = (k + 1L) * (k + 2) / 2; 
                    sum += k * Tk1;
                }

                writer.println(i + " " + n + " " + sum);
            }

            reader.close();
            writer.close();
            System.out.println("Résultats enregistrés dans files/good.out");

        } catch (IOException | NumberFormatException e) {
            System.err.println("Erreur : " + e.getMessage());
        }
    }
}
