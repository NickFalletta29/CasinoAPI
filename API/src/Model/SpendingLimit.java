package Model;

// spending limit that can be set and modified as needed
public class SpendingLimit {
    private double limitAmount;

    public SpendingLimit(double limitAmount) {
        this.limitAmount = limitAmount;
    }

    public double getLimitAmount() {
        return limitAmount;
    }

    public void setLimitAmount(double limitAmount) {
        this.limitAmount = limitAmount;
    }
}
