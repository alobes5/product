create table product (
    id identity not null primary key,
    name varchar(50) not null unique,
);

create index idx_name on product(name);