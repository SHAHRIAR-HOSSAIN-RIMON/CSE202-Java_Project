public class Booking{

    private String username;
    private String moviename;
    private int seats;

    public Booking(String username,String moviename,int seats){
        this.username=username;
        this.moviename=moviename;
        this.seats=seats;
    }

    public void displayinfo(){
        System.out.println("User: " + username + "|Movie:" + moviename + "|Seats"+seats);
    }
}