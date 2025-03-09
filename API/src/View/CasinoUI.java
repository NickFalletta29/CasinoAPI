package View;

import javax.swing.*;
import java.awt.*;

public class CasinoUI {
    private static JFrame frame;
    private static CardLayout cardLayout;
    private static JPanel mainPanel;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CasinoUI::createAndShowGUI);
    }

    private static void createAndShowGUI() {
        frame = new JFrame("Casino API");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLocationRelativeTo(null);

        cardLayout = new CardLayout();
        mainPanel = new JPanel(cardLayout);

        // Adding Views with a sleek look
        mainPanel.add(new MainView(), "MainView");
        mainPanel.add(new GameView(), "GameView");
        mainPanel.add(new SpendingLimitView(), "SpendingLimitView");
        mainPanel.add(new UserView(), "UserView");

        frame.add(mainPanel);
        frame.setVisible(true);
    }

    public static void showView(String viewName) {
        cardLayout.show(mainPanel, viewName);
    }
}