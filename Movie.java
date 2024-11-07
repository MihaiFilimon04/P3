// Movie.java
public class Movie implements Comparable<Movie> {
    private String title;
    private String genre;
    private int year;

    // Constructor
    public Movie(String title, String genre) {
        this.title = title;
        this.genre = genre;
        this.year = year;
    }

    // Getters
    public String getTitle() { return title; }
    public String getGenre() { return genre; }
    public int getYear() { return year; }

    // Implement Comparable to compare Movies by title, then by year if titles are identical
    @Override
    public int compareTo(Movie other) {
        int titleComparison = this.title.compareTo(other.title);
        if (titleComparison != 0) {
            return titleComparison;
        }
        return Integer.compare(this.year, other.year);
    }

    @Override
    public String toString() {
        return "Movie{" + "title='" + title + '\'' + ", genre='" + genre + '\'' + ", year=" + year + '}';
    }
}
