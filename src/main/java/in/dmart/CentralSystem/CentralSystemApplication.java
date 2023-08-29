package in.dmart.CentralSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class CentralSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(CentralSystemApplication.class, args);
	}

}
