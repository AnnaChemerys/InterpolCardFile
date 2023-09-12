package ua.com.chemerys.InterpolCardFile.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Table(name = "countries")
@Entity
@Getter
@Setter
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "shortname")
    private String shortname;

    @Column(name = "name")
    private String name;

    @Column(name = "phone_code")
    private int phoneCode;

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {CascadeType.PERSIST, CascadeType.MERGE,
                    CascadeType.DETACH, CascadeType.REFRESH})
    @JoinTable(
            name = "wanted_by_country_criminal",
            joinColumns = @JoinColumn(name = "country_id"),
            inverseJoinColumns = @JoinColumn(name = "criminal_wanted_by_country_id")
    )
    private List<Criminal> criminals;

    // add a convenience method

    public void addCriminal(Criminal theCriminal) {

        if (criminals == null) {
            criminals = new ArrayList<>();
        }

        criminals.add(theCriminal);
    }
}
