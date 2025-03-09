package Controller;

import Model.SpendingLimit;
import Model.User;
import View.SpendingLimitView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SpendingLimitController {
    private SpendingLimit model;
    private SpendingLimitView view;
    private String currentUserId;

    public SpendingLimitController(SpendingLimit model, SpendingLimitView view, String userId) {
        this.model = model;
        this.view = view;
        this.currentUserId = userId;

        view.getSetLimitButton().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setSpendingLimit();
            }
        });
    }

    // Set spending limit from user input
    private void setSpendingLimit() {
        try {
            double limit = Double.parseDouble(view.getLimitTextField().getText());
            if (limit < 0) {
                JOptionPane.showMessageDialog(view, "Limit cannot be negative!", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            model.setSpendingLimit(currentUserId, limit);
            JOptionPane.showMessageDialog(view, "Spending limit set to $" + limit, "Success", JOptionPane.INFORMATION_MESSAGE);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(view, "Invalid amount!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}

