package kz.kaspi.BookStore.service;

import kz.kaspi.BookStore.model.User;
import kz.kaspi.BookStore.web.dto.UserRegistrationDto;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {
    User findByEmail(String email);
    User save(UserRegistrationDto registrationDto);
}
