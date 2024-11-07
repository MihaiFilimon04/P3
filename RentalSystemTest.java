import java.util.List;
import java.util.Map;

public class RentalSystemTest {
    public static void main(String[] args) {
        RentalManager manager = new RentalManager();

        // Add some movies
        manager.addMovie(new Movie("Inception", "Sci-Fi", 2010));
        manager.addMovie(new Movie("The Matrix", "Sci-Fi", 1999));
        manager.addMovie(new Movie("Interstellar", "Sci-Fi", 2014));
        manager.addMovie(new Movie("The Godfather", "Drama", 1972));
        manager.addMovie(new Movie("Pulp Fiction", "Drama", 1994));

        // Add some customers
        manager.addCustomer(new Customer("Alice", 101));
        manager.addCustomer(new Customer("Charlie", 102));
        manager.addCustomer(new Customer("Bob", 103));

        // 1. Sort movies by year
        List<Movie> moviesByYear = manager.sortMoviesByYear();
        System.out.println("Movies sorted by release year:");
        moviesByYear.forEach(System.out::println);

        // 2. Sort customers by name
        List<Customer> customersByName = manager.sortCustomersByName();
        System.out.println("\nCustomers sorted by name:");
        customersByName.forEach(System.out::println);

        // 3. Group movies by genre
        Map<String, List<Movie>> moviesByGenre = manager.groupMoviesByGenre();
        System.out.println("\nMovies grouped by genre:");
        moviesByGenre.forEach((genre, movieList) -> {
            System.out.println("Genre: " + genre);
            movieList.forEach(System.out::println);
        });
    }
}
