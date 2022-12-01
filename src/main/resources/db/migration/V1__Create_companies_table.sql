create table companies(
                          company_id serial primary key,
                          name varchar(30) not null unique ,
                          link varchar unique
);