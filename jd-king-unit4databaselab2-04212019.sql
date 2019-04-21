Use wiit_database_programming
CREATE TABLE Store
(column_store_ID int,
column_Phone int,
column_Name varchar (20),
column_Email varchar (20),
column_address_ID varchar (20),
column_Manager varchar (20),
);
CREATE TABLE Barista
(column_ID int,
column_FirstName varchar(10),
column_LastName varchar(15),
column_Badge varchar (20),
column_store_ID int
);
CREATE TABLE Adresses
(column_ID int,
 column_Address varchar (25),
 column_City varchar (20),
 column_State varchar(15),
 Column_Zip int
 );
 CREATE TABLE Person
 (column_ID int,
 column_Name varchar (20),
 column_address_ID int,
 column_Phone int,
 column_Email varchar (20)
 );
 CREATE TABLE Rewards_Account
 (column_ID int,
 column_Balance int
 );
 CREATE TABLE Customer_Favorites
 (column_person_ID int,
column_product_ID int,
column_Cream varchar (5),
column_Sugar varchar(5)
);
CREATE TABLE Transaction_Master
(column_trans_ID int,
column_person_ID int,
column_dateTime int,
column_store_ID int,
column_Register int,
column_Clerk varchar (20),
column_PayType varchar (10)
);
CREATE TABLE Transaction_Product
(column_trans_ID int,
column_product_ID int,
column_Quantity int,
column_Price int
);
CREATE TABLE Transaction_Reward
(column_trans_ID int,
column_person_ID int,
column_Reward varchar (20)
);
CREATE TABLE Product
(column_ID int,
columnn_Description varchar (20),
column_current_price int,
column_reward_factor varchar (20),
column_OnHand varchar (5),
column_reorder_pt varchar (10),
colum_reorder_qty int,
column_UnitOfMeasure varchar(20)
);
CREATE TABLE Product_Supplier
(column_prod_ID int,
column_Supp_ID int,
column_Cost int,
column_Days int
);
CREATE TABLE Supplier
(column_ID int,
column_add_ID int,
column_Phone int,
column_Email varchar(20)
);

