import Controller.SpendingLimitController;
import Model.SpendingLimit;
import View.SpendingLimitView;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SpendingLimit model = new SpendingLimit();
        SpendingLimitView view = new SpendingLimitView();
        String userId = "user123"; // Example user

        new SpendingLimitController(model, view, userId);

        JFrame frame = new JFrame("Casino Spending Limit");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.add(view);
        frame.setVisible(true);
    }
}

