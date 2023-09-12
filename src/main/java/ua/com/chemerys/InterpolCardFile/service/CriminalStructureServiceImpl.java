package ua.com.chemerys.InterpolCardFile.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import ua.com.chemerys.InterpolCardFile.entity.Criminal;
import ua.com.chemerys.InterpolCardFile.entity.CriminalStructure;
import ua.com.chemerys.InterpolCardFile.repository.CriminalRepository;
import ua.com.chemerys.InterpolCardFile.repository.CriminalStructureRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CriminalStructureServiceImpl implements CriminalStructureService {

    private CriminalStructureRepository criminalStructureRepository;

    @Autowired
    public CriminalStructureServiceImpl(CriminalStructureRepository theCriminalStructureRepository) {
        criminalStructureRepository = theCriminalStructureRepository;
    }

    @Override
    public List<CriminalStructure> findByNameKeyword(String keyword) {
        return criminalStructureRepository.findCriminalStructureByNameContainingIgnoreCase(keyword);
    }

    @Override
    public List<CriminalStructure> findAll() {
        return criminalStructureRepository.findAll();
    }

    @Override
    public CriminalStructure findById(int theId) {
        Optional<CriminalStructure> result = criminalStructureRepository.findById(theId);

        CriminalStructure theCriminalStructure = null;

        if (result.isPresent()) {
            theCriminalStructure = result.get();
        }
        else {
            // we didn't find the criminal
            throw new RuntimeException("Did not find criminal structure id - " + theId);
        }

        return theCriminalStructure;
    }

    @Override
    public void save(CriminalStructure theCriminalStructure) {
        criminalStructureRepository.save(theCriminalStructure);
    }

    @Override
    public void update(CriminalStructure theCriminalStructure) {

    }

    @Override
    public void deleteById(int theId) {
        criminalStructureRepository.deleteById(theId);
    }
}
