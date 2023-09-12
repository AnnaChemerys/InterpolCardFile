package ua.com.chemerys.InterpolCardFile.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Table(name = "languages")
@Entity
@Getter
@Setter
public class Language {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "code")
    private String code;

    @Column(name = "name")
    private String name;

    @Column(name = "local")
    private String localName;

    @ManyToMany(fetch = FetchType.LAZY,
                cascade = {CascadeType.PERSIST, CascadeType.MERGE,
                CascadeType.DETACH, CascadeType.REFRESH})
    @JoinTable(
            name = "language_criminal",
            joinColumns = @JoinColumn(name = "language_id"),
            inverseJoinColumns = @JoinColumn(name = "criminal_language_id")
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
