import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {
        Person[] names = new Person[5]; // Array of Person objects (Generic class type)

        names[0] = new Person("John");
        names[1] = new Person("Jane");
        names[2] = new Person("Bob");
        names[3] = new Person("Alice");
        names[4] = new Person("Charlie");

        Arrays.sort(names);

        System.out.println("Sorted Names (Ascending):");
        for (Person p : names) {
            p.display();
        }
    }
}