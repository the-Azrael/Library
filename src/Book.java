class Book {
    private LibraryOnline libraryOnline = new LibraryOnline();
    private String title;
    private Author author;
    private String publisher;
    private int pageCount;
    private double price;
    private int discount;

    public Book(String title, Author author, String publisher, int pageCount) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.pageCount = pageCount;
    }

    public Book(String title, String authorName, String publisher, int pageCount) {
        this.title = title;
        this.author = new Author(authorName);
        this.publisher = publisher;
        this.pageCount = pageCount;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public double getCost() {
        return this.price - this.price * this.discount / 100;
    }

    public String toString() {
        String str =  "[ " + this.title + ", " + this.author.toString() + " ]";
        return str;
    }

    public void showBookInfo() {
        System.out.println("Библиотека: \t" + LibraryOnline.getLibraryName() + "\t" + LibraryOnline.getUrl());
        System.out.println("------------------------------------");
        System.out.println("Название: \t" + this.title);
        System.out.println("Автор: \t" + this.author.toString());
        System.out.println("Издатель: \t" + this.publisher);
        System.out.println("Страниц: \t" + this.pageCount);
        System.out.println("------------------------------------");
        System.out.println("Цена со скидкой: " + this.getCost() + "\n");
    }
}