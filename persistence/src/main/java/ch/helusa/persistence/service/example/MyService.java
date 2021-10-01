package ch.helusa.persistence.service.example;

import ch.helusa.persistence.model.example.Customer;
import ch.helusa.persistence.repository.example.CustomerRepository;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Service;

@Service
@EnableConfigurationProperties(ServiceProperties.class)
public class MyService {

    private final ServiceProperties serviceProperties;
    private final CustomerRepository customerRepository;

    public MyService(ServiceProperties serviceProperties, CustomerRepository customerRepository) {
        this.serviceProperties = serviceProperties;
        this.customerRepository = customerRepository;
    }

    public String message(long id) {
        return this.serviceProperties.getMessage() + customerRepository.findById(id);
    }

    public Customer saveCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}