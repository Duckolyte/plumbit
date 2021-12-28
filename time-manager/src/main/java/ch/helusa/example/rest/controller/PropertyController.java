package ch.helusa.example.rest.controller;

import ch.helusa.persistence.model.customer.Property;
import ch.helusa.persistence.service.customer.PropertyService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.text.MessageFormat;
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
        try {
            return propertyService.findPropertyById(id);
        }  catch (IllegalArgumentException e) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND,
                    MessageFormat.format("Property with id {0} not found.", id),
                    e);
        }
    }

    @GetMapping("/property")
    @ResponseBody
    public List<Property> getProperties() {
        return propertyService.findAllProperties();
    }

    @PostMapping("/property")
    @ResponseBody
    public Property createProperty(@RequestBody Property property) {
        try {
            return propertyService.saveProperty(property);
        }  catch (IllegalArgumentException e) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND,
                    MessageFormat.format("Property with id {0} could not be saved.", property.getId()),
                    e);
        }
    }

}
