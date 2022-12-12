package library.borrowableitems.borroweditems;

import library.borrowableitems.BorrowableItem;
import library.users.User;

import java.time.LocalDate;
import java.time.Period;
import java.util.UUID;

import static java.time.temporal.ChronoUnit.DAYS;

public class BorrowedItem {
    private BorrowableItem item;
    private User user;
    private LocalDate dateOfBorrow;
    private LocalDate dateOfReturn;

    public BorrowedItem(BorrowableItem item, User user) {
        this.item = item;
        this.user = user;
        dateOfBorrow = LocalDate.now();
    }

    public void returnItem() {
        dateOfReturn = LocalDate.now();
    }

    public int getOverdueTime() {
        if (dateOfReturn == null) {
            LocalDate expectedReturn = dateOfBorrow.plusDays(user.daysToReturn());
            if (LocalDate.now().isBefore(expectedReturn)) {
                return 0;
            } else {
                int overdueDays = (int) DAYS.between(expectedReturn, LocalDate.now());
                return overdueDays;
            }
        }
        return 0;
    }

    public boolean isItemOverdue() {
//        TODO
        // note: this method is unnecessary since the getOverdueTime return 0 is this method's false return
        return false;
    }
}
