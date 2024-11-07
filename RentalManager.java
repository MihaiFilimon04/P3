import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RentalManager {
    private List<Movie> movies;
    private List<Customer> customers;

    public RentalManager() {
        this.movies = new ArrayList<>();
        this.customers = new ArrayList<>();
    }

    // Method to add movies and customers to the system
    public void addMovie(Movie movie) {
        movies.add(movie);
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    // 1. Sort Movies by Release Year
    public List<Movie> sortMoviesByYear() {
        return movies.stream()
                .sorted(Comparator.comparingInt(Movie::getYear))
                .collect(Collectors.toList());
    }

    // 2. Sort Customers by Name
    public List<Customer> sortCustomersByName() {
        List<Customer> sortedCustomers = new ArrayList<>(customers);
        Collections.sort(sortedCustomers); // Uses Customer's compareTo() method (by name)
        return sortedCustomers;
    }

    // 3. Group Movies by Genre
    public Map<String, List<Movie>> groupMoviesByGenre() {
        return movies.stream()
                .collect(Collectors.groupingBy(Movie::getGenre));
    }
}
