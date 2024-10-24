class Movie {
    // class A
    String title;
    String genre;
    boolean isAvailable;

    // constructor for Movie
    public Movie(String title, String genre) {
        this.title = title;
        this.genre = genre;
        this.isAvailable = true; // movie is available by default
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
    public void setAvailable(boolean available) {
        isAvailable = available;
    }
}
