package model;

public class Player {
    private int id;
    private String phoneNumber,password,role,username;
    public Player(String username,String phoneNumber, String password, String role, int id) {
        this.username = username;
        this.phoneNumber = phoneNumber;
        this.password = password;
        this.role = role;
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public String getEmail() {
        return phoneNumber;
    }
    public String getPassword() {
        return password;
    }
    public String getRole() {
        return role;
    }
    public String getUsername() {
        return username;
    }
    public void setEmail(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
