class BookstoreBook {
    private String author;
    private String title;
    private String isbn;
    private String price;
    private boolean onSale;
    private int reductionPercentage;
    public static int bookCount = 0;

    public BookstoreBook() {
        super();
    }

    public BookstoreBook(String author, String title, String isbn) {
        super();
        this.author = author;
        this.title = title;
        this.isbn = isbn;
    }

    public BookstoreBook(String author, String title, String isbn, String price, boolean onSale,
                         int reductionPercentage) {
        super();
        this.author = author;
        this.title = title;
        this.isbn = isbn;
        this.price = price;
        this.onSale = onSale;
        this.reductionPercentage = reductionPercentage;
    }

    public String getauthor() {
        return author;
    }

    public void setauthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public boolean isOnSale() {
        return onSale;
    }

    public void setOnSale(boolean onSale) {
        this.onSale = onSale;
    }

    public int getReductionPercentage() {
        return reductionPercentage;
    }

    public void setReductionPercentage(int reductionPercentage) {
        this.reductionPercentage = reductionPercentage;
    }

    @Override
    public String toString() {
        return "BookstoreBook [author=" + author + ", title=" + title + ", isbn=" + isbn + ", price=" + price
                + ", onSale=" + onSale + ", reductionPercentage=" + reductionPercentage + "]";
    }

}