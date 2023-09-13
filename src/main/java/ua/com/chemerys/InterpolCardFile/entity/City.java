package ua.com.chemerys.InterpolCardFile.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Table(name = "cities")
@Entity
@Getter
@Setter
public class City {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "state_id")
    private int stateId;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "placeOfBirth")
    private Set<Criminal> crimePlaceOfBirth;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "lastPlaceOfResidence")
    private Set<Criminal> crimeLastPlaceOfResidence;
}
