// Rental.java (Modified)
public class Rental implements Rentable {
    private Movie movie;
    private Customer[] customers;
    private int currentCustomers = 0;

    public Rental(Movie movie, int maxCustomers) {
        this.movie = movie;
        this.customers = new Customer[maxCustomers];
    }

    @Override
    public void rent() {
        System.out.println("Renting movie: " + movie.getTitle());
    }

    @Override
    public void printRentalDetails() {

    }

    public boolean addCustomer(Customer customer) {
        if (currentCustomers < customers.length) {
            customers[currentCustomers++] = customer;
            return true;
        }
        return false;
    }

    public boolean isAvailable() {
        return currentCustomers < customers.length;
    }

    @Override
    public String toString() {
        StringBuilder details = new StringBuilder("Rental{" + "movie=" + movie + ", customers=[");
        for (int i = 0; i < currentCustomers; i++) {
            details.append(customers[i].toString());
            if (i < currentCustomers - 1) details.append(", ");
        }
        details.append("]}");
        return details.toString();
    }

    public void returnMovie() {
    }
}
