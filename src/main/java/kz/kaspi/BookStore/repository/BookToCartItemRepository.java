package kz.kaspi.BookStore.repository;

import kz.kaspi.BookStore.model.CartItem;
import kz.kaspi.BookStore.security.BookToCartItem;
import org.springframework.data.repository.CrudRepository;

public interface BookToCartItemRepository extends CrudRepository<BookToCartItem, Long> {
    void deleteByCartItem(CartItem cartItem);
}
