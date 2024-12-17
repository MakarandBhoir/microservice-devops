
drop table studentdb.student;
drop table studentdb.studentcourses;

Create Table Student
 (
 	Student_Id Int Primary Key,
 	Student_Name Varchar(35) Not Null,
 	Student_Score numeric Not Null,
 	City Varchar(45) Not Null,
 	State Varchar(45) Not Null,
 	Pin Varchar(10) Not Null
 );
Create Table StudentCourses
(
	Course_Id Int Primary Key,
	Course_Name Varchar(40) Not Null,
	Course_Fees Int Not Null,
	Student_Id Int
);


INSERT INTO Student (Student_Id, Student_Name, Student_Score, City, State, Pin)
VALUES (1, 'Makarand Bhoir', 60, 'Mumbai', 'Maharashtra', '400706');

INSERT INTO Student (Student_Id, Student_Name, Student_Score, City, State, Pin)
VALUES (2, 'Mahesh Shinde', 87, 'Pune', 'Maharashtra', '411224');

INSERT INTO Student (Student_Id, Student_Name, Student_Score, City, State, Pin)
VALUES (3, 'Gaurav Gupta', 50, 'Mumbai', 'Maharashtra', '400059');

INSERT INTO Student (Student_Id, Student_Name, Student_Score, City, State, Pin)
VALUES (4, 'Test', 40, 'Mumbai', 'Maharashtra', '400059');

INSERT INTO StudentCourses(Course_Id, Course_Name, Course_Fees, Student_Id)
VALUES(1111, 'Java', 20000, 1);

INSERT INTO StudentCourses(Course_Id, Course_Name, Course_Fees, Student_Id)
VALUES(1114, 'Azure Developer', 20000, 1);

INSERT INTO StudentCourses(Course_Id, Course_Name, Course_Fees, Student_Id)
VALUES(1112, 'Azure Developer', 25000, 2);

INSERT INTO StudentCourses(Course_Id, Course_Name, Course_Fees, Student_Id)
VALUES(1113, 'AWS Developer', 27000, 3);
