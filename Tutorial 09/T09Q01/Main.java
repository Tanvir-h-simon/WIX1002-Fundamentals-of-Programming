class Person {
    String name; // Instance variable

    Person(String name) {
        this.name = name;
    }
}

class Student extends Person {
    String matricId;
    String dept;

    public Student(String name, String matricId, String email, int age, String dept) {
        super(name);
        this.matricId = matricId;
        this.dept = dept;
    }
}

class Teacher extends Person {
    String id;
    String faculty;

    public Teacher(String name, String id, String faculty) {
        super(name);
        this.id = id;
        this.faculty = faculty;
    }
}

// Class that contains static methods
class Checker {
    // Compare class types
    public static boolean compare(Student s, Teacher t) {
        return s.getClass().equals(t.getClass());
    }
    public static boolean compare(Student s1, Student s2) {
        return s1.getClass().equals(s2.getClass());
    }

    // Check if Student descendent of Person
    public static boolean isClass(Student s) {
        return s instanceof Person;
    }
    public static boolean isClass(Teacher t) {
        return t instanceof Person;
    }
}

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("John", "123456789", "", 20, "Computer Science");
        Student s2 = new Student("Jack", "234354546", "", 21, "Artificial Intelligence");
        Teacher t1 = new Teacher("Jane", "987654321", "Computer Science");

        if (Checker.compare(s1, t1)) {
            System.out.println("Same class.");
        } else {
            System.out.println("Different class.");
        }

        if (Checker.compare(s1, s2)) {
            System.out.println("Same class.");
        } else {
            System.out.println("Different class.");
        }

        System.out.println();

        if (Checker.isClass(s1)) {
            System.out.println("Student is a descendant of Person.");
        } else {
            System.out.println("Student is NOT a descendant of Person.");
        }
        if (Checker.isClass(t1)) {
            System.out.println("Student is a descendant of Person.");
        } else {
            System.out.println("Student is NOT a descendant of Person.");
        }
    }
}