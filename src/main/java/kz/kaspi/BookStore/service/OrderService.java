package kz.kaspi.BookStore.service;

import kz.kaspi.BookStore.model.Order;
import kz.kaspi.BookStore.model.ShippingAddress;
import kz.kaspi.BookStore.model.ShoppingCart;
import kz.kaspi.BookStore.model.User;

public interface OrderService {
    Order createOrder(ShoppingCart shoppingCart,
                      ShippingAddress shippingAddress,
                      User user);

    Order findOne(Long id);
}
