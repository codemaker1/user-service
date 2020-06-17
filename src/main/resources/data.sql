CREATE DATABASE  IF NOT EXISTS `User_detail`;
USE `User_detail`;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `User`;



Create Table User(
     id int NOT NULL,
     name varchar(255),
     age int,
     email varchar(255),
     PRIMARY KEY(id)
);

Insert into User(id,name,age, email)
 values(1,'ishu',27,'ishugarg34@gmail.com');
 Insert into User(id,name,age, email)
 values(2,'paras',26,'geni@gmail.com');
 Insert into User(id,name,age, email)
 values(3,'rahul',26,'dubey@gmail.com');
 
 

 