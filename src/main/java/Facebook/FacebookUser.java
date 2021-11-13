package Facebook;
import Sender.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter @AllArgsConstructor
public class FacebookUser {
    private String email;
    private String userCountry;
    private Date userActiveTime;
}

