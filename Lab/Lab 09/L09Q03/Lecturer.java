public class Lecturer extends PersonProfile {
    private String courseName;
    private String courseCode;
    private int semester;
    private int session;
    private int creditHour;
    private int studentsRegistered;

    public Lecturer(String name, String address, String email, String courseName, String courseCode, int session, int semester, int creditHour, int studentsRegistered) {
        super(name, address, email);
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.session = session;
        this.semester = semester;
        this.creditHour = creditHour;
        this.studentsRegistered = studentsRegistered;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nCourse Name: " + courseName +
                "\nCourse Code: " + courseCode +
                "\nSession: " + session +
                "\nSemester: " + semester +
                "\nCredit Hour: " + creditHour +
                "\nStudents Registered: " + studentsRegistered;
    }
}