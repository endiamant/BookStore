package kz.kaspi.BookStore.service.impl;

import kz.kaspi.BookStore.model.User;
import kz.kaspi.BookStore.repository.UserRepository;
import kz.kaspi.BookStore.repository.UserShippingRepository;
import kz.kaspi.BookStore.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private static final Logger LOG = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserRepository userRepository;


    @Autowired
    private UserShippingRepository userShippingRepository;


    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username);
    }


    @Override
    public User findById(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }


}
