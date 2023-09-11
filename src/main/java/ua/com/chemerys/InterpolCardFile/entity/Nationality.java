package ua.com.chemerys.InterpolCardFile.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

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
}
