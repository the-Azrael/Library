public interface Librarian extends User {
    void orderBook(Book book, Supplier supplier);
    void acceptBook(Book book, Supplier supplier);
}