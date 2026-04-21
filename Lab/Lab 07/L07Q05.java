import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

class Person {
    String name;
    int age;
    char gender;

    Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}

public class L07Q05 {
    public static void main(String[] args) {
        ArrayList<Person> list = new ArrayList<>();

        try {
            FileInputStream file = new FileInputStream("data/person.dat");
            ObjectInputStream ois = new ObjectInputStream(file);  // Skips the 6-byte header
            DataInputStream in = new DataInputStream(ois);

            // Read the total number of records
            int total = in.readInt();

            // Read each record
            for (int i = 0; i < total; i++) {
                String name = in.readUTF();
                int age = in.readInt();
                char gender = in.readChar();

                // Person p = new Person(name, age, gender);
                // list.add(p);
                list.add(new Person(name, age, gender));
            }

            in.close();

            // Sort by name (ascending)
            Collections.sort(list, new Comparator<Person>() {
                public int compare(Person p1, Person p2) {
                    return p1.name.compareToIgnoreCase(p2.name);
                }
            });

            System.out.printf("%-20s %-5s %-10s%n", "Name", "Age", "Gender");
            for (Person p : list) {
                String g = (p.gender == 'M') ? "Male" : "Female";
                System.out.printf("%-20s %-5d %-10s%n", p.name, p.age, g);
            }

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}