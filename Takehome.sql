create database takehome;
use takehome;
create table Product(id bigint primary key,sku varchar(255),name varchar(255),description varchar(255),unitprice float,imageurl blob,unitsinstock int,datecreated datetime,lastupdated datetime,categoryid bigint, foreign key(categoryid) references Productcategory(categoryid));
drop table Product;
insert into Product values(1,"ultramicro","loreal paris","prevents damage hair",100,"https://www.loreal.com/en/",340,'2020-09-01 23:56:25','2022-06-20 12:30:00',78),(2,"ultrachrome","lakme","your beauty partner",1000,"https://www.lakmeindia.com/pages/pre-lipstick-sale?utm_source=google&utm_medium=cpc&utm_campaign=B_Search_Brand_Lakme_16_July_20_Mok&utm_term=lakme&utm_content=611648243707&gclid=Cj0KCQjwxIOXBhCrARIsAL1QFCYrVyBT_6DVIl2a8FJYSYIhMJ6X5VYcqEyZ5RzvBra6a9W9fs6dYKEaAqyTEALw_wcB",840,'2009-01-01 09:20:20','2022-07-20 02:45:00',79);
select * from Product;

create table Productcategory(categoryid bigint primary key,categoryname varchar(255));
insert into Productcategory values(78,"hair care"),(79,"cosmetics");
select * from Productcategory;


