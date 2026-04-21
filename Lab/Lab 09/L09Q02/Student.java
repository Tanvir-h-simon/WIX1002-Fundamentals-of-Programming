import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Student extends PersonProfile {
    String courseName;
    String courseCode;
    int semester;
    String session;
    int mark;
    File file = new File("data/course.txt");

    Student(String courseName, String courseCode, int semester, String session, int mark) {
        super("Tanvir Hossain",
                "Male",
                "1 June, 2003");
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.semester = semester;
        this.session = session;
        this.mark = mark;
    }

    public String getGrade (int mark) {
        String grade = "";
        try (Scanner scan = new Scanner(new FileReader(file))) {
            // FileReader reader = new FileReader(file);
            // Scanner scan = new Scanner(reader);
            scan.nextLine(); // Skip the header
            while (scan.hasNextLine()) {
                String line = scan.nextLine().trim();
                String[] parts = line.split("\\s+");
                String operator = parts[0];
                int threshold = Integer.parseInt(parts[1]);
                if (operator.equals(">=") && mark >= threshold) {
                    grade = parts[2];
                    break;
                } else if (operator.equals("<") && mark < threshold) {
                    grade = parts[2];
                    break;
                }
            }
            // scan.close();
            // reader.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return grade;
    }
}