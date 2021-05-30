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
    id   serial primary key,
    name integer NOT NULL
);
Create TABLE book
(
    id              serial primary key,
    title           varchar(255) not NULL,
    author          varchar(255) not NULL,
    publisher       varchar(255) not NULL,
    publicationDate varchar(255) not NULL,
    language        varchar(255) not NULL,
    category        varchar(255) not NULL,
    numberOfPages   int
);

