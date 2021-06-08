package kz.kaspi.BookStore.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "users")
public class User {

    @Id
    @Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String username;
    private String password;
    private boolean enabled;

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(
            name = "user_role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id")
    )
    private Set<Role> roles = new HashSet<>();

    public Long getId() {
        return id;
    }

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "user")
    private ShoppingCart shoppingCart;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "user")
    private List<UserShipping> userShippingList;

    @OneToMany(mappedBy = "user")
    private List<Order> orderList;
    public List<UserShipping> getUserShippingList() {
        return userShippingList;
    }
    public void setUserShippingList(List<UserShipping> userShippingList) {
        this.userShippingList = userShippingList;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }
    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public Set<Role> getRoles() {
        return roles;
    }

    public void setRoles(Set<Role> roles) {
        this.roles = roles;
    }

}