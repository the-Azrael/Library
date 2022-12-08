public class UserSupplierReader implements Supplier, Reader {
    private String name;

    public UserSupplierReader(String name) {
        this.name = name;
    }

    @Override
    public void takeBook(Book book) {
        System.out.println(this.name + " берет книгу " + "\"" + book.toString() + "\"");
    }

    @Override
    public void returnBook(Book book) {
        System.out.println(this.name + " возвращает книгу " + "\"" + book.toString() + "\"");
    }

    @Override
    public void supply(Book book, Librarian librarian) {
        System.out.println(this.name + " поставляет книгу " + "\"" + book.toString() + "\""
                + " библиотекарю " + librarian.getName());
    }

    @Override
    public String getName() {
        return this.name;
    }
}
