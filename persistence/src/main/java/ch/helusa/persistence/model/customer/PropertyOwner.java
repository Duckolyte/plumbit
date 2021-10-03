package ch.helusa.persistence.model.customer;

import javax.persistence.*;

@Entity
public class PropertyOwner {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @OneToOne(mappedBy = "address", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Address address;

    private String name;

}
