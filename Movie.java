public class Movie{

    private String name;
    private int availableSeats;
    private double price;

    public Movie(String name,int seats,double price){
        this.name = name;
        this.availableSeats = seats;
        this.price = price;
    }

    public void displayMovie(){
        System.out.println("Movie" + name + ",seats" + availableSeats + ",price:$" + price);
    }

    public boolean bookSeats(int seats){
        if(seats<=availableSeats){
            availableSeats-=seats;
            return true;
        }
        return false;
    }

    public String getName(){
        return name;

    }

    public double getPrice(){
        return price;
    }

    public int getAvailableSeats(){
        return availableSeats;
    }
}