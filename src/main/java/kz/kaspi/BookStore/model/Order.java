package kz.kaspi.BookStore.model;


import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "user_order")
public class Order {
    @Id
    @SequenceGenerator(name = "user_order_id_seq",
            sequenceName = "user_order_id_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "user_order_id_seq")
    @Column(name = "order_id", updatable = false)


    private Long id;
    private Date orderDate;
    private Date shippingDate;
    private String shippingMethod;
    private String orderStatus;
    private BigDecimal orderTotal;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
    private List<CartItem> cartItemList;


    @OneToOne(cascade=CascadeType.ALL)
    private ShippingAddress shippingAddress;



    @ManyToOne
    private User user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getShippingDate() {
        return shippingDate;
    }

    public void setShippingDate(Date shippingDate) {
        this.shippingDate = shippingDate;
    }

    public String getShippingMethod() {
        return shippingMethod;
    }

    public void setShippingMethod(String shippingMethod) {
        this.shippingMethod = shippingMethod;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public BigDecimal getOrderTotal() {
        return orderTotal;
    }

    public void setOrderTotal(BigDecimal orderTotal) {
        this.orderTotal = orderTotal;
    }

    public List<CartItem> getCartItemList() {
        return cartItemList;
    }

    public void setCartItemList(List<CartItem> cartItemList) {
        this.cartItemList = cartItemList;
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public ShippingAddress getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(ShippingAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

}
