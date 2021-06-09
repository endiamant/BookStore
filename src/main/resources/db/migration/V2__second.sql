Create TABLE book
(
    id              serial primary key,
    title           varchar(255) not NULL,
    author          varchar(255) not NULL,
    publisher       varchar(255) not NULL,
    language        varchar(255) not NULL,
    category        varchar(255) not NULL,
);
create table cart_item
(
    id       serial primary key,
    qty      int,
    subTotal decimal
);
create table user_order
(
    id             serial primary key,
    orderDate      DATE,
    shippingDate   DATE,
    shippingMethod DATE,
    orderStatus    varchar(255) not NULL,
    orderTotal     decimal
);
create table shipping_address
(
    id                     serial primary key,
    ShippingAddressName    varchar(255) not NULL,
    ShippingAddressStreet1 varchar(255) not NULL,
    ShippingAddressCity    varchar(255) not NULL,
    ShippingAddressCountry varchar(255) not NULL
);
create table shopping_cart
(
    id         serial primary key,
    grandTotal decimal
);
create table user_shipping
(
    id               serial primary key,
    userShippingName varchar(255) not NULL,
    userShippingStreet1 varchar (255) not NULL,
    userShippingCity varchar (255) not NULL,
    userShippingCountry varchar (255) not NULL,
    userShippingDefault varchar (255) not NULL
);
