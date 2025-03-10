package Controller;

public class NotificationController {

    // sends notification and an error if there is no message
    public void sendNotification(String message) {
        if (message == null || message.trim().isEmpty()) {
            System.out.println("Error: Message cannot be empty.");
            return;
        }
        System.out.println("Notification: " + message);
    }

    // sends a user-specific notification
    public void sendUserNotification(String userId, String message) {
        if (userId == null || userId.trim().isEmpty() || message == null || message.trim().isEmpty()) {
            System.out.println("Error: Invalid user or message.");
            return;
        }
        System.out.println("Notification to User [" + userId + "]: " + message);
    }

    // logging the notification
    private void logNotification(String message) {
        System.out.println("Notification Logged: " + message);
    }
}
