package ua.com.chemerys.InterpolCardFile.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import ua.com.chemerys.InterpolCardFile.entity.Criminal;

import java.util.List;
import java.util.Optional;

public interface CriminalService {

    Page<Criminal> findAll(Pageable pageable);

    List<Criminal> findAll();

    Page<Criminal> findByNameKeyword(String keyword, Pageable pageable);

    Criminal findById(int theId);

    void save(Criminal theCriminal);

    void update(Criminal criminal);

    void addToArchive(Criminal criminal);

    void deleteById(int theId);
}
