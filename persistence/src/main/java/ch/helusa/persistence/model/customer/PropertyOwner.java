package ch.helusa.persistence.model.customer;

import javax.persistence.*;

@Entity
@Table(name = "PROPERTY_OWNER")
public class PropertyOwner {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @OneToOne
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;

    private String name;

    public PropertyOwner() {
    }

    public PropertyOwner(Long id, Address address, String name) {
        this.id = id;
        this.address = address;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public Address getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }
}
