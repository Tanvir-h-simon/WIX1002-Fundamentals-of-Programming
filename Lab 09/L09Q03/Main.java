import java.io.BufferedReader;
import java.io.FileReader;
import java.lang.String;

public class Main {
    public static void main(String[] args) {
        String[][] lecturers = {{"John", "123 Main St", "john@gmail.com"}, {"Alice", "456 Oak Ave", "alice@gmail.com"},
                                {"Bob", "789 Pine Rd", "bob@gmail.com"}, {"James", "898 Palm Rd", "james@gmail.com"}};
        // String name = "John";
        // String address = "123 Main St";
        // String email = "john@gamil.com";

        // PersonProfile profile = new PersonProfile(name, address, email);
        // System.out.println(profile);
        try {
            // File file = new File("data/lecturer.txt");
            // FileReader reader = new FileReader(file);
            // BufferedReader br = new BufferedReader(reader);
            BufferedReader br = new BufferedReader(new FileReader("data/lecturer.txt"));

            String line;
            int index = 0;

            while ((line = br.readLine()) != null) {
                String courseCode = line; // Line 1
                String courseName = br.readLine(); // Line 2
                int session = Integer.parseInt(br.readLine()); // Line 3
                int semester = Integer.parseInt(br.readLine()); // Line 4
                int creditHour = Integer.parseInt(br.readLine()); // Line 5
                int studentsRegistered = Integer.parseInt(br.readLine()); // Line 6

                if (studentsRegistered >= 150) {
                    creditHour *= 3;
                } else if (studentsRegistered >= 100) {
                    creditHour *= 2;
                } else if (studentsRegistered >= 50) {
                    creditHour = (int)(creditHour * 1.5);
                } else {
                    creditHour *= 1;
                }

                String name = lecturers[index][0];
                String address = lecturers[index][1];
                String email = lecturers[index][2];

                Lecturer l = new Lecturer(name, address, email, courseName, courseCode, session, semester, creditHour, studentsRegistered);
                System.out.println(l.toString());
                System.out.println();

                index++;

                // Lecturer l1 = new Lecturer(name, address, email, courseName, courseCode, session, semester, creditHour, studentsRegistered);
                // System.out.println(l1.toString());
                // System.out.println("Hello");
                // System.out.println("Hello".toString());

                // System.out.println();

                // Lecturer l2 = new Lecturer ("James", "898 Palm Rd", "james@gmail.com", courseName, courseCode, session, semester, creditHour, studentsRegistered);
                // System.out.println(l2.toString());
                // System.out.println(l2);
                // System.out.println();
            }
        } catch (Exception e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}