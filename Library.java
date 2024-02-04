public class Library {
    private Resource[] resources;
    private int countResources = 0;
    private int numResources;

    /**
     * Constructor to initialize the library with a maximum number of resources.
     *
     * @param numResources The maximum number of resources the library can hold.
     */

    public Library(int numResources) {
        // this.maxResources = numResources;
        this.resources = new Resource[numResources];
        this.numResources = numResources;

    }

    /**
     * Add a resource to the library's collection.
     *
     * @param r The resource to be added.
     * @return True if the resource is added successfully, false if the library is
     *         full.
     */

    public boolean addResource(Resource r) {

        if (countResources < numResources) {
            resources[countResources] = r;
            countResources++;
            return true;
        }
        return false;
    }

    /**
     * Get an array of all resources in the library.
     *
     * @return An array containing all resources in the library.
     */
    public Resource[] getAllResources() {
        // Create an array to hold all resources in the library
        Resource[] allResources = new Resource[numResources];
        // Copy each resource from the resources array to allResources
        for (int i = 0; i < numResources; i++) {
            allResources[i] = resources[i];
        }
        return allResources;
    }

    /**
     * Get an array of resources that are currently unavailable (checked out).
     *
     * @return An array containing unavailable resources.
     */

    public Resource[] getUnavailable() {
        int count = 0;
        // Count the number of unavailable resources
        for (int i = 0; i < numResources; i++) {
            if (!resources[i].isAvailable()) {
                count++;
            }
        }
        // Create an array to hold unavailable resources
        Resource[] unavailableResources = new Resource[count];
        int index = 0;
        // Copy each unavailable resource to unavailableResources
        for (int i = 0; i < numResources; i++) {
            if (!resources[i].isAvailable()) {
                unavailableResources[index] = resources[i];
                index++;
            }
        }
        return unavailableResources;
    }

    /**
     * Get an array of resources that have been checked out by a specific user.
     *
     * @param user The name of the user.
     * @return An array containing resources checked out by the user.
     */
    public Resource[] getAllUserHasCheckedOut(String user) {
        int count = 0;
        // Count the number of resources checked out by the specified user
        for (int i = 0; i < numResources; i++) {
            if (resources[i].isBorrowedBy(user)) {
                count++;
            }
        }
        // Create an array to hold resources checked out by the user
        Resource[] userCheckedOut = new Resource[count];
        int index = 0;
        // Copy each resource checked out by the user to userCheckedOut
        for (int i = 0; i < numResources; i++) {
            if (resources[i].isBorrowedBy(user)) {
                userCheckedOut[index] = resources[i];
                index++;
            }
        }
        return userCheckedOut;
    }

    /**
     * Get an array of book resources.
     *
     * @return An array containing book resources.
     */
    public Resource[] getAllBooks() {
        int count = 0;
        // Count the number of book resources
        for (int i = 0; i < numResources; i++) {
            if (resources[i] instanceof Book) {
                count++;
            }
        }
        // Create an array to hold book resources
        Resource[] books = new Resource[count];
        int index = 0;
        // Copy each book resource to the books array
        for (int i = 0; i < numResources; i++) {
            if (resources[i] instanceof Book) {
                books[index] = resources[i];
                index++;
            }
        }
        return books;
    }

    /**
     * Get an array of CD resources.
     *
     * @return An array containing CD resources.
     */
    public Resource[] getAllCDs() {
        int count = 0;
        // Count the number of CD resources
        for (int i = 0; i < numResources; i++) {
            if (resources[i] instanceof CD) {
                count++;
            }
        }
        // Create an array to hold CD resources
        Resource[] cds = new Resource[count];
        int index = 0;
        // Copy each CD resource to the cds array
        for (int i = 0; i < numResources; i++) {
            if (resources[i] instanceof CD) {
                cds[index] = resources[i];
                index++;
            }
        }
        return cds;
    }
}
