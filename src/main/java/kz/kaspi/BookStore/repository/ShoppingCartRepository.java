package kz.kaspi.BookStore.repository;

import kz.kaspi.BookStore.model.ShoppingCart;
import org.springframework.data.repository.CrudRepository;

public interface ShoppingCartRepository extends CrudRepository<ShoppingCart,Long> {
}
