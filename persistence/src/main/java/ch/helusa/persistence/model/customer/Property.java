package ch.helusa.persistence.model.customer;

import javax.persistence.*;

public class Property {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @OneToMany(mappedBy = "propertyOwner", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private PropertyOwner propertyOwner;

    @OneToOne(mappedBy = "address", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Address address;

    @OneToOne(mappedBy = "renter", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Renter renter;
}