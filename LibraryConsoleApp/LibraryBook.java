class LibraryBook {
    private String author;
    private String title;
    private String isbn;
    private String callNumber;

    public static int bookCount = 0;

    public LibraryBook() {
    }

    public LibraryBook(String author, String title, String isbn) {
        super();
        this.author = author;
        this.title = title;
        this.isbn = isbn;
    }

    public LibraryBook(String author, String title, String isbn, String callNumber) {
        super();
        this.author = author;
        this.title = title;
        this.isbn = isbn;
        this.callNumber = callNumber;
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

    public String getCallNumber() {
        return callNumber;
    }

    public void setCallNumber(String callNumber) {
        this.callNumber = callNumber;
    }

    @Override
    public String toString() {
        return "LibraryBook [author=" + author + ", title=" + title + ", isbn=" + isbn + ", callNumber=" + callNumber
                + "]";
    }

}