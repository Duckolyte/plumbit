package ch.helusa.persistence.repository.customer;

import ch.helusa.persistence.model.customer.Property;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PropertyRepository extends CrudRepository<Property, Long> {
}
