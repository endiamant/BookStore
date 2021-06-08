package kz.kaspi.BookStore.model;


import javax.persistence.*;

@Entity
@Table(name = "user_shipping")
public class UserShipping {
    @Id

    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String userShippingName;
    private String userShippingStreet1;
    private String userShippingCity;
    private String userShippingCountry;
    private boolean userShippingDefault;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserShippingName() {
        return userShippingName;
    }

    public void setUserShippingName(String userShippingName) {
        this.userShippingName = userShippingName;
    }

    public String getUserShippingStreet1() {
        return userShippingStreet1;
    }

    public void setUserShippingStreet1(String userShippingStreet1) {
        this.userShippingStreet1 = userShippingStreet1;
    }

    public String getUserShippingCity() {
        return userShippingCity;
    }

    public void setUserShippingCity(String userShippingCity) {
        this.userShippingCity = userShippingCity;
    }

    public String getUserShippingCountry() {
        return userShippingCountry;
    }

    public void setUserShippingCountry(String userShippingCountry) {
        this.userShippingCountry = userShippingCountry;
    }

    public User getUser() {
        return user;
    }


    public void setUser(User user) {
        this.user = user;
    }
    public boolean isUserShippingDefault() {
        return userShippingDefault;
    }


    public void setUserShippingDefault(boolean userShippingDefault) {
        this.userShippingDefault = userShippingDefault;
    }


}
