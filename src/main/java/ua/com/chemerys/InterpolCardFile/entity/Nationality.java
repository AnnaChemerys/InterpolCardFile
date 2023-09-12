package ua.com.chemerys.InterpolCardFile.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Table(name = "nationalities")
@Entity
@Getter
@Setter
public class Nationality {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "alpha_2_code")
    private String alpha2Code;

    @Column(name = "alpha_3_code")
    private String alpha3Code;

    @Column(name = "en_short_name")
    private String enShortName;

    @Column(name = "nationality")
    private String nationality;

    @Column(name = "country_id")
    private int countryId;

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {CascadeType.PERSIST, CascadeType.MERGE,
                    CascadeType.DETACH, CascadeType.REFRESH})
    @JoinTable(
            name = "nationality_criminal",
            joinColumns = @JoinColumn(name = "nationality_id"),
            inverseJoinColumns = @JoinColumn(name = "criminal_nationality_id")
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
