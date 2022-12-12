package library.borrowableitems;

import java.util.UUID;

public abstract class BorrowableItem {
    private String name;
    private UUID id;

    public BorrowableItem(String name) {
        this.name = name;
        id = UUID.randomUUID();
    }
}
