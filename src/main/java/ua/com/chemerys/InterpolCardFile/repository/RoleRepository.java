package ua.com.chemerys.InterpolCardFile.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.com.chemerys.InterpolCardFile.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Role findByName(String roleAgent);

//    public Role findRoleByName(String theRoleName);
}
