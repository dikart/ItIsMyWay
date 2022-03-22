create table if not exists users
(
    id       serial primary key,
    name     varchar,
    email    varchar not null unique,
    password varchar not null
);
create table if not exists user_roles
(
    user_id int,
    role    varchar,
    primary key (user_id, role),
    foreign key (user_id) references users (id)
);