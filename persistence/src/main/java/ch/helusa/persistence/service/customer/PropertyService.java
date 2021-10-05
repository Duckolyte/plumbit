package ch.helusa.persistence.service.customer;

import ch.helusa.persistence.model.customer.Property;

import java.util.List;

public interface PropertyService {

    Property findPropertyById(Long id);

    List<Property> findAllProperties();

    Property saveProperty(Property property);

}
