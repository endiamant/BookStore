package kz.kaspi.BookStore.service.impl;

import kz.kaspi.BookStore.model.UserShipping;
import kz.kaspi.BookStore.repository.UserShippingRepository;
import kz.kaspi.BookStore.service.UserShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserShippingServiceImpl  implements UserShippingService {

    @Autowired
    private UserShippingRepository userShippingRepository;
    public UserShipping findById(Long id) {
        return userShippingRepository.findById(id).get();
    }
    public void removeById(Long id){
        userShippingRepository.deleteById(id);
    }
}
