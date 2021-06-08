package kz.kaspi.BookStore.service.impl;

import kz.kaspi.BookStore.model.ShippingAddress;
import kz.kaspi.BookStore.model.UserShipping;
import kz.kaspi.BookStore.service.ShippingAddressService;
import org.springframework.stereotype.Service;

@Service
public class ShippingAddressServiceImpl implements ShippingAddressService {
    public ShippingAddress setByUserShipping(UserShipping userShipping, ShippingAddress shippingAddress) {
        shippingAddress.setShippingAddressName(userShipping.getUserShippingName());
        shippingAddress.setShippingAddressStreet1(userShipping.getUserShippingStreet1());
        shippingAddress.setShippingAddressCity(userShipping.getUserShippingCity());
        shippingAddress.setShippingAddressCountry(userShipping.getUserShippingCountry());

return shippingAddress;
    }
}
