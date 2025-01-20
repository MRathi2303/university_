package sem_3rd.practicals;

import java.util.*;


public class Student_Rank_Tracker {

    // Record class for storing student data
    static class Record {
        private String name;
        private int rank;

        public Record(String name, int rank) {
            this.name = name;
            this.rank = rank;
        }

        public String getName() {
            return name;
        }

        public int getRank() {
            return rank;
        }
    }

    // Class to manage and analyze student rankings
    static class Rank {
        private ArrayList<Record> records = new ArrayList<>();

        // Read student details
        public void readValues() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the number of students: ");
            int n = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            for (int i = 0; i < n; i++) {
                System.out.print("Name of student " + (i + 1) + ": ");
                String name = scanner.nextLine();
                System.out.print("Rank of student " + (i + 1) + ": ");
                int rank = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                records.add(new Record(name, rank));
            }
        }

        // Display all records
        public void display() {
            System.out.println("\nStudent Records:");
            for (Record record : records) {
                System.out.println("Name: " + record.getName() + ", Rank: " + record.getRank());
            }
        }

        // Display the student with the highest rank
        public void highest() {
            if (records.isEmpty()) {
                System.out.println("No records available.");
                return;
            }

            Record topStudent = records.get(0);
            for (Record record : records) {
                if (record.getRank() < topStudent.getRank()) {
                    topStudent = record;
                }
            }

            System.out.println("\nTopmost Rank:\nName: " + topStudent.getName() + ", Rank: " + topStudent.getRank());
        }
    }

    // Main method
    public static void main(String[] args) {
        Rank rank = new Rank();
        rank.readValues();
        rank.display();
        rank.highest();
    }
}
