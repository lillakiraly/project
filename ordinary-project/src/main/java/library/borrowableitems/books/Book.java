package library.borrowableitems.books;

import library.borrowableitems.BorrowableItem;

public class Book extends BorrowableItem {
    private int numberOfPages;
    private BookType bookType;

    public Book(String name, int numberOfPages, BookType booktype) {
        super(name);
        this.numberOfPages = numberOfPages;
        this.bookType = booktype;
    }
}
