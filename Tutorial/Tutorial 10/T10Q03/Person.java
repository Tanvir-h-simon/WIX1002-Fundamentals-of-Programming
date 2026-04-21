import java.lang.Comparable; // Pre-defined interface

public class Person implements Comparable<Person> { // Person objects are comparable to other Person objects
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void display() {
        System.out.println(name);
    }

    @Override
    public int compareTo(Person p) { // Pre-defined method
        return this.name.compareTo(p.name); // Compare two Person objects based on their names
    }
}