package ua.com.chemerys.InterpolCardFile.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import ua.com.chemerys.InterpolCardFile.entity.Country;
import ua.com.chemerys.InterpolCardFile.entity.Criminal;
import ua.com.chemerys.InterpolCardFile.repository.*;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
public class CriminalServiceImpl implements CriminalService {

    private CriminalRepository criminalRepository;

    private CityRepository cityRepository;

    private CountryRepository countryRepository;

    private CriminalStructureRepository criminalStructureRepository;

    private LanguageRepository languageRepository;

    private NationalityRepository nationalityRepository;

    private StateRepository stateRepository;

    @Autowired
    public CriminalServiceImpl(CriminalRepository criminalRepository, CityRepository cityRepository,
                               CountryRepository countryRepository,
                               CriminalStructureRepository criminalStructureRepository,
                               LanguageRepository languageRepository, NationalityRepository nationalityRepository,
                               StateRepository stateRepository) {
        this.criminalRepository = criminalRepository;
        this.cityRepository = cityRepository;
        this.countryRepository = countryRepository;
        this.criminalStructureRepository = criminalStructureRepository;
        this.languageRepository = languageRepository;
        this.nationalityRepository = nationalityRepository;
        this.stateRepository = stateRepository;
    }

    @Override
    public Page<Criminal> findAll(Pageable pageable) {
        return criminalRepository.findAll(pageable);
    }

    @Override
    public Page<Criminal> findByNameKeyword(String keyword, Pageable pageable) {
        return criminalRepository.findCriminalByFamilyNameOrForenameKeyword(keyword, pageable);
    }

    @Override
    public List<Criminal> findAll() {
        return criminalRepository.findAll();
    }

    @Override
    public Criminal findById(int theId) {
        Optional<Criminal> result = criminalRepository.findById(theId);

        Criminal theCriminal = null;

        if (result.isPresent()) {
            theCriminal = result.get();
        }
        else {
            // we didn't find the criminal
            throw new RuntimeException("Did not find criminal id - " + theId);
        }

        return theCriminal;
    }

    @Override
    public void save(Criminal theCriminal) {

        Criminal criminalToAdd;

        criminalToAdd = Criminal.builder()
                .familyName(theCriminal.getFamilyName())
                .forename(theCriminal.getForename())
                .photoUrl(theCriminal.getPhotoUrl())
                .active(theCriminal.isActive())
                .gender(theCriminal.getGender())
                .dateOfBirth(theCriminal.getDateOfBirth())
                .alias(theCriminal.getAlias())
                .height(theCriminal.getHeight())
                .colorOfHair(theCriminal.getColorOfHair())
                .eyeColor(theCriminal.getEyeColor())
                .specialSigns(theCriminal.getSpecialSigns())
                .placeOfBirth(theCriminal.getPlaceOfBirth())
                .lastPlaceOfResidence(theCriminal.getLastPlaceOfResidence())
                .criminalProfession(theCriminal.getCriminalProfession())
                .theLatestCriminalCase(theCriminal.getTheLatestCriminalCase())
                .criminalStructure(theCriminal.getCriminalStructure())
                .ifAlive(theCriminal.isIfAlive())
                .build();

        Set<Country> countries = new LinkedHashSet<>();
        for (Country tempCountry : countries) {

        }

        // assign criminal details to the criminalToAdd object;
        /*
    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {CascadeType.PERSIST, CascadeType.MERGE,
                    CascadeType.DETACH, CascadeType.REFRESH})
    @JoinTable(
            name = "wanted_by_country_criminal",
            joinColumns = @JoinColumn(name = "criminal_wanted_by_country_id"),
            inverseJoinColumns = @JoinColumn(name = "country_id")
    )
    private Set<Country> countries;

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
         */
        criminalRepository.save(theCriminal);
    }

    @Override
    public void update(Criminal theCriminal) {
        Criminal criminalToUpdate = findById(theCriminal.getId());

        if (criminalToUpdate != null) {
            //ToDo
        } else {
            throw new RuntimeException("Did not find criminal with id - " + theCriminal.getId());
        }
    }

    @Override
    public void addToArchive(Criminal theCriminal) {
        Criminal criminalToArchive = findById(theCriminal.getId());

        if (criminalToArchive != null) {
            criminalToArchive.setActive(false);
        } else {
            throw new RuntimeException("Did not find criminal with id - " + theCriminal.getId());
        }
    }

    @Override
    public void deleteById(int theId) {

        if (!findById(theId).isIfAlive()) {
            criminalRepository.deleteById(theId);
        }
    }
}
