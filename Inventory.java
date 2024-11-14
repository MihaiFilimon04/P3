import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.List;

public class Inventory {
    private List<Movie> movies;

    // Load movies from file
    public void loadMoviesFromFile(String filePath) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            File file = new File(filePath);
            if (file.exists()) {
                movies = List.of(mapper.readValue(file, Movie[].class));
                System.out.println("Loaded movies from file.");
            } else {
                System.out.println("No saved data found. Starting fresh.");
            }
        } catch (IOException e) {
            System.err.println("Error loading movies: " + e.getMessage());
        }
    }

    // Save movies to file
    public void saveMoviesToFile(String filePath) {
        try {
            ObjectMapper mapper = new ObjectMapper();
            mapper.writeValue(new File(filePath), movies);
            System.out.println("Movies saved successfully.");
        } catch (IOException e) {
            System.err.println("Error saving movies: " + e.getMessage());
        }
    }
    public void addMovie(Movie movie) throws DuplicateMovieException {
        for (Movie m : movies) {
            if (m.getTitle().equalsIgnoreCase(movie.getTitle())) {
                throw new DuplicateMovieException("Movie with title '" + movie.getTitle() + "' already exists.");
            }
        }
        movies.add(movie);
    }
}
