public abstract class Resource {
    // Instance variables to store resource information
    public String title;
    public String publisher;
    public int year;
    public boolean electronic;
    public int numCopies;
    public int numAvailable;
    public String[] borrowers;

    // Constructor to initialize resource attributes
    public Resource(String title, String publisher, int year, boolean electronic, int numCopies) {
        this.title = title;
        this.publisher = publisher;
        this.year = year;
        this.electronic = electronic;
        this.numCopies = numCopies;
        this.numAvailable = numCopies; // initially all copies are available
        this.borrowers = new String[numCopies]; // Initialize the borrowers array
    }

    // Getter forr the title of teh resource
    public String getTitle() {
        return title;
    }

    // Getter for the publisher of the resource
    public String getPublisher() {
        return publisher;
    }

    // Getter for the list of borrowers
    public String[] getBorrowers() {
        return borrowers;
    }

    // Check if the resource is electronic
    public boolean isElectronic() {
        return electronic;
    }

    // Check if the resource is available
    public boolean isAvailable() {
        return numAvailable > 0;
    }

    // Check if the resource is currently borrowed by a specific person
    public boolean isBorrowedBy(String person) {
        // Loop through borrowers to check if the person is listed
        for (String borrower : borrowers) {
            if (borrower != null && borrower.equals(person)) {
                return true;
            }
        }
        return false; // Person not found in borrowers array
    }

    // Override the toString() method to return title and year as a string
    @Override
    public String toString() {
        return title + ", " + year;
    }

    // check ou the resource to a borrower
    public boolean checkOut(String borrower) {
        // Check if the borrower name is provided and the resource is available
        if (borrower != null && !borrower.equals("") && numAvailable > 0) {
            // find an empty slot in borrowers array and update the information
            for (int i = 0; i < borrowers.length; i++) {
                if (borrowers[i] == null) {
                    borrowers[i] = borrower;
                    numAvailable--; // Reduce the count of available copies
                    return true; // Successfully checked out
                }

            }
        }
        return false; // Failed to check out
    }

    // Cheeck in the resource from a borrower
    public boolean checkIn(String borrower) {
        // Loop through borrowers to find the maching borrower
        for (int i = 0; i < borrowers.length; i++) {
            if (borrowers[i] != null && borrowers[i].equals(borrower)) {
                borrowers[i] = null; // Remove the borrower's name
                numAvailable++; // Increase the count of available copies
                return true; // Successfully checked in

            }
        }
        return false; // Resource not checked out by the specified borrower
    }

}
