package kz.kaspi.BookStore.repository;

import kz.kaspi.BookStore.model.BookToCartItem;
import kz.kaspi.BookStore.model.CartItem;
import org.springframework.data.repository.CrudRepository;

public interface BookToCartItemRepository extends CrudRepository<BookToCartItem, Long> {
    void deleteByCartItem(CartItem cartItem);
}
