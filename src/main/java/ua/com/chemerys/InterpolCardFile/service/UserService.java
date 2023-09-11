package ua.com.chemerys.InterpolCardFile.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import ua.com.chemerys.InterpolCardFile.entity.User;
import ua.com.chemerys.InterpolCardFile.user.WebUser;

public interface UserService extends UserDetailsService {

    public User findByUserName(String userName);

    void save(WebUser webUser);
}
