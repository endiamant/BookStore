package kz.kaspi.BookStore.security;

import kz.kaspi.BookStore.model.Book;
import kz.kaspi.BookStore.model.CartItem;

import javax.persistence.*;

@Entity
public class BookToCartItem {

    @Id

    @GeneratedValue(strategy=GenerationType.SEQUENCE)
    private Long id;

    @ManyToOne
    @JoinColumn(name="book_id")
    private Book book;

    @ManyToOne
    @JoinColumn(name="cart_item_id")
    private CartItem cartItem;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public CartItem getCartItem() {
        return cartItem;
    }

    public void setCartItem(CartItem cartItem) {
        this.cartItem = cartItem;
    }
}
