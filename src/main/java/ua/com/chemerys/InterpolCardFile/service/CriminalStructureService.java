package ua.com.chemerys.InterpolCardFile.service;

import ua.com.chemerys.InterpolCardFile.entity.CriminalStructure;

import java.util.List;

public interface CriminalStructureService {

    List<CriminalStructure> findAll();

    List<CriminalStructure> findByNameKeyword(String keyword);

    CriminalStructure findById(int theId);

    void save(CriminalStructure theCriminalStructure);

    void update(CriminalStructure theCriminalStructure);

    void deleteById(int theId);
}
