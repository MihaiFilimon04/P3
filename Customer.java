class Customer {
    // class C
    String name;
    boolean hasRented;

    // constructor for Customer
    public Customer(String name) {
        this.name = name;
        this.hasRented = false; // i assume the customer has not rented this movie
    }

    public String getName() {
        return name;
    }

    public boolean hasRented() {
        return hasRented;
    }

    public void setHasRented(boolean hasRented) {
        this.hasRented = hasRented;
    }
}
