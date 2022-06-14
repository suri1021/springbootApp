package in.lrisd.bhunakshanew.common;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication //(exclude = { SecurityAutoConfiguration.class })
public class BhunakshaCommon {

	public static void main(String[] args) {
		SpringApplication.run(BhunakshaCommon.class, args);
	}
}
