package kz.kaspi.BookStore.repository;

import kz.kaspi.BookStore.model.Order;
import org.springframework.data.repository.CrudRepository;

public interface OrderRepository extends CrudRepository<Order, Long> {
}
