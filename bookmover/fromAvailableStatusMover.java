package bookmover;

public class fromAvailableStatusMover extends BookMover {
    @Override
    protected void moveToStatus(Book book, Status requestStatus) {
        book.setStatus(Status.AVAILABLE);
        switch(requestStatus) {
            case ARCHIVED -> {
                moveToStatus(book, Status.AVAILABLE);
                System.out.println("Переход книги из статуса " + Status.AVAILABLE +
                        " в статус " + Status.ARCHIVED);
                book.setStatus(Status.ARCHIVED);
            }
            case BORROWED -> {
                moveToStatus(book, Status.AVAILABLE);
                System.out.println("Переход книги из статуса " + Status.AVAILABLE +
                        " в статус " + Status.BORROWED);
                book.setStatus(Status.BORROWED);
            }
            case OVERDUE -> System.out.println("Переход книги из статуса " + Status.AVAILABLE +
                    " в статус " + Status.OVERDUE + " не возможен");
        }
    }
}
