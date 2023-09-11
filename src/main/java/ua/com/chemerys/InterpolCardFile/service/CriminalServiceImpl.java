package ua.com.chemerys.InterpolCardFile.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import ua.com.chemerys.InterpolCardFile.entity.Criminal;
import ua.com.chemerys.InterpolCardFile.repository.CriminalRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CriminalServiceImpl implements CriminalService {

    private CriminalRepository criminalRepository;

    @Autowired
    public CriminalServiceImpl(CriminalRepository theCriminalRepository) {
        criminalRepository = theCriminalRepository;
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
        criminalRepository.save(theCriminal);
    }

    @Override
    public void update(Criminal criminal) {
        
    }

    @Override
    public void deleteById(int theId) {
        criminalRepository.deleteById(theId);
    }
}
