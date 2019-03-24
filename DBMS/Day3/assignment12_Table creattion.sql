
Trainer Table creation:
-----------------------

Create Table Trainer (
TrainerID int,
TrainerName Varchar(250) NOT NULL,
EmailID Varchar(250),
Phone Varchar(15),
primary key(TrainerID),
unique(EmailID)
);

Trainer  data Insertion:
-------------------------

Insert into Trainer values (1, 'Abraham', 't1@i.com','9844499901');
Insert into Trainer values (2, 'Boyce', 't2@i.com','9844499902');
Insert into Trainer values (3, 'Camilla', 't3@i.com','9844499903');
Insert into Trainer values (4, 'Davis', 't4@i.com','9844499904');
Insert into Trainer values (5, 'Elsa', 't5@i.com','9844499905');

Course_Details Table creation:
-----------------------------
Create Table Course_Details (
 CourseID Char(10),
 CourseName Varchar(250) Not Null,
 primary key(CourseID)
);

Course_Details data insertion:
------------------------------

Insert into Course_Details values('GPF', 'Programming Fundamentals');
Insert into Course_Details values('GDB', 'Relational Database Management System');
Insert into Course_Details values('ODB', 'Oracle 9i');
Insert into Course_Details values('OVB', 'Visual Basic');
Insert into Course_Details values('JJA', 'Java');
Insert into Course_Details values('JJE', 'Java JEE1');

Batch_Schedule Table creation:
------------------------------

Create Table Batch_Schedule (
BatchName Varchar(250),
CourseID Char(10),
Start_Date Date Not Null,
End_Date Date Not Null,
Constraint pk_BS Primary Key (BatchName,CourseID),
foreign key(CourseID) references Course_Details(CourseID)
); 

Batch_Schedule Data Insertion:
------------------------------

Insert into Batch_Schedule values ('Batch1', 'GPF','2008-01-10','2008-01-20');
Insert into Batch_Schedule values ('Batch1', 'GDB','2008-01-21','2008-01-31');
Insert into Batch_Schedule values ('Batch1', 'ODB','2008-02-01','2008-02-20');
Insert into Batch_Schedule values ('Batch1', 'OVB','2008-02-21','2008-02-28');
Insert into Batch_Schedule values ('Batch2', 'GPF','2008-01-10','2008-01-20');
Insert into Batch_Schedule values ('Batch3', 'GPF','2008-01-21','2008-02-01');
Insert into Batch_Schedule values ('Batch3', 'JJA','2008-02-02','2008-02-08');
Insert into Batch_Schedule values ('Batch3', 'GDB','2008-02-09','2008-02-20');



FeedBack Table creation:
-------------------------

Create Table FeedBack(
TrainerID int(2),
CourseID Char(10),
BatchName Varchar(250) ,
FBRate double(3,2) Not Null,
Constraint ck_FB_FBRate Check (FBRate between 0 and 5),
Constraint fk_FB_CID_BN Foreign Key (BatchName, CourseID) References Batch_Schedule(BatchName,CourseID),
Constraint pk_FB Primary Key (TrainerID,CourseID,BatchName)
);

FeedBack Data insertion:
-------------------------
Insert into Feedback values (1, 'GPF','Batch1',4.18);
Insert into Feedback values (2, 'GDB','Batch1',4.65);
Insert into Feedback values (3, 'ODB','Batch1',4.51);
Insert into Feedback values (4, 'OVB','Batch1',4.68);
Insert into Feedback values (5, 'GPF','Batch2',4.28);
Insert into Feedback values (1, 'GPF','Batch3',4.28);
Insert into Feedback values (3, 'JJA','Batch3',4.32);
Insert into Feedback values (3, 'GDB','Batch3',4.32);





