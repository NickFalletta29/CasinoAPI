package Model;

// user in the system, stores username and balance and retrieves or sets them
public class User {
    private String username;
    private double balance;

    public User(String username, double balance) {
        this.username = username;
        this.balance = balance;
    }

    // gets username and balance
    public String getUsername() {
        return username;
    }

    public double getBalance() {
        return balance;
    }

    // updates/sets the balance
    public void setBalance(double balance) {
        this.balance = balance;
    }
}
