CREATE TABLE role
(
    id   serial primary key,
    name varchar(255) not NULL
);

CREATE TABLE purchaser
(
    id         serial primary key,
    email      varchar(255) not NULL,
    first_name varchar(255) not NULL,
    last_name  varchar(255) not NULL,
    password   varchar(255) not NULL
);
CREATE TABLE users_roles_23
(
    user_id serial primary key,
    role_id integer NOT NULL
);
CREATE table roles_priveleges
(
    id serial primary key,
    name integer NOT NULL
);


