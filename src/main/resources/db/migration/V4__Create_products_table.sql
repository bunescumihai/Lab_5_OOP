create table products(
    product_id serial primary key,
    name varchar not null unique ,
    company_id int not null,
    category_id int not null,
    subcategory_id int,
    constraint fk_company_id foreign key (company_id) references companies(company_id),
    constraint fk_category_id foreign key (category_id) references categories(category_id),
    constraint fk_subategory_id foreign key (subcategory_id) references subcategories(subcategory_id),
    price float4 not null,
    color varchar(20),
    weight int,
    guarantee int
);