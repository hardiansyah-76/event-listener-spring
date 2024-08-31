package yukinarisoftware.spring.app.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import yukinarisoftware.spring.app.event.LoginSuccessEvent;

@Component
@Slf4j
public class UserListener {

    @EventListener(classes = LoginSuccessEvent.class)
    public void onLoginSuccess (LoginSuccessEvent loginSuccessEvent) {
        log.info("success login for user: " + loginSuccessEvent);
    }

}
