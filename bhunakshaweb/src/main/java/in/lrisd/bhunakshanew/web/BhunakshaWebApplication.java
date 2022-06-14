package in.lrisd.bhunakshanew.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@ComponentScan(basePackages = {"in.lrisd.bhunakshanew.common"})
@ComponentScan(basePackages={"in.lrisd.bhunakshanew.web.rest"})
@ComponentScan(basePackages={"in.lrisd.bhunakshanew.bhunaksha.state.statedataprovider.dao"})
@SpringBootApplication
public class BhunakshaWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(BhunakshaWebApplication.class, args);
	}
}
