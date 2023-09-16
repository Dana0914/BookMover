package bookmover;

public class fromArchivedStatusMover extends BookMover {
    @Override
    protected void moveToStatus(Book book, Status requestStatus) {
        book.setStatus(Status.ARCHIVED);
        switch(requestStatus) {
            case AVAILABLE -> {
                moveToStatus(book, Status.ARCHIVED);
                System.out.println("Переход книги из статуса " + Status.ARCHIVED +
                        " в статус " + Status.AVAILABLE);
                book.setStatus(Status.AVAILABLE);
            }
            case BORROWED ->
                    System.out.println("Переход книги из статуса " + Status.ARCHIVED +
                            " в статус " + Status.BORROWED + " не возможен");

            case OVERDUE ->
                    System.out.println("Переход книги из статуса " + Status.ARCHIVED +
                            " в статус " + Status.OVERDUE + " не возможен");
        }
    }
}
