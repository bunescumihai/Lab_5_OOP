create table subcategories(
    subcategory_id serial primary key,
    name varchar(50) unique ,
    category_id int,
    constraint fk_category_id foreign key(category_id) references categories(category_id)
);

