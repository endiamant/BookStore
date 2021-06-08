package kz.kaspi.BookStore.service.impl;

import kz.kaspi.BookStore.model.*;
import kz.kaspi.BookStore.repository.OrderRepository;
import kz.kaspi.BookStore.service.CartItemService;
import kz.kaspi.BookStore.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CartItemService cartItemService;

    public synchronized Order createOrder(ShoppingCart shoppingCart,
                                          ShippingAddress shippingAddress,
                                          User user) {
        Order order = new Order();

        order.setOrderStatus("created");

        order.setShippingAddress(shippingAddress);


        List<CartItem> cartItemList = cartItemService.findByShoppingCart(shoppingCart);

        for(CartItem cartItem : cartItemList) {
            Book book = cartItem.getBook();
            cartItem.setOrder(order);
            book.setInStockNumber(book.getInStockNumber() - cartItem.getQty());
        }

        order.setCartItemList(cartItemList);
        order.setOrderDate(Calendar.getInstance().getTime());
        order.setOrderTotal(shoppingCart.getGrandTotal());
        shippingAddress.setOrder(order);
        order.setUser(user);
        order = orderRepository.save(order);

        return order;
    }

    public Order findOne(Long id) {
        return orderRepository.findById(id).get();
    }
}

