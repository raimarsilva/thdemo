package rai.practices.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.SpringVersion;
import static java.util.logging.Logger.getLogger;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		getLogger("DemoApplication")
				.info("Spring Framework version: " + SpringVersion.getVersion());
	}

}
