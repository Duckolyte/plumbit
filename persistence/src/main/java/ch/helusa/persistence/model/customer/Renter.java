package ch.helusa.persistence.model.customer;

import javax.persistence.*;

@Entity
public class Renter {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @OneToOne(mappedBy = "person", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Person person;

    @OneToOne(mappedBy = "address", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Address address;


}
