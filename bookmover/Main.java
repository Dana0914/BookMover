package bookmover;

public class Main {
    public static void main(String[] args) {
        Book book = new Book("The Lord of the Rings");
        BookMover fromAvailableStatusMover = new fromAvailableStatusMover();
        fromAvailableStatusMover.moveToStatus(book, Status.OVERDUE);
        System.out.println(book.getStatus());

        BookMover fromArchivedStatusMover = new fromArchivedStatusMover();
        fromArchivedStatusMover.moveToStatus(book, Status.BORROWED);
        System.out.println(book.getStatus());
    }
}
