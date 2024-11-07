// Customer.java
public class Customer implements Comparable<Customer> {
    private String name;
    private int customerID;

    // Constructor
    public Customer(String name, int customerID) {
        this.name = name;
        this.customerID = customerID;
    }

    // Getters
    public String getName() { return name; }
    public int getCustomerID() { return customerID; }

    // Implement Comparable to compare Customers by name
    @Override
    public int compareTo(Customer other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return "Customer{" + "name='" + name + '\'' + ", customerID=" + customerID + '}';
    }
}
