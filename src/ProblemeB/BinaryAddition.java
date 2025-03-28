package ProblemeB;

import java.io.*;

public class BinaryAddition {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("files/bin.in.txt"));
            PrintWriter writer = new PrintWriter(new FileWriter("files/bin.out.txt"));

            String line = reader.readLine();
            if (line == null) {
                System.out.println(" Le fichier est vide.");
                return;
            }

            int N = Integer.parseInt(line.trim());

            for (int i = 1; i <= N; i++) {
                String[] parts = reader.readLine().trim().split(" ");
                String a = parts[0];
                String b = parts[1];
                String result = addBinary(a, b);
                writer.println(i + " " + result);
            }

            reader.close();
            writer.close();
            System.out.println(" Résultats enregistrés dans files/bin.out");

        } catch (IOException | NumberFormatException e) {
            System.err.println(" Erreur : " + e.getMessage());
        }
    }

    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();
        int i = a.length() - 1, j = b.length() - 1, carry = 0;

        while (i >= 0 || j >= 0 || carry == 1) {
            int sum = carry;
            if (i >= 0) sum += a.charAt(i--) - '0';
            if (j >= 0) sum += b.charAt(j--) - '0';
            result.append(sum % 2);
            carry = sum / 2;
        }

        return result.reverse().toString();
    }
}
