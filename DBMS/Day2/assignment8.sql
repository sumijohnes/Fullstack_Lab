<!-- a. name of analysts and salesmen -->

select enname from emp where job="analyst" OR job="salesman";

<!-- b. -->

select enname from emp where hiredate < '1981-09-30';

<!-- c. -->

select enname from emp where job != 'Manager';

<!-- d. -->

select enname from emp where empno in (7369,7521,7839,7934,7788);

<!-- e. -->

select enname from emp where deptno not in (30,40,10);

<!-- f. -->

select enname from emp where hiredate between '1981-06-30' and '1981-12-31';

<!-- g. -->

select distinct job from emp;

<!-- h. -->

select enname from emp where comm is null;

<!-- i. -->

select enname, job from emp where mgr is null;

<!-- j. -->

select enname from emp where deptno is null;

<!-- k. -->

select enname from emp where comm is not null;

<!-- l. -->

select enname from emp where enname like's%' OR enname like '%s';

<!-- m. -->

select enname from emp where enname like'_i%';

<!-- n. -->

select count(empno) as 'Number of employees' from emp;

<!-- o. -->

select count(distinct job) as 'Number of designations' from emp;

<!-- p. -->

select sum(sal) as 'Total Salary' from emp;

<!-- q. -->

select max(sal), min(sal), avg(sal) from emp;

<!-- r. -->

select max(sal) from emp where job="salesman";





