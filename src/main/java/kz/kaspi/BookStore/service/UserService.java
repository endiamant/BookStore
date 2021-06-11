package kz.kaspi.BookStore.service;


import kz.kaspi.BookStore.model.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    User findByUsername(String username);



    User findById(Long id);

    User save(User user);


}