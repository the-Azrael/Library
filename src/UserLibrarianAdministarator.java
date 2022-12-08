public class UserLibrarianAdministarator extends UserLibrarian implements Administrator {
    public UserLibrarianAdministarator(String name) {
        super(name);
    }

    @Override
    public void giveBook(Book book, Reader reader) {
        System.out.println(this.getName() + " выдыет книгу "
                +  book.toString()  + " читателю " + reader.getName());
    }

    @Override
    public void takeBook(Book book, Reader reader) {
        System.out.println(this.getName() + " принимает книгу "
                + book.toString() + " от " + reader.getName());
    }

    @Override
    public void overdueNotification(Reader reader) {
        System.out.println(this.getName() + " уведомляет о задолженности " + reader.getName());
    }
}
