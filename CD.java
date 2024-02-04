public class CD extends Resource {
    private String artist;
    private int length;

    /**
     * Constructor to initialize a CD resource.
     *
     * @param title     Title of the CD.
     * @param publisher Publisher of the CD.
     * @param year      Year of publication.
     * @param numCopies Total number of copies available.
     * @param artist    Artist of the CD.
     * @param length    Length of the CD in minutes.
     */
    public CD(String title, String publisher, int year, int numCopies, String artist, int length) {
        super(title, publisher, year, false, numCopies); // CDs are not electronic
        this.artist = artist;
        this.length = length;

    }

    /**
     * Override the toString() method to return a formatted CD description.
     *
     * @return A formatted string representing the CD.
     */
    @Override
    public String toString() {
        return artist + ", " + title + ", " + year + ", " + length;

    }

}
