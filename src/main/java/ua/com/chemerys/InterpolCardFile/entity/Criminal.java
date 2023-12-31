package ua.com.chemerys.InterpolCardFile.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.LinkedHashSet;
import java.util.Set;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Table(name = "criminal")
@Entity
public class Criminal {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "family_name")
    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    private String familyName;

    @Column(name = "forename")
    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    private String forename;

    @Column(name = "photo_url")
    private String photoUrl;

    @Column(name = "active")
    private boolean active;

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {CascadeType.PERSIST, CascadeType.MERGE,
                    CascadeType.DETACH, CascadeType.REFRESH})
    @JoinTable(
            name = "wanted_by_country_criminal",
            joinColumns = @JoinColumn(name = "criminal_wanted_by_country_id"),
            inverseJoinColumns = @JoinColumn(name = "country_id")
    )
    private Set<Country> countries;

    @Column(name = "gender")
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(name = "date_of_birth")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateOfBirth;

    @Column(name = "alias")
    private String alias;

    @Column(name = "height")
    private int height;

    @Column(name = "color_of_hair")
    @Enumerated(EnumType.STRING)
    private ColorOfHair colorOfHair;

    @Column(name = "eye_colour")
    @Enumerated(EnumType.STRING)
    private EyeColor eyeColor;

    @Column(name = "special_signs")
    private String specialSigns;

    @ManyToOne
    @JoinColumn(name = "place_of_birth_id")
    private City placeOfBirth;

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {CascadeType.PERSIST, CascadeType.MERGE,
                    CascadeType.DETACH, CascadeType.REFRESH})
    @JoinTable(
            name = "nationality_criminal",
            joinColumns = @JoinColumn(name = "criminal_nationality_id"),
            inverseJoinColumns = @JoinColumn(name = "nationality_id")
    )
    private Set<Nationality> nationalities;

    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {CascadeType.PERSIST, CascadeType.MERGE,
                    CascadeType.DETACH, CascadeType.REFRESH})
    @JoinTable(
            name = "language_criminal",
            joinColumns = @JoinColumn(name = "criminal_language_id"),
            inverseJoinColumns = @JoinColumn(name = "language_id")
    )
    private Set<Language> languages;

    @ManyToOne
    @JoinColumn(name = "last_place_of_residence_id")
    private City lastPlaceOfResidence;

    @Column(name = "criminal_profession")
    @Enumerated(EnumType.STRING)
    private CriminalProfession criminalProfession;

    @Column(name = "the_latest_criminal_case")
    private String theLatestCriminalCase;

    @ManyToOne
    @JoinColumn(name = "criminal_structure_id")
    private CriminalStructure criminalStructure;

    @Column(name = "if_alive")
    private boolean ifAlive;

    public void addLanguage(Language theLanguage) {

        if (languages == null) {
            languages = new LinkedHashSet<>();
        }

        languages.add(theLanguage);
    }

    public void addNationality(Nationality theNationality) {

        if (nationalities == null) {
            nationalities = new LinkedHashSet<>();
        }

        nationalities.add(theNationality);
    }

    public void addCountry(Country theCountry) {

        if (countries == null) {
            countries = new LinkedHashSet<>();
        }

        countries.add(theCountry);
    }

    public Criminal(String familyName, String forename, String photoUrl, boolean active, Set<Country> countries,
                    Gender gender, LocalDate dateOfBirth, String alias, int height, ColorOfHair colorOfHair,
                    EyeColor eyeColor, String specialSigns, City placeOfBirth, Set<Nationality> nationalities,
                    Set<Language> languages, City lastPlaceOfResidence, CriminalProfession criminalProfession,
                    String theLatestCriminalCase, CriminalStructure criminalStructure, boolean ifAlive) {
        this.familyName = familyName;
        this.forename = forename;
        this.photoUrl = photoUrl;
        this.active = active;
        this.countries = countries;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.alias = alias;
        this.height = height;
        this.colorOfHair = colorOfHair;
        this.eyeColor = eyeColor;
        this.specialSigns = specialSigns;
        this.placeOfBirth = placeOfBirth;
        this.nationalities = nationalities;
        this.languages = languages;
        this.lastPlaceOfResidence = lastPlaceOfResidence;
        this.criminalProfession = criminalProfession;
        this.theLatestCriminalCase = theLatestCriminalCase;
        this.criminalStructure = criminalStructure;
        this.ifAlive = ifAlive;
    }
}
