package ua.com.chemerys.InterpolCardFile.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.chemerys.InterpolCardFile.entity.State;

public interface StateRepository extends JpaRepository<State, Integer> {
}
