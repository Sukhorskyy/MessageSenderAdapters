package Sender;

import Facebook.FacebookUser;
import Twitter.TwitterUser;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

class MessageSenderTest {
    MessageSender ms;
    FacebookUser facebookUser;
    TwitterUser twitterUser;
    Date date;

    @BeforeEach
    void setUp() {
        ms = new MessageSender();
        date = new Date();
        facebookUser = new FacebookUser("f@gmail.com", "Germany", date);
        twitterUser = new TwitterUser("tw@gmail.com", "USA", date);
    }

    @Test
    void testFacebookAdapter() {
        User myFacebookUser = new MyFacebookUser(facebookUser);
        String actual = ms.send("yes", myFacebookUser, "Germany");
        assertEquals("Message was sent to Germany from email f@gmail.com Time: " + date, actual);
    }

    @Test
    void testTwitterAdapter() {
        User myTwitterUser = new MyTwitterUser(twitterUser);
        String actual = ms.send("yes", myTwitterUser, "Germany");
        assertEquals("Message was sent to USA from email tw@gmail.com Time: " + date, actual);
    }
}