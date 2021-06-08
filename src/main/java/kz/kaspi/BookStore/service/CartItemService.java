package kz.kaspi.BookStore.service;

import kz.kaspi.BookStore.model.*;

import java.util.List;

public interface CartItemService {
    List<CartItem> findByShoppingCart(ShoppingCart shoppingCart);

    CartItem updateCartItem(CartItem cartItem);

    CartItem addBookToCartItem(Book book, User user, int qty);

    CartItem findById(Long id);

    void removeCartItem(CartItem cartItem);

    CartItem save(CartItem cartItem);

    List<CartItem> findByOrder(Order order);
}
