import java.util.Scanner;
public class User extends Person{
    public User(String user,String pass){
        super(user,pass);
    }
    @Override
    public void displayinfo(){
        System.out.println("User: "+getUsername());
    }
    @Override
    public void showMenu(){
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("\n--Available Movie-");
            for(int i=0;i<DataStore.movies.size();i++){
                System.out.println((i+1)+".");
                DataStore.movies.get(i).displayMovie();
            }
            System.out.println("Choose movie(1-"+DataStore.movies.size());
            int choice = Integer.parseInt(sc.nextLine())-1;

        if(choice<0 || choice>= DataStore.movies.size()){
            throw new IllegalArgumentException("Invalid movie selection.");

        }
        Movie selected = DataStore.movies.get(choice);
        System.out.println("Enter number of seats:");
        int seats=Integer.parseInt(sc.nextLine());
        if(selected.bookSeats(seats)){
            DataStore.bookings.add(new Booking(getUsername(),selected.getName(), seats));
        }else{
            System.out.println("x Not enough seats");
        }

        }catch(NumberFormatException e){
            System.out.println("x Input must be a number");

        }catch (Exception e){
            System.out.println("x eror"+e.getMessage());
        }
    }

}

