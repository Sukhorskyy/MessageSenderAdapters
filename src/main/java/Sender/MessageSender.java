package Sender;

public class MessageSender {
    public String send(String text, User user, String country) {
        return "Message was sent to " + user.getCountry() + " from email " + user.getEmail() + " Time: " + user.getLastActiveTime();
    }
}
