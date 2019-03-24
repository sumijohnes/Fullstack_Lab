<!-- a. -->

select count(empno), avg(sal) from emp where deptno=20;

<!-- b. -->

select enname,sal, (0.10*sal) as PF from emp;

<!-- c. -->

select enname from emp where sysdate()-hiredate > 25;

<!-- d. -->

select * from emp 
order by sal;

<!-- e. -->

select enname, hiredate from emp 
order by hiredate;

<!-- f. -->

select enname, sal, (0.10*sal) as PF, (0.50*sal) as HRA, (0.30*sal) as DA, 
(sal+ (select PF) + (select HRA) + (select DA))  as gross
from emp
order by gross;

<!-- g. -->
select deptno, count(empno) from emp
group by deptno;

<!-- h. -->

select deptno, sum(sal) from emp
group by deptno;

<!-- i.-->

select job, count(empno) from emp
group by job
order by job desc;

<!-- j.-->

select sum(sal), max(sal), min(sal), avg(sal) from emp
where deptno=20;

<!-- k. -->

select avg(sal),job from emp
where deptno=20 
group by job
having avg(sal) > 1000;


