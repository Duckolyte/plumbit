package ch.helusa.persistence.model.customer;

import javax.persistence.*;

@Entity
@Table(name = "RENTER")
public class Renter {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "person_id", referencedColumnName = "id")
    private Person person;

    public Renter() {
    }

    public Renter(Long id, Person person) {
        this.id = id;
        this.person = person;
    }

    public Long getId() {
        return id;
    }

    public Person getPerson() {
        return person;
    }
}
