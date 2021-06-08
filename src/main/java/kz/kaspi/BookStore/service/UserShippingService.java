package kz.kaspi.BookStore.service;

import kz.kaspi.BookStore.model.UserShipping;

public interface UserShippingService {
    UserShipping findById(Long id);
    void removeById(Long id);
}
