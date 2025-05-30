public class Main{
    public static void main(String[]args){
        Person currentUser=null;


        currentUser = new User("john cena","323");
        if(currentUser.login("john cena","323")){
            currentUser.showMenu();
        }

    }
}