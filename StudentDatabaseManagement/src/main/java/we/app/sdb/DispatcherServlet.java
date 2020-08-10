package we.app.sdb;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc //specifying the package
@ComponentScan({"we.app.sdb"})
public class DispatcherServlet {

}
