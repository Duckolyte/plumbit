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

    @OneToOne(mappedBy = "property", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private Property property;

    public Renter() {
    }

    public Renter(Long id, Person person, Property property) {
        this.id = id;
        this.person = person;
        this.property = property;
    }

    public Long getId() {
        return id;
    }

    public Person getPerson() {
        return person;
    }

    public Property getProperty() {
        return property;
    }
}
