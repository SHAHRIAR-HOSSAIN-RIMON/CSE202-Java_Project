public abstract class Person implements Loginable, Displayable{
    private String username;
    private String password;

    public Person(String username,String password){
        this.username=username;
        this.password=password;
    }
    
    public boolean login(String username,String password){
        return this.username.equals(username)&&this.password.equals(password);
        
    }

    public abstract void showMenu();
    public String getUsername(){
    
    return username;
    
    }
}