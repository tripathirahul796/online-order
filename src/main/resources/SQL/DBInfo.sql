select * from category
select * from product

select * from customer

select * from orders

select * from dbo.parameter

-- Category

insert into category values('Breakfast'),
('Lunch'),('Dinner'), ('Sweets')


-- Product
insert into product values('100','Pizza','Plate',1,1),
--('80','Momos','Plate',1,2),
--('150','Chilli Potato','Plate',1,1),
('160','Veg-Thali','Plate',1,2),
('270','Non-Veg Thali','Plate',1,3),
('20','Rasgulla','Pcs.',1,4)
--('45','Rajbhog','Pcs.',1,4)


--customer

select * from customer
insert into customer values('9120076502','Rahul',5,GETDATE(),GETDATE())
insert into customer values('12345786','DP',6,GETDATE(),GETDATE()),
('123457867','Ragini',8,GETDATE(),GETDATE())


-- Order

select * from orders
insert into orders values(1,1,5, GETDATE(),GETDATE()),
(1,2,7,GETDATE(),GETDATE())

insert into orders values(3,1,6, GETDATE(),GETDATE())

update orders set status=1


