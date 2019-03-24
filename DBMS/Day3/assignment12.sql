<!-- a. -->

select distinct trainer.TrainerName,  course_details.CourseName from trainer
inner join feedback
on trainer.TrainerID = feedback.TrainerID
inner join course_details
on feedback.CourseID = course_details.CourseID;

<!-- b. -->

select trainer.TrainerName 
from trainer
inner join feedback
on feedback.TrainerID=trainer.TrainerID
group by trainer.TrainerName
having count(distinct feedback.CourseID) > 1;

<!-- c. -->

select  trainer.TrainerName, count(distinct feedback.CourseID) as 'Number of different courses'
from trainer
inner join feedback
on feedback.TrainerID=trainer.TrainerID
group by trainer.TrainerName;

<!-- d. -->

select feedback.TrainerID, trainer.TrainerName, 
count(feedback.BatchName) as 'Number of times course taken', course_details.CourseName
from feedback
inner join course_details
on course_details.CourseID = feedback.CourseID
inner join trainer
on feedback.TrainerID = trainer.TrainerID
group by trainer.TrainerNam;

<!-- e. -->

select BatchName, sum(End_Date-Start_Date) as duration 
from batch_schedule 
group by BatchName

<!-- f. -->

select feedback.TrainerID, trainer.TrainerName, batch_schedule.CourseID, course_details.CourseName, batch_schedule.End_Date
from batch_schedule
inner join feedback 
on batch_schedule.CourseID = feedback.CourseID
inner join trainer on feedback.TrainerID=trainer.TrainerID
inner join course_details on feedback.CourseID=course_details.CourseID
where batch_schedule.End_Date <= '2008-02-20'
order by batch_schedule.End_Date;

 
 <!-- g. -->
 
select trainer.TrainerName, feedback.BatchName
from trainer
inner join feedback
on feedback.TrainerID=trainer.TrainerID
group by trainer.TrainerName
having count(distinct feedback.CourseID) > 1;

<!-- h. -->

select trainer.TrainerName, feedback.CourseID, 
count(distinct feedback.CourseID) as course_count
from trainer
inner join feedback
on feedback.TrainerID=trainer.TrainerID
where feedback.courseID = all (select distinct courseID from course_details)
group by trainer.TrainerName;
