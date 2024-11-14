
public class MovieRentalApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Inventory inventory = new Inventory();

        System.out.print("Do you want to load previous data? (yes/no): ");
        String choice = scanner.nextLine();
        if (choice.equalsIgnoreCase("yes")) {
            inventory.loadMoviesFromFile("movies.json");
        }

        // Other logic...

        // On exit, save data
        inventory.saveMoviesToFile("movies.json");
        scanner.close();
    }
}
