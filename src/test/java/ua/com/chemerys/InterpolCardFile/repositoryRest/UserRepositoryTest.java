//package ua.com.chemerys.InterpolCardFile.repositoryRest;
//
//import lombok.Data;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
//import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
//import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
//import org.springframework.test.annotation.Rollback;
//import ua.com.chemerys.InterpolCardFile.entity.Role;
//import ua.com.chemerys.InterpolCardFile.repository.RoleRepository;
//import ua.com.chemerys.InterpolCardFile.repository.UserRepository;
//
//@DataJpaTest
//@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
//@Rollback(value = false)
//public class UserRepositoryTest {
//
//    @Autowired
//    private UserRepository userRepository;
//
//    @Autowired
//    RoleRepository roleRepository;
//
////    @Autowired
////    private TestEntityManager entityManager;
//
//    @Test
//    public void testCreateRoles() {
//        Role roleAdmin = new Role("ADMIN");
//        Role roleVisitor = new Role("VISITOR");
//
//        roleRepository.save(roleAdmin);
//        roleRepository.save(roleVisitor);
//    }
//}
