package ma.emsi.Eureka_clientG61_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaClientG611Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaClientG611Application.class, args);
	}
}
	
	@RestController
	class GreetingController {

	    @GetMapping("/greeting")
	    public String getGreeting() {
	        return "Hello from Client 1!";
	    }

}

