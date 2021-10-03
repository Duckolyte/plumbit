package ch.helusa.persistence.model.customer;

import javax.persistence.*;
import java.util.Locale;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String street;
    private String houseNumber;
    private String postalCode;
    private String city;
    private Locale locale;
}
