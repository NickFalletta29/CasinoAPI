package View;

import Controller.NotificationController;
import Model.User;

import javax.swing.*;
import java.awt.*;

public class UserView extends JPanel {
    private User currentUser;
    private NotificationController notificationController;

    private JCheckBox generalCheckbox;
    private JCheckBox spendingLimitCheckbox;
    private JCheckBox transactionCheckbox;

    public UserView(User user, NotificationController controller) {
        this.currentUser = user;
        this.notificationController = controller;
        setLayout(new BorderLayout());
        setBackground(new Color(30, 30, 30));

        JLabel title = new JLabel("User Settings", SwingConstants.CENTER);
        title.setFont(new Font("Serif", Font.BOLD, 24));
        title.setForeground(Color.WHITE);

        JPanel formPanel = new JPanel(new GridLayout(0, 1));
        formPanel.setOpaque(false);

        // User info
        JTextField firstNameField = new JTextField(currentUser.getFirstName());
        JTextField lastNameField = new JTextField(currentUser.getLastName());

        formPanel.add(labeledField("First Name:", firstNameField));
        formPanel.add(labeledField("Last Name:", lastNameField));

        // Notification options
        generalCheckbox = new JCheckBox("Receive Any Notifications");
        generalCheckbox.setSelected(controller.isSubscribed(user.getUserId()));
        generalCheckbox.setForeground(Color.WHITE);
        generalCheckbox.setOpaque(false);

        spendingLimitCheckbox = new JCheckBox("Spending Limit Notifications");
        transactionCheckbox = new JCheckBox("Transaction Notifications");

        spendingLimitCheckbox.setForeground(Color.WHITE);
        spendingLimitCheckbox.setOpaque(false);
        transactionCheckbox.setForeground(Color.WHITE);
        transactionCheckbox.setOpaque(false);

        spendingLimitCheckbox.setSelected(controller.isCategoryEnabled(user.getUserId(), "SpendingLimit"));
        transactionCheckbox.setSelected(controller.isCategoryEnabled(user.getUserId(), "Transaction"));

        formPanel.add(generalCheckbox);
        formPanel.add(spendingLimitCheckbox);
        formPanel.add(transactionCheckbox);

        //Saves user preferences
        JButton saveBtn = new JButton("Save Settings");
        saveBtn.setForeground(Color.BLACK); 
        saveBtn.addActionListener(e -> {
            currentUser.setFirstName(firstNameField.getText());
            currentUser.setLastName(lastNameField.getText());

            if (generalCheckbox.isSelected()) {
                controller.subscribe(currentUser.getUserId());
            } else {
                controller.unsubscribe(currentUser.getUserId());
            }

            controller.setUserPreference(currentUser.getUserId(), "SpendingLimit", spendingLimitCheckbox.isSelected());
            controller.setUserPreference(currentUser.getUserId(), "Transaction", transactionCheckbox.isSelected());

            JOptionPane.showMessageDialog(this, "Profile & Notification Preferences Saved!");
        });

        add(title, BorderLayout.NORTH);
        add(formPanel, BorderLayout.CENTER);
        add(saveBtn, BorderLayout.SOUTH);
    }

    private JPanel labeledField(String labelText, JTextField field) {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panel.setOpaque(false);
        JLabel label = new JLabel(labelText);
        label.setForeground(Color.WHITE);
        panel.add(label);
        panel.add(field);
        return panel;
    }
}

