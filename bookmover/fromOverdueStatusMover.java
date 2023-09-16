package bookmover;

public class fromOverdueStatusMover extends BookMover {
    @Override
    protected void moveToStatus(Book book, Status requestStatus) {
        book.setStatus(Status.OVERDUE);
        switch (requestStatus) {
            case AVAILABLE -> {
                moveToStatus(book, Status.OVERDUE);
                System.out.println("Переход книги из статуса " + Status.OVERDUE +
                        " в статус " + Status.AVAILABLE);
                book.setStatus(Status.AVAILABLE);
            }
            case ARCHIVED -> {
                moveToStatus(book, Status.OVERDUE);
                System.out.println("Переход книги из статуса " + Status.OVERDUE +
                        " в статус " + Status.ARCHIVED);
                book.setStatus(Status.ARCHIVED);
            }
            case BORROWED -> System.out.println("Переход книги из статуса " + Status.OVERDUE +
                    " в статус " + Status.BORROWED + " не возможен");

        }
    }
}
