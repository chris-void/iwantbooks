create database books;

use books;

create table user_table
(
   user_id int auto_increment,
  user_name varchar(30) not null,
   user_pass varchar(16) not null,
  user_type int,
   user_mail varchar(30),
   user_phone varchar(20),
   user_qq   varchar(15),
   primary key(user_id),
   unique key(user_name)
);

create table book_table
(
   book_id int auto_increment,
   book_name varchar(50) not null,
   book_num  varchar(50) not null,
   book_kind varchar(50) not null,
   book_price varchar(50) not null,
   book_selluser varchar(50) not null,
   book_imgpath varchar(100) not null,
   primary key(book_id)
);

