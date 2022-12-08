public class UserLibrarian implements Librarian {
    private String name;

    public UserLibrarian(String name) {
        this.name = name;
    }

    @Override
    public void orderBook(Book book, Supplier supplier) {
        System.out.println(this.name + " заказывает книгу " + book.toString()
                + " поставщику " + supplier.getName());
    }

    @Override
    public void acceptBook(Book book, Supplier supplier) {
        System.out.println(this.name + " принимает книгу " + book.toString()
                + " от поставщика " + supplier.getName());
    }

    @Override
    public String getName() {
        return this.name;
    }
}
