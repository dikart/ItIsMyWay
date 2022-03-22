delete from user_roles;
delete from users;
alter sequence global_seq restart with 100000;
insert into users(name, email, password)
values ('admin', 'admin@gmail.com', 'admin'),
        ('user', 'user@mail.ru', 'user');
insert into user_roles(user_id, role) values (100000, 'ROLE_ADMIN'),
                                              (100001, 'ROLE_USER');