package Model;

// Represents a user's account in the system
public class Account {
    private User user;
    private String accountId;
    private String status; // Active, Suspended, Closed

    public Account(User user, String accountId) {
        this.user = user;
        this.accountId = accountId;
        this.status = "Active"; // Default status
    }

    // returns the user associated with the account
    public User getUser() {
        return user;
    }

    // returns the account ID
    public String getAccountId() {
        return accountId;
    }

    // returns the account status
    public String getStatus() {
        return status;
    }

    // updates the account status
    public void setStatus(String status) {
        if (status.equalsIgnoreCase("Active") || status.equalsIgnoreCase("Suspended") || status.equalsIgnoreCase("Closed")) {
            this.status = status;
            System.out.println("Account " + accountId + " status updated to: " + status);
        } else {
            System.out.println("Invalid status update attempt for account " + accountId);
        }
    }

    // checks if the account is active
    public boolean isActive() {
        return status.equalsIgnoreCase("Active");
    }

    // Prints account details
    @Override
    public String toString() {
        return "Account ID: " + accountId +
                "\nUser: " + user.getUsername() +
                "\nStatus: " + status;
    }
}

