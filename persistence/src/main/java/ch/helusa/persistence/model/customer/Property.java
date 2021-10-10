package ch.helusa.persistence.model.customer;

import javax.persistence.*;

@Entity
@Table(name = "PROPERTY")
public class Property {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "property_owner_id", referencedColumnName = "id")
    private PropertyOwner propertyOwner;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "renter_id", referencedColumnName = "id")
    private Renter renter;

    public Property() {
    }

    public Property(PropertyOwner propertyOwner, Address address, Renter renter) {
        this.propertyOwner = propertyOwner;
        this.address = address;
        this.renter = renter;
    }

    public Long getId() {
        return id;
    }

    public PropertyOwner getPropertyOwner() {
        return propertyOwner;
    }

    public Address getAddress() {
        return address;
    }

    public Renter getRenter() {
        return renter;
    }
}
