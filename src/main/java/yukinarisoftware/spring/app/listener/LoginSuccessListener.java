package yukinarisoftware.spring.app.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;
import yukinarisoftware.spring.app.event.LoginSuccessEvent;


@Component
@Slf4j
public class LoginSuccessListener implements ApplicationListener<LoginSuccessEvent>{

    @Override
    public void onApplicationEvent(LoginSuccessEvent event) {
       log.info("success login for user " + event.getUser());
    }
    
}
