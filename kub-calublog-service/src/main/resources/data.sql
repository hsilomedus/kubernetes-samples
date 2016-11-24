insert into user (name, password) values ('admin','admin');
delete from user where id not in (select min(id) from (select * from user) as u where u.name = 'admin');