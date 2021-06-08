package kz.kaspi.BookStore.model;

import javax.persistence.*;

@Entity
@Table(name = "shipping_address")
public class ShippingAddress {
    @Id

    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String ShippingAddressName;
    private String ShippingAddressStreet1;
    private String ShippingAddressCity;
    private String ShippingAddressCountry;


    @OneToOne
    private Order order;


    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }


    public String getShippingAddressName() {
        return ShippingAddressName;
    }


    public void setShippingAddressName(String shippingAddressName) {
        ShippingAddressName = shippingAddressName;
    }


    public String getShippingAddressStreet1() {
        return ShippingAddressStreet1;
    }


    public void setShippingAddressStreet1(String shippingAddressStreet1) {
        ShippingAddressStreet1 = shippingAddressStreet1;
    }


    public String getShippingAddressCity() {
        return ShippingAddressCity;
    }


    public void setShippingAddressCity(String shippingAddressCity) {
        ShippingAddressCity = shippingAddressCity;
    }


    public String getShippingAddressCountry() {
        return ShippingAddressCountry;
    }


    public void setShippingAddressCountry(String shippingAddressCountry) {
        ShippingAddressCountry = shippingAddressCountry;
    }


    public Order getOrder() {
        return order;
    }


    public void setOrder(Order order) {
        this.order = order;
    }

}
