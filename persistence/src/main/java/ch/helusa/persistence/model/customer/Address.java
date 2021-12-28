package ch.helusa.persistence.model.customer;

import javax.persistence.*;
import java.util.Locale;

@Entity
@Table(name = "ADDRESS")
public class Address {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String street;
    private String houseNumber;
    private String postalCode;
    private String city;
    private String locale;

    public Address() {
    }

    public Address(Long id, String street, String houseNumber, String postalCode, String city, String locale) {
        this.id = id;
        this.street = street;
        this.houseNumber = houseNumber;
        this.postalCode = postalCode;
        this.city = city;
        this.locale = locale;
    }

    public Long getId() {
        return id;
    }

    public String getStreet() {
        return street;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCity() {
        return city;
    }

    public String getLocale() {
        return locale;
    }
}
