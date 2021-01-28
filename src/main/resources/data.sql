TRUNCATE TABLE accounts_linked_users, user_account, users RESTART IDENTITY;

insert into users (name, hashed_password, email) values ('betty', 'pw', 'a@aol.com');
insert into users (name, hashed_password, email) values ('sue', 'pw', 'b@aol.com');