package model;

public class FieldOwner {
    private int id;
    private String email,password,role;
    FieldOwner(String email, String password, String role, int id) {
        this.email = email;
        this.password = password;
        this.role = role;
        this.id = id;
    }
    public int getId() {
        return id;
    }
    public String getEmail() {
        return email;
    }
    public String getPassword() {
        return password;
    }
    public String getRole() {
        return role;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setRole(String role) {
        this.role = role;
    }

}
