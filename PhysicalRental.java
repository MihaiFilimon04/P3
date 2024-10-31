// PhysicalRental.java (Class E)
public class PhysicalRental implements Returnable {
    private Movie movie;

    public PhysicalRental(Movie movie) {
        this.movie = movie;
    }

    @Override
    public void returnItem() {
        System.out.println("Returning physical copy of movie: " + movie.getTitle());
    }

    @Override
    public String toString() {
        return "PhysicalRental{" + "movie=" + movie + '}';
    }
}
