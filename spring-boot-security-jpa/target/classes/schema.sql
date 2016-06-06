
drop database if exists test;

create database if not exists test;

use test;

create table if not exists users(
	id bigint(20) not null auto_increment,
	username varchar(255) not null,
	password varchar(255) not null,
	role varchar(255) not null,
	enabled boolean not null,
	primary key(id)
) engine=InnoDB;