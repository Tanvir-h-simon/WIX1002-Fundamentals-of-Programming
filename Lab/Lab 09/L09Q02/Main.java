import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter course name: ");
        String courseName = input.nextLine();

        System.out.print("Enter course code: ");
        String courseCode = input.nextLine();

        System.out.print("Enter semester: ");
        int semester = input.nextInt();
        input.nextLine(); // Consume a newline character

        System.out.print("Enter session: ");
        String session = input.nextLine();

        System.out.print("Enter mark: ");
        int mark = input.nextInt();

        Student student = new Student(courseName, courseCode, semester, session, mark);

        System.out.println("\n--- Student Profile ---");
        System.out.println("Name    : " + student.name);
        System.out.println("Gender  : " + student.gender);
        System.out.println("DOB     : " + student.dob);
        System.out.println("Course  : " + student.courseName + " (" + student.courseCode + ")");
        System.out.println("Semester: " + student.semester);
        System.out.println("Session : " + student.session);
        System.out.println("Mark    : " + student.mark);
        System.out.println("Grade   : " + student.getGrade(mark));
    }
}