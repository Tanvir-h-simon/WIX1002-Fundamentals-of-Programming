import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.time.LocalDate;
import java.time.LocalTime;

public class Appointment implements Searchable {
    // LocalDate day;
    // LocalDate month;
    // LocalDate year;
    LocalDate date;
    LocalTime startTime;
    LocalTime endTime;

    // Input date and time in integer format
    Appointment(int day, int month, int year, int startHour, int endHour) {
        date = LocalDate.of(year, month, day);
        startTime = LocalTime.of(startHour, 0);
        endTime = LocalTime.of(endHour, 0);
    }

    public boolean search(LocalDate d, LocalTime st, LocalTime et) {
        // if (date.equals(d) && startTime.equals(st) && endTime.equals(et)) {
        //     return true;
        // }
        // return false;
        return date.equals(d) && startTime.equals(st) && endTime.equals(et);
    }

    public boolean isAvailable() {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("data/appointment.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split("\\s+");

                LocalDate appointmentDate = LocalDate.parse(data[0]);
                LocalTime appointmentStartTime = LocalTime.parse(data[1]);
                LocalTime appointmentEndTime = LocalTime.parse(data[2]);

                if (date.equals(appointmentDate) && startTime.isBefore(appointmentEndTime) && endTime.isAfter(appointmentStartTime)) {
                    reader.close();
                    return false;
                }
            }
            reader.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        return true;
    }

    public void savedAppointment() {
        try {
            File file = new File("data/appointment.txt");
            FileWriter writer = new FileWriter(file, true);
            writer.write(date + " " + startTime + " " + endTime + "\n");
            writer.close();
        } catch (Exception e) {
            System.out.println("Error writing file: " + e.getMessage());
        }
    }
}