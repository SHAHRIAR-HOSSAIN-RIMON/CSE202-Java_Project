import java.util.Scanner;
public class Admin extends Person{
    public Admin(String user,String pass){
        super(user,pass);
    }
    @Override
    public void displayinfo(){
        System.out.println("Admin"+getUsername());
    }
    public void showMenu(){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("\n--- Admin Menu ---");
            System.out.println("1. Add Movie");
            System.out.println("2. View All Movies");
            System.out.println("3. View All Bookings");
            System.out.println("4. Logout");
            System.out.print("Choose option: ");
            String choice =sc.nextLine();
            try{
                int option =Integer.parseInt(choice);
                switch(option){
                    case 1:
                        addMovie(sc);
                      break;
                    case 2:
                        viewMovies();
                      break;
                    case 3:
                        viewBookings();
                        break;
                    case 4:
                        System.out.println("Logging out...");
                        return;
                         // Exit the admin menu
                    default:
                        System.out.println("x Invalid option. Please try again.");
                    }
                }
            catch(NumberFormatException e){
                System.out.println("x Input must be a number");
            }
        }
    }

    private void addMovie(Scanner sc){
        try {
            System.out.print("Enter movie name: ");
            String name = sc.nextLine();
            System.out.print("Enter available seats: ");
            int seats = Integer.parseInt(sc.nextLine());
            System.out.print("Enter ticket price: ");
            double price = Double.parseDouble(sc.nextLine());

            DataStore.movies.add(new Movie(name, seats, price));
            System.out.println(" Movie added successfully.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Seats must be integer and price must be a number.");
        }
    }

    private void viewMovies() {
        System.out.println("\n--- Movies List ---");
        for (Movie m : DataStore.movies) {
            m.displayMovie();
        }
    }

    private void viewBookings() {
        System.out.println("\n--- All Bookings ---");
        if (DataStore.bookings.isEmpty()) {
            System.out.println("No bookings made yet.");
        } else {
            for (Booking b : DataStore.bookings) {
                b.displayinfo();
            }
        }
    }
}