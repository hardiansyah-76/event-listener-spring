package yukinarisoftware.spring.app.event;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.context.ApplicationEvent;

import lombok.Getter;

public class LoginSuccessEvent extends ApplicationEvent {

    @Getter
    private final User user;


    public LoginSuccessEvent(User user) {
        super(user);
        this.user = user;
    }
}
