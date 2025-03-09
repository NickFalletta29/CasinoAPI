package View;

import View.CasinoUI;
import javax.swing.*;
import java.awt.*;

public class SpendingLimitView extends JPanel {
    public SpendingLimitView() {
        setLayout(new BorderLayout());
        setBackground(new Color(25, 25, 25));

        JLabel title = new JLabel("Set Spending Limit", SwingConstants.CENTER);
        title.setFont(new Font("Serif", Font.BOLD, 24));
        title.setForeground(Color.WHITE);

        JPanel inputPanel = new JPanel();
        inputPanel.setOpaque(false);

        JLabel label = new JLabel("Limit Amount: $");
        label.setForeground(Color.WHITE);
        JTextField limitTF = new JTextField(10);
        JButton setLimitBtn = new JButton("Set Limit");
        setLimitBtn.setBackground(new Color(50, 50, 50));
        setLimitBtn.setForeground(Color.WHITE);

        inputPanel.add(label);
        inputPanel.add(limitTF);
        inputPanel.add(setLimitBtn);

        add(title, BorderLayout.NORTH);
        add(inputPanel, BorderLayout.CENTER);
        add(createBackButton(), BorderLayout.SOUTH);
    }

    private JButton createBackButton() {
        JButton backBtn = new JButton("Back to Main");
        backBtn.setFont(new Font("SansSerif", Font.BOLD, 16));
        backBtn.setBackground(new Color(50, 50, 50));
        backBtn.setForeground(Color.WHITE);
        backBtn.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));
        backBtn.addActionListener(e -> CasinoUI.showView("MainView"));
        return backBtn;
    }
}
