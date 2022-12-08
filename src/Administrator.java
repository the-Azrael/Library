public interface Administrator extends User {
    void giveBook(Book book, Reader reader);
    void takeBook(Book book, Reader reader);
    void overdueNotification(Reader reader);
}