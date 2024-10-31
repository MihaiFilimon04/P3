// DigitalRental.java (Class D)
public class DigitalRental implements Rentable {
    private Movie movie;

    public DigitalRental(Movie movie) {
        this.movie = movie;
    }

    @Override
    public void rent() {
        System.out.println("Digital rental initiated for movie: " + movie.getTitle());
    }

    @Override
    public String toString() {
        return "DigitalRental{" + "movie=" + movie + '}';
    }
}
