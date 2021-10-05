package ch.helusa.persistence.model.customer;

import javax.persistence.*;

@Entity
@Table(name = "RENTER")
public class Renter {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    @OneToOne
    @JoinColumn(name = "person_id", referencedColumnName = "id")
    private Person person;

    @OneToOne
    @JoinColumn(name = "property_id", referencedColumnName = "id")
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
