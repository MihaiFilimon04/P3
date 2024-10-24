public class Main {
    public static void main(String[] args) {
        Movie movie = new Movie("Inception", "Sci-Fi");
        Customer[] customers = new Customer[2];
        customers[0] = new Customer("John Doe");
        customers[1] = new Customer("Jane Smith");

        Rental rental = new Rental(movie, customers, "2024-10-24");

        for (Customer customer : customers) {
            customer.setHasRented(true);
        }
        movie.setAvailable(false); // movie is no longer available
        // command line arg
        if (args.length > 0) {
            switch (args[0]) {
                case "print":
                    rental.printRentalDetails();
                    break;
                case "return":
                    rental.returnMovie();
                    break;
                default:
                    System.out.println("Invalid argument. Use 'print' or 'return'.");
                    break;
            }
        } else {
            System.out.println("No arguments provided. Use 'print' or 'return'.");
        }
    }
}
