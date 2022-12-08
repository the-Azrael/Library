public class Main {
    public static void main(String[] args) {
        Author dostoevsiyfmAutor = new Author("Достоевский Федор Михайлович");
        Author bulgakovmaAuthor = new Author("Булгаков Михаил Афанасьевич");
        Author sapkovskiaAuthor =  new Author("Сапковский Анджей");
        Book idiotBook = new Book("Идиот", dostoevsiyfmAutor, "Книга", 500);
        Book zapyskiBook = new Book("Записки юного врача", bulgakovmaAuthor,
                "Русская проза", 450);
        Book chasBook = new Book("Час презрения", sapkovskiaAuthor, "Дрофа", 380);

        UserLibrarian nadya = new UserLibrarian("Надя");
        UserSupplier tyoma = new UserSupplier("Тема");
        System.out.println(nadya.getName() + " и " + tyoma.getName());
        nadya.orderBook(idiotBook, tyoma);
        tyoma.supply(idiotBook, nadya);
        nadya.acceptBook(idiotBook, tyoma);

        UserLibrarianAdministarator masha = new UserLibrarianAdministarator("Маша");
        UserSupplierReader grisha = new UserSupplierReader("Гриша");
        System.out.println("\n" + masha.getName() + " и " + grisha.getName());
        masha.orderBook(zapyskiBook, grisha);
        grisha.supply(zapyskiBook, masha);
        grisha.takeBook(zapyskiBook);
        masha.giveBook(zapyskiBook, grisha);
        masha.overdueNotification(grisha);
        grisha.returnBook(zapyskiBook);
        masha.takeBook(zapyskiBook, grisha);

        UserReader kolya = new UserReader("Коля");
        System.out.println("\n" + kolya.getName() + " и " + masha.getName());
        masha.giveBook(chasBook, kolya);
        kolya.takeBook(chasBook);
        kolya.returnBook(chasBook);
        masha.takeBook(chasBook, kolya);
    }
}
