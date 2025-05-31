
import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        
        Scanner sc=new Scanner(System.in);
        Person currentUser=null;
        String adminUsername="admin";
        String adminPassword="admin";
        while(true){
             System.out.println("\nWelcome to Movie Ticket Booking ");
            System.out.println("1. User Login");
            System.out.println("2. Admin Login");
            System.out.println("3. Exit");
            System.out.print("Select option: ");
            String choice=sc.nextLine();
            try{
                int option= Integer.parseInt(choice);
                switch(option){
                    case 1:
                        System.out.print("Enter username: ");
                        String user=sc.nextLine();
                        System.out.print("Enter password: ");
                        String pass=sc.nextLine();
                        currentUser=new User(user,pass);
                       if(currentUser.login(user,pass)){
                           
                            currentUser.showMenu();
                        }else{
                            System.out.println("x Invalid username or password");
                        }
                        break;
                    case 2:
                        System.out.print("Enter admin username: ");
                        String adminUser=sc.nextLine();
                        System.out.print("Enter admin password: ");
                        String adminPass=sc.nextLine();
                        if(adminUser.equals(adminUsername) && adminPass.equals(adminPassword)){
                            currentUser=new Admin(adminUser,adminPass);
                            currentUser.showMenu();
                        }else{
                            System.out.println("x Invalid admin username or password");
                        }
                        break;
                    case 3:
                        System.out.println("Exiting the application. Goodbye!");
                        return; // Exit the application
                    default:
                        System.out.println("x Invalid option. Please try again.");
                }
            }catch(NumberFormatException e){
                System.out.println("x Input must be a number");
            }
        }
       
       

    }
    ;
}