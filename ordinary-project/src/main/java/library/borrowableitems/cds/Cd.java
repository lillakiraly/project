package library.borrowableitems.cds;

import library.borrowableitems.BorrowableItem;

public class Cd extends BorrowableItem {
    private int numberOfTracks;

    public Cd(String name, int numberOfTracks) {
        super(name);
        this.numberOfTracks = numberOfTracks;
    }
}
