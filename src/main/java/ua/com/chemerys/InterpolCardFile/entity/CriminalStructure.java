package ua.com.chemerys.InterpolCardFile.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
public class CriminalStructure {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "type_of_criminal_structure")
    private String typeOfCriminalStructure;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "criminalStructure")
    private Set<Criminal> crimeMembers;
}
