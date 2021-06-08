package kz.kaspi.BookStore.service;

import kz.kaspi.BookStore.model.ShippingAddress;
import kz.kaspi.BookStore.model.UserShipping;

public interface ShippingAddressService {
    ShippingAddress setByUserShipping(UserShipping userShipping, ShippingAddress shippingAddress);
}
