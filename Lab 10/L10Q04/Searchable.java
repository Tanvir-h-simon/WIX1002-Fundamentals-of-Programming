import java.time.LocalDate;
import java.time.LocalTime;

public interface Searchable {
    public boolean search(LocalDate date, LocalTime startTime, LocalTime endTime);
}