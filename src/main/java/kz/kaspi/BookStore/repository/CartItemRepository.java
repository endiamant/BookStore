package kz.kaspi.BookStore.repository;

import kz.kaspi.BookStore.model.CartItem;
import kz.kaspi.BookStore.model.Order;
import kz.kaspi.BookStore.model.ShoppingCart;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CartItemRepository extends CrudRepository<CartItem,Long> {
    List<CartItem> findByShoppingCart(ShoppingCart shoppingCart);

    List<CartItem> findByOrder(Order order);
}
