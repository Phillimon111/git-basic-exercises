import java.time.LocalDate;
import java.time.LocalDateTime;

public class Gigasecond {
    private final LocalDateTime dateTime;

    // Constructor from LocalDate
    public Gigasecond(LocalDate moment) {
        this.dateTime = moment.atStartOfDay().plusSeconds(1_000_000_000L);
    }

    // Constructor from LocalDateTime
    public Gigasecond(LocalDateTime moment) {
        this.dateTime = moment.plusSeconds(1_000_000_000L);
    }

    // Getter for the calculated date-time
    public LocalDateTime getDateTime() {
        return dateTime;
    }
}