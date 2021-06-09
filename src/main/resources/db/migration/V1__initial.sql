CREATE TABLE users
(
    user_id   serial primary key,
    email     varchar(255) NOT NULL,
    full_name varchar(225) NOT NULL,
    username varchar(225) NOT NULL,
    password  varchar(225) NOT NULL,
    enabled   int
);

CREATE TABLE role
(
    role_id serial primary key,
    role    varchar(255) not NULL
);

create table user_role
(
    user_id serial primary key,
    role_id serial
);
