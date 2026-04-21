public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setPhoneNumber("010-1234-5678");
        System.out.println(s1.getPhoneNumber());
        Student s2 = new Student("020-1234-5678");
        System.out.println(s2.getPhoneNumber());
    }
}