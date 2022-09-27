package pc;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("pc")
@PropertySource("classpath:server.properties")
public class PCSetup {
}
