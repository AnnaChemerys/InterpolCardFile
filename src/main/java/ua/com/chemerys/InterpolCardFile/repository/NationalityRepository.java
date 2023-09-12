package ua.com.chemerys.InterpolCardFile.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.chemerys.InterpolCardFile.entity.Nationality;

public interface NationalityRepository extends JpaRepository<Nationality, Integer> {
}
