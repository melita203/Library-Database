/**
 * This class provides a main method to help with testing the classes in the
 * program.
 * 
 * @author blerner
 *
 */
public class Main {

    /**
     * Displays information about all the resources in the array.
     * 
     * @param res an array of resources to display
     */
    private static void printResources(Resource[] res) {
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }

    /**
     * Main method used to test the code in the program.
     * 
     * @param args none
     */
    public static void main(String[] args) {
        // Create a library that can hold 6 resources
        Library l = new Library(6);

        // Create 6 resources. Some are books and some are CDs.
        Book b1 = new Book("The Fifth Season", "Orbit", 2015, false, 1,
                "N.K. Jemisin", 378);
        CD cd1 = new CD("Wrong Places", "RCA Records", 2020, 1, "H.E.R.", 38);
        Book b2 = new Book("On Earth We’re Briefly Gorgeous", "Penguin Press", 2019,
                false, 3, "Ocean Vuong", 256);
        Book b3 = new Book("Small Gods", "Harper Collins", 1992, true, 5,
                "Terry Pratchett", 400);
        CD cd2 = new CD("Harry's House", "Real World", 2022, 2, "Harry Styles", 42);
        CD cd3 = new CD("Renaissance", "Parkwood Entertainment", 2022, 4, "Beyonce",
                62);

        // Add the new resources to the library
        l.addResource(b1);
        l.addResource(cd1);
        l.addResource(b2);
        l.addResource(b3);
        l.addResource(cd2);
        l.addResource(cd3);

        // Display everything in the library
        System.out.println("*** All resources ***");
        printResources(l.getAllResources());

        // Check out some resources
        b1.checkOut("Barbara");
        b3.checkOut("Barbara");
        cd3.checkOut("Dovan");

        // Display only the resources that are completely unavailable, that is, where
        // all
        // of the copies of the resource are checked out.
        System.out.println("\n*** All unavailable ***");
        printResources(l.getUnavailable());

        // Display only the resources checked out by Barbara
        System.out.println("\n*** All checked out by Barbara ***");
        printResources(l.getAllUserHasCheckedOut("Barbara"));

        // Display all the books
        System.out.println("\n*** All books ***");
        printResources(l.getAllBooks());

        // Display all the CDs
        System.out.println("\n*** All CDs ***");
        printResources(l.getAllCDs());

    }

}