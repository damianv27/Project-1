package src;
public abstract class User {
    private String name;
    private String role;

    public User(String name, String role){
        this.name = name;
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public String getRole() {
        return role;
    }
}


