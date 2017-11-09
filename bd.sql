create database file_upload;

use file_upload;

create table documents(
	id int primary key auto_increment,
    type VARCHAR(100),
    name VARCHAR(100),
    description VARCHAR(255),
    content LONGBLOB
);