import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Day (1-31): ");
        int day = input.nextInt();

        System.out.print("Month (1-12): ");
        int month = input.nextInt();

        System.out.print("Year (e.g. 2024): ");
        int year = input.nextInt();

        System.out.print("Start hour (0-23): ");
        int startHour = input.nextInt();

        System.out.print("End hour (0-23): ");
        int endHour = input.nextInt();

        Appointment appointment = new Appointment(day, month, year, startHour, endHour);

        if (appointment.isAvailable()) {
            appointment.savedAppointment();
            System.out.println("Appointment available, and saved.");
        } else {
            System.out.println("This date/time is not available.");
        }

        input.close();
    }
}