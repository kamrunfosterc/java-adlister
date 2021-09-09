#TODO walke through

# create database if not exists adlister_db;
# use adlister_db;
#
# drop table if exists ads;
# drop table if exists users;
#
# CREATE TABLE users
# (
#     id INT UNSIGNED NOT NULL AUTO_INCREMENT,
#     email VARCHAR(200) not null,
#     password VARCHAR(200) not null,
#     username varchar(100),
#     PRIMARY KEY (id)
# );
#
#
# CREATE TABLE ads
# (
#     id INT UNSIGNED NOT NULL AUTO_INCREMENT,
#     title VARCHAR(200) not null,
#     description text not null,
#     user_id int unsigned,
#     PRIMARY KEY (id),
#     FOREIGN KEY (user_id) references users(id)
#         on delete cascade #deletes ads user created if deleted
# );
