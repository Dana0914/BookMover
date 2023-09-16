package bookmover;

public class fromBorrowedStatusMover extends BookMover {
    @Override
    protected void moveToStatus(Book book, Status requestStatus) {
        book.setStatus(Status.BORROWED);
        switch(requestStatus) {
            case AVAILABLE -> {
                System.out.println("Переход книги из статуса " + Status.BORROWED +
                        " в статус " + Status.AVAILABLE + " не возможен");
            }
            case ARCHIVED -> {
                moveToStatus(book, Status.BORROWED);
                System.out.println("Переход книги из статуса " + Status.BORROWED +
                        " в статус " + Status.ARCHIVED);
                book.setStatus(Status.ARCHIVED);
            }

            case OVERDUE -> {
                moveToStatus(book, Status.BORROWED);
                System.out.println("Переход книги из статуса " + Status.BORROWED +
                        " в статус " + Status.OVERDUE);
                book.setStatus(Status.OVERDUE);
            }
        }
    }
}
