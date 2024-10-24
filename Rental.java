class Rental {
    // class B
    Movie movie;
    Customer[] customers; // array of customers renting the movie
    String rentalDate;


    public Rental(Movie movie, Customer[] customers, String rentalDate) {  // constructor for Rental
        this.movie = movie;
        this.customers = customers;
        this.rentalDate = rentalDate;
    }
    public void printRentalDetails() {
        System.out.println("Movie Title: " + movie.getTitle());
        System.out.println("Genre: " + movie.getGenre());
        System.out.println("Rental Date: " + rentalDate);
        System.out.println("Customers who rented this movie:");
        for (Customer customer : customers) {
            System.out.println("- " + customer.getName() + " (Rented: " + customer.hasRented() + ")");
        }
    }


    public void returnMovie() {
        if (!movie.isAvailable()) {
            movie.setAvailable(true); // Movie is now available
            for (Customer customer : customers) {
                customer.setHasRented(false); // Reset customer's rental status
            }
            System.out.println("Movie " + movie.getTitle() + " has been returned.");
        } else {
            System.out.println("Movie " + movie.getTitle() + " is already available.");
        }
    }
}
