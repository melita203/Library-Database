public class Book extends Resource {
    private String author;
    private int numPages;

    /**
     * Constructor to initialize a book resource.
     *
     * @param title      Title of the book.
     * @param publisher  Publisher of the book.
     * @param year       Year of publication.
     * @param electronic Indicates if the book is electronic.
     * @param numCopies  Total number of copies available.
     * @param author     Author of the book.
     * @param numPages   Number of pages in the book.
     */
    public Book(String title, String publisher, int year, boolean electronic, int numCopies, String author,
            int numPages) {
        super(title, publisher, year, electronic, numCopies);
        this.author = author;
        this.numPages = numPages;
    }

    /**
     * Override the toString() method to return a formatted book description.
     *
     * @return A formatted string representing the book.
     */

    @Override
    public String toString() {
        return author + ", " + title + ", " + year + ", " + numPages;
    }

}
