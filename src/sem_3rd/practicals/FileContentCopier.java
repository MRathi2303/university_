package sem_3rd.practicals;

import java.io.*;

public class FileContentCopier {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java FileContentCopier <source_file> <destination_file>");
            return;
        }

        String sourceFile = args[0];
        String destinationFile = args[1];
        int ampersandCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(destinationFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
                ampersandCount += line.chars().filter(ch -> ch == '&').count();
            }

            System.out.println("Content copied to " + destinationFile);
            System.out.println("Number of '&' in " + sourceFile + ": " + ampersandCount);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
