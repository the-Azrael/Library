public class UserSupplier implements Supplier {
    private String name;

    public UserSupplier(String name) {
        this.name = name;
    }

    @Override
    public void supply(Book book, Librarian librarian) {
        System.out.println(this.name + " поставляет книгу "
                + book.toString() + " библиотекарю " + librarian.getName());
    }

    @Override
    public String getName() {
        return this.name;
    }
}
