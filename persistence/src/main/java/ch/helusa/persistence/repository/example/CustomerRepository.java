package ch.helusa.persistence.repository.example;

import ch.helusa.persistence.model.example.Customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import java.util.List;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    @Override
    Iterable<Customer> findAll();

    List<Customer> findByLastName(String lastName);

    Customer findById(long id);

    @Override
    default <S extends Customer> S save(S s) {
        return s;
    }
}
