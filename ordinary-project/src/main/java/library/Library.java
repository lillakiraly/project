package library;

import library.borrowableitems.BorrowableItem;
import library.borrowableitems.borroweditems.BorrowedItem;
import library.users.User;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class Library {
    private Set<BorrowedItem> borrowedItems;
    private Set<BorrowableItem> borrowableItems;
    private Set<User> users;

    public Library(Set<BorrowedItem> borrowedItems, Set<BorrowableItem> borrowableItems, Set<User> users) {
        this.borrowedItems = borrowedItems;
        this.borrowableItems = borrowableItems;
        this.users = users;
    }

    public BorrowedItem getItemWithLongestOverdue() {
        return borrowedItems.stream().filter(BorrowedItem::isItemOverdue)
                .max(Comparator.comparingInt(BorrowedItem::getOverdueTime)).orElse(null);
    }
}
