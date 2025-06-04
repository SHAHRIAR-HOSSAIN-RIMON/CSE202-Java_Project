import java.util.ArrayList;

public class DataStore{
    
    public static ArrayList<Movie>movies= new ArrayList<>();
    public static ArrayList<Booking>bookings= new ArrayList<>();

    static {
        movies.add(new Movie("Inception",50,10));
        movies.add(new Movie("Inception",35,15));
        movies.add(new Movie("Inception",20,5));

    }

}