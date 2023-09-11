package ua.com.chemerys.InterpolCardFile.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.chemerys.InterpolCardFile.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUserName(String userName);

//    User findByUserName(String userName);
//
//    void save(User theUser);
}
