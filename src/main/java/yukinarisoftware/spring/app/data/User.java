package yukinarisoftware.spring.app.data;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.boot.autoconfigure.security.SecurityProperties;

@Data
@AllArgsConstructor
public class User extends SecurityProperties.User {
 
    private String username;

}
