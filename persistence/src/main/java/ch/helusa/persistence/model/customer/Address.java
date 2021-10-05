package ch.helusa.persistence.model.customer;

import javax.persistence.*;
import java.util.Locale;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @OneToOne
    @JoinColumn(name = "id", nullable = false)
    private Property property;

    private String street;
    private String houseNumber;
    private String postalCode;
    private String city;
    private Locale locale;

    public Address() {
    }

    public Address(Long id, String street, String houseNumber, String postalCode, String city, Locale locale) {
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

    public Locale getLocale() {
        return locale;
    }
}
