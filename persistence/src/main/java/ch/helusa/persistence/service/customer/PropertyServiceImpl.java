package ch.helusa.persistence.service.customer;

import ch.helusa.persistence.config.customer.PropertyServiceConfig;
import ch.helusa.persistence.model.customer.Property;
import ch.helusa.persistence.repository.customer.PropertyRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PropertyServiceImpl implements PropertyService {

    private final PropertyServiceConfig propertyServiceConfig;
    private final PropertyRepository propertyRepository;

    public PropertyServiceImpl(PropertyServiceConfig propertyServiceConfig, PropertyRepository propertyRepository) {
        this.propertyServiceConfig = propertyServiceConfig;
        this.propertyRepository = propertyRepository;
    }

    @Override
    public Property findPropertyById(Long id) {
        return this.propertyRepository.findById(id).orElseThrow(IllegalArgumentException::new);
    }

    @Override
    public List<Property> findAllProperties() {
        return (List<Property>) this.propertyRepository.findAll();
    }

    @Override
    public Property saveProperty(Property property) {
        return this.propertyRepository.save(property);
    }
}
