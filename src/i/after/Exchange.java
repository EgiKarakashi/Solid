package i.after;

import java.time.LocalDateTime;

public interface Exchange {
    void checkIn();
    void checkOut(String borrower);
    LocalDateTime getDueDate();
}
