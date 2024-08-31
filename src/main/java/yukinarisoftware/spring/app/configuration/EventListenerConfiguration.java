package yukinarisoftware.spring.app.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import yukinarisoftware.spring.app.listener.LoginSuccessListener;
import yukinarisoftware.spring.app.listener.UserListener;
import yukinarisoftware.spring.app.service.UserService;

@Configuration
@Import({
        UserService.class,
        LoginSuccessListener.class,
        UserListener.class
})
public class EventListenerConfiguration {
}
