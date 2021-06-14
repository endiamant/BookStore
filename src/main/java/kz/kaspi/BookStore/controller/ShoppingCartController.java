package kz.kaspi.BookStore.controller;


import kz.kaspi.BookStore.model.Book;
import kz.kaspi.BookStore.model.CartItem;
import kz.kaspi.BookStore.model.ShoppingCart;
import kz.kaspi.BookStore.model.User;
import kz.kaspi.BookStore.service.BookService;
import kz.kaspi.BookStore.service.CartItemService;
import kz.kaspi.BookStore.service.ShoppingCartService;
import kz.kaspi.BookStore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.security.Principal;
import java.util.List;

@Controller
@RequestMapping("/")
public class ShoppingCartController {

    @Autowired
    private UserService userService;

    @Autowired
    private CartItemService cartItemService;

    @Autowired
    private BookService bookService;

    @Autowired
    private ShoppingCartService shoppingCartService;

    @RequestMapping("/shoppingCart")
    public String shoppingCart(Model model, Principal principal) {
        User user = userService.findByUsername(principal.getName());
        ShoppingCart shoppingCart = user.getShoppingCart();

        List<CartItem> cartItemList = cartItemService.findByShoppingCart(shoppingCart);

        shoppingCartService.updateShoppingCart(shoppingCart);

        model.addAttribute("cartItemList", cartItemList);
        model.addAttribute("shoppingCart", shoppingCart);

        return "forward:/shoppingCart";
    }

    @RequestMapping("/addItem")
    public String addItem(
            @ModelAttribute("book") Book book,
            @ModelAttribute("qty") Integer qty,
            Model model, Principal principal
    ) {
        User user = userService.findByUsername(principal.getName());
        book = bookService.findOne(book.getId());

        if(qty > book.getInStockNumber()) {
            model.addAttribute("notEnoughStock", true);
            return "forward:/bookDetail?id="+book.getId();
        }

        CartItem cartItem = cartItemService.addBookToCartItem(book, user, qty);
        model.addAttribute("addBookSuccess", true);

        return "forward:/bookDetail?id="+book.getId();
    }

    @RequestMapping("/updateCartItem")
    public String updateshoppingCart(
            @ModelAttribute("id") Long cartItemId,
            @ModelAttribute("qty") int qty
    ) {
        CartItem cartItem = cartItemService.findById(cartItemId);
        cartItem.setQty(qty);
        cartItemService.updateCartItem(cartItem);

        return "forward:/shoppingCart";
    }

    @RequestMapping("/removeItem")
    public String removeItem(@RequestParam("id") Long id) {
        cartItemService.removeCartItem(cartItemService.findById(id));

        return "forward:/cart";
    }
}
