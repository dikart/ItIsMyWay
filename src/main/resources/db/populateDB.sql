drop table user_roles;
drop table users;
insert into users(id, name, email, password)
values ((100000, 'admin', 'admin@gmail.com', 'admin'),
        (100001, 'user', 'user@mail.ru', 'user'));
insert into user_roles(user_id, role) values ((100000, 'ROLE_ADMIN'),
                                              (100001, 'ROLE_USER'));