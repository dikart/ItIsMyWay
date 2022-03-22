drop table if exists user_roles;
drop table if exists users;
drop sequence if exists global_seq;

create sequence global_seq start 100000;

create table users
(
    id         integer primary key default nextval('global_seq'),
    name       varchar,
    email      varchar   not null,
    password   varchar   not null,
    registered timestamp not null  default now(),
    enabled    boolean             default true
);
create table user_roles
(
    user_id int,
    role    varchar,
    primary key (user_id, role),
    foreign key (user_id) references users (id)
);