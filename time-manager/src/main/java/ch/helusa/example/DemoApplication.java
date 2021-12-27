package ch.helusa.example;

import ch.helusa.persistence.model.example.Customer;
import ch.helusa.persistence.service.example.MyService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication(scanBasePackages = "ch.helusa")
@EnableJpaRepositories("ch.helusa.persistence.repository.*")
@EntityScan(basePackages = "ch.helusa.persistence.model")
@RestController
public class DemoApplication {

    private final MyService myService;

    public DemoApplication(MyService myService) {
        this.myService = myService;
    }

    @GetMapping("/customer/{id}")
    public String getCustomerById(@PathVariable long id) {
        return myService.message(id);
    }

    @PostMapping("/customer")
    @ResponseBody
    public Customer createCustomer(@RequestBody Customer requestBody) {
        return myService.saveCustomer(requestBody);
    }

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
}