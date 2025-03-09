package Model;

// spending limit that can be set and modified as needed
import java.util.HashMap;
import java.util.Map;

public class SpendingLimit {
    private Map<String, Double> userLimits;
    private Map<String, Double> userSpending;

    public SpendingLimit() {
        userLimits = new HashMap<>();
        userSpending = new HashMap<>();
    }

    // Set the spending limit for a user
    public void setSpendingLimit(String userId, double limit) {
        userLimits.put(userId, limit);
    }

    // Get the spending limit for a user
    public double getSpendingLimit(String userId) {
        return userLimits.getOrDefault(userId, 0.0);
    }

    // Track spending and check if the user can spend the given amount
    public boolean canSpend(String userId, double amount) {
        double spent = userSpending.getOrDefault(userId, 0.0);
        double limit = userLimits.getOrDefault(userId, Double.MAX_VALUE);

        return (spent + amount) <= limit;
    }

    // Update user’s spending
    public void addTransaction(String userId, double amount) {
        userSpending.put(userId, userSpending.getOrDefault(userId, 0.0) + amount);
    }

    // Reset spending (e.g., daily reset)
    public void resetSpending(String userId) {
        userSpending.put(userId, 0.0);
    }
}

