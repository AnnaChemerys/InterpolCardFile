package ua.com.chemerys.InterpolCardFile.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.chemerys.InterpolCardFile.entity.CriminalStructure;

import java.util.List;

public interface CriminalStructureRepository extends JpaRepository<CriminalStructure, Integer> {

    List<CriminalStructure> findCriminalStructureByNameContainingIgnoreCase(String criminalStructureKeyWord);
}
