import java.util.Scanner;
// import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;

import java.io.IOException;


class L07Q01 {
    public static void main(String[] var0) {

        writeCourse();

        Scanner input = new Scanner(System.in);

        System.out.print("Enter course code: ");
        String courseCode = input.nextLine().trim().toUpperCase();

        readCourse(courseCode);

        input.close();
    }

    public static void writeCourse() {
        try {
            // File file = new File("data/coursename.dat");
            // FileWriter writer = new FileWriter(file);
            FileWriter writer = new FileWriter("data/coursename.dat");
            writer.write("Course Code,Course Name\n");
            writer.write("WXES1116,Programming I\n");
            writer.write("WXES1115,Data Structure\n");
            writer.write("WXES1110,Operating System\n");
            writer.write("WXES1112,Computing Mathematics I");

            writer.close();

            System.out.println("File created successfully.");

        } catch (IOException e) {
            System.out.print("Error: " + e.getMessage());
        }
    }

    public static void readCourse(String courseCode) {
        boolean found = false;

        if (courseCode == null) {
            System.out.println("Course code not found.");
            return;
        }

        try {
            // File file = new File("data/coursename.dat");
            // FileReader reader = new FileReader(file);
            FileReader reader = new FileReader("data/coursename.dat");
            Scanner fileScanner = new Scanner(reader);

            // Skip header line
            if (fileScanner.hasNextLine()) {
                fileScanner.nextLine();
            }

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                String[] data = line.split(",");

                String code = data[0];
                String name = data[1];

                if (code.equals(courseCode)) {
                    System.out.print("Course Name: " + name);
                    found = true;
                    break;
                }
            }

            fileScanner.close();

            if (!found) {
                System.out.print("Course code not found.");
            }

        } catch (FileNotFoundException e) {
            System.out.print("File was not found");
        }
    }
}