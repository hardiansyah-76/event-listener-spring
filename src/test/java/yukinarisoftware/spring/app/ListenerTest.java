package yukinarisoftware.spring.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import yukinarisoftware.spring.app.configuration.EventListenerConfiguration;
import yukinarisoftware.spring.app.service.UserService;

public class ListenerTest {
    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(EventListenerConfiguration.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void test() {
        UserService service = applicationContext.getBean(UserService.class);
        Assertions.assertNotNull(service);

        service.login("yuki", "yuki");
        service.login("alya", "alya");
    }
}
