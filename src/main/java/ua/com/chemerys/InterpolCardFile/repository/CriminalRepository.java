package ua.com.chemerys.InterpolCardFile.repository;

import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ua.com.chemerys.InterpolCardFile.entity.Criminal;

import java.util.List;

public interface CriminalRepository extends JpaRepository<Criminal, Integer> {

    List<Criminal> findCriminalByFamilyNameAndForename(String familyName, String forename);

    List<Criminal> findCriminalByActive(boolean ifActive);

    Page<Criminal> findAll(Pageable pageable);

    //@Query(value = "select c from Criminal c where c.familyName like %:nameKeyword% or c.forename like %:nameKeyword%", nativeQuery = true)
    @Query(value = "select c from Criminal c where c.familyName like %:nameKeyword% or c.forename like %:nameKeyword%")
    Page<Criminal> findCriminalByFamilyNameOrForenameKeyword(@Param("nameKeyword") String nameKeyword, Pageable pageable);

    List<Criminal> findCriminalByAlias(String alias);
}
