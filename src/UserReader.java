public class UserReader implements Reader {
    private String name;

    public UserReader(String name) {
        this.name = name;
    }

    @Override
    public void takeBook(Book book) {
        System.out.println(this.name + " берет книгу " + book.toString());
    }

    @Override
    public void returnBook(Book book) {
        System.out.println(this.name + " возвращает книгу " + book.toString());
    }

    @Override
    public String getName() {
        return this.name;
    }
}
