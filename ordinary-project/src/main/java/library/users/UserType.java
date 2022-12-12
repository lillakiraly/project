package library.users;

public enum UserType {
    LOCAL_RESIDENT(3, 7),
    STUDENT(5, 14);

    private int maxBorrowableItem;
    private int duration;

    UserType(int maxBorrowableItem, int duration) {
        this.maxBorrowableItem = maxBorrowableItem;
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }
}
