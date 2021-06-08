package kz.kaspi.BookStore.service;

import kz.kaspi.BookStore.model.ShoppingCart;

public interface ShoppingCartService {

    ShoppingCart updateShoppingCart(ShoppingCart shoppingCart);
    void clearShoppingCart(ShoppingCart shoppingCart);
}
