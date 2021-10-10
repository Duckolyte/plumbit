package ch.helusa.example.rest.controller;

import ch.helusa.persistence.model.customer.Property;
import ch.helusa.persistence.service.customer.PropertyService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PropertyController {

    private final PropertyService propertyService;

    public PropertyController(PropertyService propertyService) {
        this.propertyService = propertyService;
    }

    @GetMapping("/property/{id}")
    @ResponseBody
    public Property getPropertyById(@PathVariable long id) {
        return propertyService.findPropertyById(id);
    }

    @GetMapping("/property")
    @ResponseBody
    public List<Property> getProperties() {
        return propertyService.findAllProperties();
    }

    @PostMapping("/property")
    @ResponseBody
    public Property createProperty(@RequestBody Property property) {
        return propertyService.saveProperty(property);
    }

}
