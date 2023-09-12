package ua.com.chemerys.InterpolCardFile.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.chemerys.InterpolCardFile.entity.Language;

public interface LanguageRepository extends JpaRepository<Language, Integer> {
}
